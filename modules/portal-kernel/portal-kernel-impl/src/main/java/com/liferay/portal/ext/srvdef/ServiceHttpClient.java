package com.liferay.portal.ext.srvdef;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import javax.net.SocketFactory;
import javax.portlet.PortletRequest;
import javax.servlet.http.Cookie;

import org.apache.commons.httpclient.ConnectTimeoutException;
import org.apache.commons.httpclient.Credentials;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HostConfiguration;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpConnectionManager;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.HttpState;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.URI;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthPolicy;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.cookie.CookiePolicy;
import org.apache.commons.httpclient.methods.DeleteMethod;
import org.apache.commons.httpclient.methods.EntityEnclosingMethod;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.HeadMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.PutMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.commons.httpclient.methods.multipart.Part;
import org.apache.commons.httpclient.methods.multipart.StringPart;
import org.apache.commons.httpclient.params.HostParams;
import org.apache.commons.httpclient.params.HttpClientParams;
import org.apache.commons.httpclient.params.HttpConnectionManagerParams;
import org.apache.commons.httpclient.params.HttpConnectionParams;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.commons.httpclient.protocol.DefaultProtocolSocketFactory;
import org.apache.commons.httpclient.protocol.Protocol;

import com.liferay.portal.ext.model.ServiceHost;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.HttpHeaders;
import com.liferay.portal.kernel.upload.ProgressInputStream;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Http;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

public class ServiceHttpClient {

	public ServiceHttpClient(ServiceHost host) {
		this._host = host;

		// Override the default protocol socket factory because it uses
		// reflection for JDK 1.4 compatibility, which we do not need. It also
		// attemps to create a new socket in a different thread so that we
		// cannot track which class loader initiated the call.

		Protocol protocol = new Protocol("http", new FastProtocolSocketFactory(), 80);

		Protocol.registerProtocol("http", protocol);

		// Mimic behavior found in
		// http://java.sun.com/j2se/1.5.0/docs/guide/net/properties.html

		MultiThreadedHttpConnectionManager httpConnectionManager = new MultiThreadedHttpConnectionManager();

		HttpConnectionManagerParams httpConnectionManagerParams = httpConnectionManager.getParams();

		httpConnectionManagerParams.setConnectionTimeout(_TIMEOUT);
		httpConnectionManagerParams.setDefaultMaxConnectionsPerHost(new Integer(_MAX_CONNECTIONS_PER_HOST));
		httpConnectionManagerParams.setMaxTotalConnections(new Integer(_MAX_TOTAL_CONNECTIONS));
		httpConnectionManagerParams.setSoTimeout(_TIMEOUT);

		_httpClient.setHttpConnectionManager(httpConnectionManager);
		_proxyHttpClient.setHttpConnectionManager(httpConnectionManager);

		if (!hasProxyConfig() || Validator.isNull(_host.getProxyUserName())) {
			return;
		}

		List<String> authPrefs = new ArrayList<String>();

		if (("username-password").equals(_host.getProxyAuthType())) {
			_proxyCredentials = new UsernamePasswordCredentials(_host.getProxyUserName(), _host.getProxyPassword());

			authPrefs.add(AuthPolicy.BASIC);
			authPrefs.add(AuthPolicy.DIGEST);
			authPrefs.add(AuthPolicy.NTLM);
		}
		/**
		 * else if (_PROXY_AUTH_TYPE.equals("ntlm")) { _proxyCredentials = new
		 * NTCredentials( _PROXY_USERNAME, _PROXY_PASSWORD, _PROXY_NTLM_HOST,
		 * _PROXY_NTLM_DOMAIN);
		 * 
		 * authPrefs.add(AuthPolicy.NTLM); authPrefs.add(AuthPolicy.BASIC);
		 * authPrefs.add(AuthPolicy.DIGEST); }
		 */

		HttpClientParams httpClientParams = _proxyHttpClient.getParams();
		httpClientParams.setParameter(AuthPolicy.AUTH_SCHEME_PRIORITY, authPrefs);
	}

	private boolean hasProxyConfig() {
		if (Validator.isNotNull(_host.getProxyHost()) && (_host.getProxyPort() > 0)) {
			return true;
		}

		return false;
	}

	protected boolean hasRequestHeader(HttpMethod httpMethod, String name) {
		Header[] headers = httpMethod.getRequestHeaders(name);

		if (headers.length == 0) {
			return false;
		}

		return true;
	}

	public HttpClient getClient(HostConfiguration hostConfiguration) {
		return _httpClient;
	}

	protected void processPostMethod(PostMethod postMethod, List<Http.FilePart> fileParts, Map<String, String> parts) {

		if ((fileParts == null) || fileParts.isEmpty()) {
			if (parts != null) {
				for (Map.Entry<String, String> entry : parts.entrySet()) {
					String value = entry.getValue();

					if (value != null) {
						postMethod.addParameter(entry.getKey(), value);
					}
				}
			}
		} else {
			List<Part> partsList = new ArrayList<Part>();

			if (parts != null) {
				for (Map.Entry<String, String> entry : parts.entrySet()) {
					String value = entry.getValue();

					if (value != null) {
						StringPart stringPart = new StringPart(entry.getKey(), value);

						partsList.add(stringPart);
					}
				}
			}

			for (Http.FilePart filePart : fileParts) {
				// partsList.add(toCommonsFilePart(filePart));
			}

			MultipartRequestEntity multipartRequestEntity = new MultipartRequestEntity(
					partsList.toArray(new Part[partsList.size()]), postMethod.getParams());

			postMethod.setRequestEntity(multipartRequestEntity);
		}
	}

	protected org.apache.commons.httpclient.Cookie toCommonsCookie(Cookie cookie) {

		org.apache.commons.httpclient.Cookie commonsCookie = new org.apache.commons.httpclient.Cookie(
				cookie.getDomain(), cookie.getName(), cookie.getValue(), cookie.getPath(), cookie.getMaxAge(),
				cookie.getSecure());

		commonsCookie.setVersion(cookie.getVersion());

		return commonsCookie;
	}

	protected org.apache.commons.httpclient.Cookie[] toCommonsCookies(Cookie[] cookies) {

		if (cookies == null) {
			return null;
		}

		org.apache.commons.httpclient.Cookie[] commonCookies = new org.apache.commons.httpclient.Cookie[cookies.length];

		for (int i = 0; i < cookies.length; i++) {
			commonCookies[i] = toCommonsCookie(cookies[i]);
		}

		return commonCookies;
	}

	protected Cookie toServletCookie(org.apache.commons.httpclient.Cookie commonsCookie) {

		Cookie cookie = new Cookie(commonsCookie.getName(), commonsCookie.getValue());

		if (!_host.getSessionCookieUseFullHostName()) {
			String domain = commonsCookie.getDomain();

			if (Validator.isNotNull(domain)) {
				cookie.setDomain(domain);
			}
		}

		Date expiryDate = commonsCookie.getExpiryDate();

		if (expiryDate != null) {
			int maxAge = (int) (expiryDate.getTime() - System.currentTimeMillis());

			maxAge = maxAge / 1000;

			if (maxAge > -1) {
				cookie.setMaxAge(maxAge);
			}
		}

		String path = commonsCookie.getPath();

		if (Validator.isNotNull(path)) {
			cookie.setPath(path);
		}

		cookie.setSecure(commonsCookie.getSecure());
		cookie.setVersion(commonsCookie.getVersion());

		return cookie;
	}

	protected Cookie[] toServletCookies(org.apache.commons.httpclient.Cookie[] commonsCookies) {

		if (commonsCookies == null) {
			return null;
		}

		Cookie[] cookies = new Cookie[commonsCookies.length];

		for (int i = 0; i < commonsCookies.length; i++) {
			cookies[i] = toServletCookie(commonsCookies[i]);
		}

		return cookies;
	}

	public void proxifyState(HttpState httpState, HostConfiguration hostConfiguration) {

		Credentials proxyCredentials = _proxyCredentials;

		if (hasProxyConfig() && (proxyCredentials != null)) {
			AuthScope scope = new AuthScope(_host.getProxyHost(), _host.getProxyPort(), null);
			httpState.setProxyCredentials(scope, proxyCredentials);
		}
	}

	public HostConfiguration getHostConfiguration() throws IOException {

		String location = _host.getAddress();

		if (!location.startsWith(Http.HTTP_WITH_SLASH) && !location.startsWith(Http.HTTPS_WITH_SLASH)) {

			if (("http").equals(_host.getProtocol())) {
				location = Http.HTTP_WITH_SLASH + location;
			} else {
				location = Http.HTTPS_WITH_SLASH + location;
			}
		}

		if (_log.isDebugEnabled()) {
			_log.debug("Location is " + location);
		}

		HostConfiguration hostConfiguration = new HostConfiguration();

		hostConfiguration.setHost(new URI(location, false));

		if (hasProxyConfig()) {
			hostConfiguration.setProxy(_host.getProxyHost(), _host.getProxyPort());
		}

		HttpConnectionManager httpConnectionManager = _httpClient.getHttpConnectionManager();

		HttpConnectionManagerParams httpConnectionManagerParams = httpConnectionManager.getParams();

		int defaultMaxConnectionsPerHost = httpConnectionManagerParams.getMaxConnectionsPerHost(hostConfiguration);

		int maxConnectionsPerHost = _host.getMaxConnectionsPerHost();

		if ((maxConnectionsPerHost > 0) && (maxConnectionsPerHost != defaultMaxConnectionsPerHost)) {

			httpConnectionManagerParams.setMaxConnectionsPerHost(hostConfiguration, maxConnectionsPerHost);
		}

		int timeout = _host.getTimeout();

		if (timeout > 0) {
			HostParams hostParams = hostConfiguration.getParams();

			hostParams.setIntParameter(HttpConnectionParams.CONNECTION_TIMEOUT, timeout);
			hostParams.setIntParameter(HttpConnectionParams.SO_TIMEOUT, timeout);
		}

		return hostConfiguration;
	}

	public byte[] URLtoByteArray(Http.Options options) throws IOException {
		return URLtoByteArray(options.getLocation(), options.getMethod(), options.getHeaders(), options.getCookies(),
				options.getAuth(), options.getBody(), options.getFileParts(), options.getParts(),
				options.getResponse(), options.isFollowRedirects(), options.getProgressId(),
				options.getPortletRequest());
	}

	public byte[] URLtoByteArray(String location) throws IOException {
		Http.Options options = new Http.Options();

		options.setLocation(location);

		return URLtoByteArray(options);
	}

	public byte[] URLtoByteArray(String location, boolean post) throws IOException {

		Http.Options options = new Http.Options();

		options.setLocation(location);
		options.setPost(post);
		return URLtoByteArray(options);
	}

	public String URLtoString(Http.Options options) throws IOException {
		return new String(URLtoByteArray(options));
	}

	public String URLtoString(String location) throws IOException {
		return new String(URLtoByteArray(location));
	}

	public String URLtoString(String location, boolean post) throws IOException {

		return new String(URLtoByteArray(location, post));
	}

	protected byte[] URLtoByteArray(String location, Http.Method method, Map<String, String> headers, Cookie[] cookies,
			Http.Auth auth, Http.Body body, List<Http.FilePart> fileParts, Map<String, String> parts,
			Http.Response response, boolean followRedirects, String progressId, PortletRequest portletRequest)
			throws IOException {

		byte[] bytes = null;

		HttpMethod httpMethod = null;
		HttpState httpState = null;

		try {
			_cookies.set(null);

			if (location == null) {
				return null;
			} else if (!location.startsWith(Http.HTTP_WITH_SLASH) && !location.startsWith(Http.HTTPS_WITH_SLASH)) {

				location = Http.HTTP_WITH_SLASH + location;
			}

			HostConfiguration hostConfiguration = getHostConfiguration();

			HttpClient httpClient = getClient(hostConfiguration);

			if (method.equals(Http.Method.POST) || method.equals(Http.Method.PUT)) {

				if (method.equals(Http.Method.POST)) {
					httpMethod = new PostMethod(location);
				} else {
					httpMethod = new PutMethod(location);
				}

				if (body != null) {
					RequestEntity requestEntity = new StringRequestEntity(body.getContent(), body.getContentType(),
							body.getCharset());

					EntityEnclosingMethod entityEnclosingMethod = (EntityEnclosingMethod) httpMethod;

					entityEnclosingMethod.setRequestEntity(requestEntity);
				} else if (method.equals(Http.Method.POST)) {
					PostMethod postMethod = (PostMethod) httpMethod;

					if (!hasRequestHeader(postMethod, HttpHeaders.CONTENT_TYPE)) {

						HttpClientParams httpClientParams = httpClient.getParams();

						httpClientParams.setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, StringPool.UTF8);
					}

					processPostMethod(postMethod, fileParts, parts);
				}
			} else if (method.equals(Http.Method.DELETE)) {
				httpMethod = new DeleteMethod(location);
			} else if (method.equals(Http.Method.HEAD)) {
				httpMethod = new HeadMethod(location);
			} else {
				httpMethod = new GetMethod(location);
				if (parts!=null) {
					List<NameValuePair> queryPairs = new ArrayList<NameValuePair>();
					
					for (Map.Entry<String, String> entry : parts.entrySet()) {
						NameValuePair nvp = new NameValuePair();
						nvp.setName(entry.getKey());
						nvp.setValue(entry.getValue());
						queryPairs.add(nvp);
					}
					
					httpMethod.setQueryString(queryPairs.toArray(new NameValuePair[0]));
				}
			}

			if (headers != null) {
				for (Map.Entry<String, String> header : headers.entrySet()) {
					httpMethod.addRequestHeader(header.getKey(), header.getValue());
				}
			}

			if ((method.equals(Http.Method.POST) || method.equals(Http.Method.PUT))
					&& ((body != null) || ((fileParts != null) && !fileParts.isEmpty()) || ((parts != null) && !parts
							.isEmpty()))) {
			} else if (!hasRequestHeader(httpMethod, HttpHeaders.CONTENT_TYPE)) {
				httpMethod.addRequestHeader(HttpHeaders.CONTENT_TYPE,
						ContentTypes.APPLICATION_X_WWW_FORM_URLENCODED_UTF8);
			}

			if (!hasRequestHeader(httpMethod, HttpHeaders.USER_AGENT)) {
				httpMethod.addRequestHeader(HttpHeaders.USER_AGENT, _DEFAULT_USER_AGENT);
			}

			httpState = new HttpState();

			if (ArrayUtil.isNotEmpty(cookies)) {
				org.apache.commons.httpclient.Cookie[] commonsCookies = toCommonsCookies(cookies);

				httpState.addCookies(commonsCookies);

				HttpMethodParams httpMethodParams = httpMethod.getParams();

				httpMethodParams.setCookiePolicy(CookiePolicy.BROWSER_COMPATIBILITY);
			}

			if (auth != null) {
				httpMethod.setDoAuthentication(true);

				httpState.setCredentials(new AuthScope(auth.getHost(), auth.getPort(), auth.getRealm()),
						new UsernamePasswordCredentials(auth.getUsername(), auth.getPassword()));
			}

			proxifyState(httpState, hostConfiguration);

			int responseCode = httpClient.executeMethod(hostConfiguration, httpMethod, httpState);

			response.setResponseCode(responseCode);

			Header locationHeader = httpMethod.getResponseHeader("location");

			if ((locationHeader != null) && !locationHeader.equals(location)) {
				String redirect = locationHeader.getValue();

				if (followRedirects) {
					return URLtoByteArray(redirect, Http.Method.GET, headers, cookies, auth, body, fileParts, parts,
							response, followRedirects, progressId, portletRequest);
				} else {
					response.setRedirect(redirect);
				}
			}

			InputStream inputStream = httpMethod.getResponseBodyAsStream();

			if (inputStream != null) {
				int contentLength = 0;

				Header contentLengthHeader = httpMethod.getResponseHeader(HttpHeaders.CONTENT_LENGTH);

				if (contentLengthHeader != null) {
					contentLength = GetterUtil.getInteger(contentLengthHeader.getValue());

					response.setContentLength(contentLength);
				}

				Header contentType = httpMethod.getResponseHeader(HttpHeaders.CONTENT_TYPE);

				if (contentType != null) {
					response.setContentType(contentType.getValue());
				}

				if (Validator.isNotNull(progressId) && (portletRequest != null)) {

					ProgressInputStream progressInputStream = new ProgressInputStream(portletRequest, inputStream,
							contentLength, progressId);

					UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream(
							contentLength);

					try {
						progressInputStream.readAll(unsyncByteArrayOutputStream);
					} finally {
						progressInputStream.clearProgress();
					}

					bytes = unsyncByteArrayOutputStream.unsafeGetByteArray();

					unsyncByteArrayOutputStream.close();
				} else {
					bytes = FileUtil.getBytes(inputStream);
				}
			}

			for (Header header : httpMethod.getResponseHeaders()) {
				response.addHeader(header.getName(), header.getValue());
			}

			return bytes;
		} finally {
			try {
				if (httpState != null) {
					_cookies.set(toServletCookies(httpState.getCookies()));
				}
			} catch (Exception e) {
				_log.error(e, e);
			}

			try {
				if (httpMethod != null) {
					httpMethod.releaseConnection();
				}
			} catch (Exception e) {
				_log.error(e, e);
			}
		}
	}

	private static final String _DEFAULT_USER_AGENT = "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1)";
	private static ThreadLocal<Cookie[]> _cookies = new ThreadLocal<Cookie[]>();
	private HttpClient _httpClient = new HttpClient();
	private Credentials _proxyCredentials;
	private HttpClient _proxyHttpClient = new HttpClient();
	private ServiceHost _host;
	private static Log _log = LogFactoryUtil.getLog(ServiceHttpClient.class);

	private static final int _TIMEOUT = GetterUtil.getInteger(
			com.liferay.portal.kernel.util.PropsUtil.get(ServiceHttpClient.class.getName() + ".timeout"), 5000);
	private static final int _MAX_CONNECTIONS_PER_HOST = GetterUtil.getInteger(
			com.liferay.portal.kernel.util.PropsUtil.get(ServiceHttpClient.class.getName()
					+ ".max.connections.per.host"), 2);

	private static final int _MAX_TOTAL_CONNECTIONS = GetterUtil.getInteger(
			com.liferay.portal.kernel.util.PropsUtil.get(ServiceHttpClient.class.getName() + ".max.total.connections"),
			20);

	private class FastProtocolSocketFactory extends DefaultProtocolSocketFactory {

		@Override
		public Socket createSocket(final String host, final int port, final InetAddress localInetAddress,
				final int localPort, final HttpConnectionParams httpConnectionParams) throws ConnectTimeoutException,
				IOException, UnknownHostException {

			int connectionTimeout = httpConnectionParams.getConnectionTimeout();

			if (connectionTimeout == 0) {
				return createSocket(host, port, localInetAddress, localPort);
			}

			SocketFactory socketFactory = SocketFactory.getDefault();

			Socket socket = socketFactory.createSocket();

			SocketAddress localSocketAddress = new InetSocketAddress(localInetAddress, localPort);

			SocketAddress remoteSocketAddress = new InetSocketAddress(host, port);

			socket.bind(localSocketAddress);

			socket.connect(remoteSocketAddress, connectionTimeout);

			return socket;
		}

	}
}
