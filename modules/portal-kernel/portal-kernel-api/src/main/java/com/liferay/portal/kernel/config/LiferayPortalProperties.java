package com.liferay.portal.kernel.config;

import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.cors.CorsConfiguration;

@ConfigurationProperties(prefix = "liferay", ignoreUnknownFields = false)
public class LiferayPortalProperties {

    private final Async async = new Async();

    private final Http http = new Http();

    private final Cache cache = new Cache();

    private final Mail mail = new Mail();

    private final Security security = new Security();

    private final Swagger swagger = new Swagger();

    private final Metrics metrics = new Metrics();

    private final Logging logging = new Logging();

    private final CorsConfiguration cors = new CorsConfiguration();

    private final Social social = new Social();

    private final Gateway gateway = new Gateway();

    private final Ribbon ribbon = new Ribbon();

    private final Registry registry = new Registry();

    private String home = "";

    private final Lib lib = new Lib();

    private final Web web = new Web();

    public Async getAsync() {
        return async;
    }

    public Http getHttp() {
        return http;
    }

    public Cache getCache() {
        return cache;
    }

    public Mail getMail() {
        return mail;
    }

    public Registry getRegistry() {
        return registry;
    }

    public Security getSecurity() {
        return security;
    }

    public Swagger getSwagger() {
        return swagger;
    }

    public Metrics getMetrics() {
        return metrics;
    }

    public Logging getLogging() {
        return logging;
    }

    public CorsConfiguration getCors() {
        return cors;
    }

    public Social getSocial() {
        return social;
    }

    public Gateway getGateway() {
        return gateway;
    }

    public Ribbon getRibbon() {
        return ribbon;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getHome() {
        return home;
    }

    public Lib getLib() {
        return lib;
    }

    public Web getWeb() {
        return web;
    }

    public static class Web {

        private Portal portal;

        public Portal getPortal() {
            return portal;
        }

        public void setPortal(Portal portal) {
            this.portal = portal;
        }
    }

    public static class Lib {

        private Portal portal;

        public Portal getPortal() {
            return portal;
        }

        public void setPortal(Portal portal) {
            this.portal = portal;
        }
    }

    public static class Portal {
        private String dir;

        public String getDir() {
            return dir;
        }

        public void setDir(String dir) {
            this.dir = dir;
        }
    }

    public static class Async {

        private int corePoolSize = LiferayPortalDefaults.Async.corePoolSize;

        private int maxPoolSize = LiferayPortalDefaults.Async.maxPoolSize;

        private int queueCapacity = LiferayPortalDefaults.Async.queueCapacity;

        public int getCorePoolSize() {
            return corePoolSize;
        }

        public void setCorePoolSize(int corePoolSize) {
            this.corePoolSize = corePoolSize;
        }

        public int getMaxPoolSize() {
            return maxPoolSize;
        }

        public void setMaxPoolSize(int maxPoolSize) {
            this.maxPoolSize = maxPoolSize;
        }

        public int getQueueCapacity() {
            return queueCapacity;
        }

        public void setQueueCapacity(int queueCapacity) {
            this.queueCapacity = queueCapacity;
        }
    }

    public static class Http {

        public enum Version {V_1_1, V_2_0}

        private final Cache cache = new Cache();

        /**
         * HTTP version, must be "V_1_1" (for HTTP/1.1) or V_2_0 (for (HTTP/2)
         */
        public Version version = LiferayPortalDefaults.Http.version;

        public Cache getCache() {
            return cache;
        }

        public Version getVersion() {
            return version;
        }

        public void setVersion(Version version) {
            this.version = version;
        }

        public static class Cache {

            private int timeToLiveInDays = LiferayPortalDefaults.Http.Cache.timeToLiveInDays;

            public int getTimeToLiveInDays() {
                return timeToLiveInDays;
            }

            public void setTimeToLiveInDays(int timeToLiveInDays) {
                this.timeToLiveInDays = timeToLiveInDays;
            }
        }
    }

    public static class Cache {

        private final Hazelcast hazelcast = new Hazelcast();

        private final Ehcache ehcache = new Ehcache();

        private final Infinispan infinispan = new Infinispan();

        public Hazelcast getHazelcast() {
            return hazelcast;
        }

        public Ehcache getEhcache() {
            return ehcache;
        }

        public Infinispan getInfinispan() {
            return infinispan;
        }

        public static class Hazelcast {

            private int timeToLiveSeconds = LiferayPortalDefaults.Cache.Hazelcast.timeToLiveSeconds;

            private int backupCount = LiferayPortalDefaults.Cache.Hazelcast.backupCount;

            private final ManagementCenter managementCenter = new ManagementCenter();

            public ManagementCenter getManagementCenter() {
                return managementCenter;
            }

            public static class ManagementCenter {

                private boolean enabled = LiferayPortalDefaults.Cache.Hazelcast.ManagementCenter.enabled;

                private int updateInterval = LiferayPortalDefaults.Cache.Hazelcast.ManagementCenter.updateInterval;

                private String url =  LiferayPortalDefaults.Cache.Hazelcast.ManagementCenter.url;

                public boolean isEnabled() {
                    return enabled;
                }

                public void setEnabled(boolean enabled) {
                    this.enabled = enabled;
                }

                public int getUpdateInterval() {
                    return updateInterval;
                }

                public void setUpdateInterval(int updateInterval) {
                    this.updateInterval = updateInterval;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

            }

            public int getTimeToLiveSeconds() {
                return timeToLiveSeconds;
            }

            public void setTimeToLiveSeconds(int timeToLiveSeconds) {
                this.timeToLiveSeconds = timeToLiveSeconds;
            }

            public int getBackupCount() {
                return backupCount;
            }

            public void setBackupCount(int backupCount) {
                this.backupCount = backupCount;
            }
        }

        public static class Ehcache {

            private int timeToLiveSeconds = LiferayPortalDefaults.Cache.Ehcache.timeToLiveSeconds;

            private long maxEntries = LiferayPortalDefaults.Cache.Ehcache.maxEntries;

            public int getTimeToLiveSeconds() {
                return timeToLiveSeconds;
            }

            public void setTimeToLiveSeconds(int timeToLiveSeconds) {
                this.timeToLiveSeconds = timeToLiveSeconds;
            }

            public long getMaxEntries() {
                return maxEntries;
            }

            public void setMaxEntries(long maxEntries) {
                this.maxEntries = maxEntries;
            }
        }

        public static class Infinispan {

            private String configFile = LiferayPortalDefaults.Cache.Infinispan.configFile;

            private boolean statsEnabled = LiferayPortalDefaults.Cache.Infinispan.statsEnabled;

            private final Local local = new Local();

            private final Distributed distributed = new Distributed();

            private final Replicated replicated = new Replicated();

            public String getConfigFile() {
                return configFile;
            }

            public void setConfigFile(String configFile) {
                this.configFile = configFile;
            }

            public boolean isStatsEnabled() {
                return statsEnabled;
            }

            public void setStatsEnabled(boolean statsEnabled) {
                this.statsEnabled = statsEnabled;
            }

            public Local getLocal() {
                return local;
            }

            public Distributed getDistributed() {
                return distributed;
            }

            public Replicated getReplicated() {
                return replicated;
            }

            public static class Local {

                private long timeToLiveSeconds = LiferayPortalDefaults.Cache.Infinispan.Local.timeToLiveSeconds;

                private long maxEntries = LiferayPortalDefaults.Cache.Infinispan.Local.maxEntries;

                public long getTimeToLiveSeconds() {
                    return timeToLiveSeconds;
                }

                public void setTimeToLiveSeconds(long timeToLiveSeconds) {
                    this.timeToLiveSeconds = timeToLiveSeconds;
                }

                public long getMaxEntries() {
                    return maxEntries;
                }

                public void setMaxEntries(long maxEntries) {
                    this.maxEntries = maxEntries;
                }

            }

            public static class Distributed {

                private long timeToLiveSeconds = LiferayPortalDefaults.Cache.Infinispan.Distributed.timeToLiveSeconds;

                private long maxEntries = LiferayPortalDefaults.Cache.Infinispan.Distributed.maxEntries;

                private int instanceCount = LiferayPortalDefaults.Cache.Infinispan.Distributed.instanceCount;

                public long getTimeToLiveSeconds() {
                    return timeToLiveSeconds;
                }

                public void setTimeToLiveSeconds(long timeToLiveSeconds) {
                    this.timeToLiveSeconds = timeToLiveSeconds;
                }

                public long getMaxEntries() {
                    return maxEntries;
                }

                public void setMaxEntries(long maxEntries) {
                    this.maxEntries = maxEntries;
                }

                public int getInstanceCount() {
                    return instanceCount;
                }

                public void setInstanceCount(int instanceCount) {
                    this.instanceCount = instanceCount;
                }
            }

            public static class Replicated {

                private long timeToLiveSeconds = LiferayPortalDefaults.Cache.Infinispan.Replicated.timeToLiveSeconds;

                private long maxEntries = LiferayPortalDefaults.Cache.Infinispan.Replicated.maxEntries;

                public long getTimeToLiveSeconds() {
                    return timeToLiveSeconds;
                }

                public void setTimeToLiveSeconds(long timeToLiveSeconds) {
                    this.timeToLiveSeconds = timeToLiveSeconds;
                }

                public long getMaxEntries() {
                    return maxEntries;
                }

                public void setMaxEntries(long maxEntries) {
                    this.maxEntries = maxEntries;
                }

            }
        }
    }

    public static class Mail {

        private String from = LiferayPortalDefaults.Mail.from;

        private String baseUrl = LiferayPortalDefaults.Mail.baseUrl;

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public String getBaseUrl() {
            return baseUrl;
        }

        public void setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
        }
    }

    public static class Security {

        private final ClientAuthorization clientAuthorization = new ClientAuthorization();

        private final Authentication authentication = new Authentication();

        private final RememberMe rememberMe = new RememberMe();

        public ClientAuthorization getClientAuthorization() {
            return clientAuthorization;
        }

        public Authentication getAuthentication() {
            return authentication;
        }

        public RememberMe getRememberMe() {
            return rememberMe;
        }

        public static class ClientAuthorization {

            private String accessTokenUri = LiferayPortalDefaults.Security.ClientAuthorization.accessTokenUri;

            private String tokenServiceId = LiferayPortalDefaults.Security.ClientAuthorization.tokenServiceId;

            private String clientId = LiferayPortalDefaults.Security.ClientAuthorization.clientId;

            private String clientSecret = LiferayPortalDefaults.Security.ClientAuthorization.clientSecret;

            public String getAccessTokenUri() {
                return accessTokenUri;
            }

            public void setAccessTokenUri(String accessTokenUri) {
                this.accessTokenUri = accessTokenUri;
            }

            public String getTokenServiceId() {
                return tokenServiceId;
            }

            public void setTokenServiceId(String tokenServiceId) {
                this.tokenServiceId = tokenServiceId;
            }

            public String getClientId() {
                return clientId;
            }

            public void setClientId(String clientId) {
                this.clientId = clientId;
            }

            public String getClientSecret() {
                return clientSecret;
            }

            public void setClientSecret(String clientSecret) {
                this.clientSecret = clientSecret;
            }
        }

        public static class Authentication {

            private final Jwt jwt = new Jwt();

            public Jwt getJwt() {
                return jwt;
            }

            public static class Jwt {

                private String secret = LiferayPortalDefaults.Security.Authentication.Jwt.secret;

                private long tokenValidityInSeconds = LiferayPortalDefaults.Security.Authentication.Jwt
                        .tokenValidityInSeconds;

                private long tokenValidityInSecondsForRememberMe = LiferayPortalDefaults.Security.Authentication.Jwt
                        .tokenValidityInSecondsForRememberMe;

                public String getSecret() {
                    return secret;
                }

                public void setSecret(String secret) {
                    this.secret = secret;
                }

                public long getTokenValidityInSeconds() {
                    return tokenValidityInSeconds;
                }

                public void setTokenValidityInSeconds(long tokenValidityInSeconds) {
                    this.tokenValidityInSeconds = tokenValidityInSeconds;
                }

                public long getTokenValidityInSecondsForRememberMe() {
                    return tokenValidityInSecondsForRememberMe;
                }

                public void setTokenValidityInSecondsForRememberMe(long tokenValidityInSecondsForRememberMe) {
                    this.tokenValidityInSecondsForRememberMe = tokenValidityInSecondsForRememberMe;
                }
            }
        }

        public static class RememberMe {

            @NotNull
            private String key = LiferayPortalDefaults.Security.RememberMe.key;

            public String getKey() {
                return key;
            }

            public void setKey(String key) {
                this.key = key;
            }
        }
    }

    public static class Swagger {

        private String title = LiferayPortalDefaults.Swagger.title;

        private String description = LiferayPortalDefaults.Swagger.description;

        private String version = LiferayPortalDefaults.Swagger.version;

        private String termsOfServiceUrl = LiferayPortalDefaults.Swagger.termsOfServiceUrl;

        private String contactName = LiferayPortalDefaults.Swagger.contactName;

        private String contactUrl = LiferayPortalDefaults.Swagger.contactUrl;

        private String contactEmail = LiferayPortalDefaults.Swagger.contactEmail;

        private String license = LiferayPortalDefaults.Swagger.license;

        private String licenseUrl = LiferayPortalDefaults.Swagger.licenseUrl;

        private String defaultIncludePattern = LiferayPortalDefaults.Swagger.defaultIncludePattern;

        private String host = LiferayPortalDefaults.Swagger.host;

        private String[] protocols = LiferayPortalDefaults.Swagger.protocols;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getTermsOfServiceUrl() {
            return termsOfServiceUrl;
        }

        public void setTermsOfServiceUrl(String termsOfServiceUrl) {
            this.termsOfServiceUrl = termsOfServiceUrl;
        }

        public String getContactName() {
            return contactName;
        }

        public void setContactName(String contactName) {
            this.contactName = contactName;
        }

        public String getContactUrl() {
            return contactUrl;
        }

        public void setContactUrl(String contactUrl) {
            this.contactUrl = contactUrl;
        }

        public String getContactEmail() {
            return contactEmail;
        }

        public void setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
        }

        public String getLicense() {
            return license;
        }

        public void setLicense(String license) {
            this.license = license;
        }

        public String getLicenseUrl() {
            return licenseUrl;
        }

        public void setLicenseUrl(String licenseUrl) {
            this.licenseUrl = licenseUrl;
        }

        public String getDefaultIncludePattern() {
            return defaultIncludePattern;
        }

        public void setDefaultIncludePattern(String defaultIncludePattern) {
            this.defaultIncludePattern = defaultIncludePattern;
        }

        public String getHost() {
            return host;
        }

        public void setHost(final String host) {
            this.host = host;
        }

        public String[] getProtocols() {
            return protocols;
        }

        public void setProtocols(final String[] protocols) {
            this.protocols = protocols;
        }
    }

    public static class Metrics {

        private final Jmx jmx = new Jmx();

        private final Graphite graphite = new Graphite();

        private final Prometheus prometheus = new Prometheus();

        private final Logs logs = new Logs();

        public Jmx getJmx() {
            return jmx;
        }

        public Graphite getGraphite() {
            return graphite;
        }

        public Prometheus getPrometheus() {
            return prometheus;
        }

        public Logs getLogs() {
            return logs;
        }

        public static class Jmx {

            private boolean enabled = LiferayPortalDefaults.Metrics.Jmx.enabled;

            public boolean isEnabled() {
                return enabled;
            }

            public void setEnabled(boolean enabled) {
                this.enabled = enabled;
            }
        }

        public static class Graphite {

            private boolean enabled = LiferayPortalDefaults.Metrics.Graphite.enabled;

            private String host = LiferayPortalDefaults.Metrics.Graphite.host;

            private int port = LiferayPortalDefaults.Metrics.Graphite.port;

            private String prefix = LiferayPortalDefaults.Metrics.Graphite.prefix;

            public boolean isEnabled() {
                return enabled;
            }

            public void setEnabled(boolean enabled) {
                this.enabled = enabled;
            }

            public String getHost() {
                return host;
            }

            public void setHost(String host) {
                this.host = host;
            }

            public int getPort() {
                return port;
            }

            public void setPort(int port) {
                this.port = port;
            }

            public String getPrefix() {
                return prefix;
            }

            public void setPrefix(String prefix) {
                this.prefix = prefix;
            }
        }

        public static class Prometheus {

            private boolean enabled = LiferayPortalDefaults.Metrics.Prometheus.enabled;

            private String endpoint = LiferayPortalDefaults.Metrics.Prometheus.endpoint;

            public boolean isEnabled() {
                return enabled;
            }

            public void setEnabled(boolean enabled) {
                this.enabled = enabled;
            }

            public String getEndpoint() {
                return endpoint;
            }

            public void setEndpoint(String endpoint) {
                this.endpoint = endpoint;
            }
        }

        public static class Logs {

            private boolean enabled = LiferayPortalDefaults.Metrics.Logs.enabled;

            private long reportFrequency = LiferayPortalDefaults.Metrics.Logs.reportFrequency;

            public boolean isEnabled() {
                return enabled;
            }

            public void setEnabled(boolean enabled) {
                this.enabled = enabled;
            }

            public long getReportFrequency() {
                return reportFrequency;
            }

            public void setReportFrequency(long reportFrequency) {
                this.reportFrequency = reportFrequency;
            }
        }
    }

    public static class Logging {

        private final Logstash logstash = new Logstash();

        public Logstash getLogstash() {
            return logstash;
        }

        public static class Logstash {

            private boolean enabled = LiferayPortalDefaults.Logging.Logstash.enabled;

            private String host = LiferayPortalDefaults.Logging.Logstash.host;

            private int port = LiferayPortalDefaults.Logging.Logstash.port;

            private int queueSize = LiferayPortalDefaults.Logging.Logstash.queueSize;

            public boolean isEnabled() {
                return enabled;
            }

            public void setEnabled(boolean enabled) {
                this.enabled = enabled;
            }

            public String getHost() {
                return host;
            }

            public void setHost(String host) {
                this.host = host;
            }

            public int getPort() {
                return port;
            }

            public void setPort(int port) {
                this.port = port;
            }

            public int getQueueSize() {
                return queueSize;
            }

            public void setQueueSize(int queueSize) {
                this.queueSize = queueSize;
            }
        }

        private final SpectatorMetrics spectatorMetrics = new SpectatorMetrics();

        public SpectatorMetrics getSpectatorMetrics() {
            return spectatorMetrics;
        }

        public static class SpectatorMetrics {

            private boolean enabled = LiferayPortalDefaults.Logging.SpectatorMetrics.enabled;

            public boolean isEnabled() {
                return enabled;
            }

            public void setEnabled(boolean enabled) {
                this.enabled = enabled;
            }
        }
    }

    public static class Social {

        private String redirectAfterSignIn = LiferayPortalDefaults.Social.redirectAfterSignIn;

        public String getRedirectAfterSignIn() {
            return redirectAfterSignIn;
        }

        public void setRedirectAfterSignIn(String redirectAfterSignIn) {
            this.redirectAfterSignIn = redirectAfterSignIn;
        }
    }

    public static class Gateway {

        private final RateLimiting rateLimiting = new RateLimiting();

        public RateLimiting getRateLimiting() {
            return rateLimiting;
        }

        private Map<String, List<String>> authorizedMicroservicesEndpoints = LiferayPortalDefaults.Gateway
                .authorizedMicroservicesEndpoints;

        public Map<String, List<String>> getAuthorizedMicroservicesEndpoints() {
            return authorizedMicroservicesEndpoints;
        }

        public void setAuthorizedMicroservicesEndpoints(Map<String, List<String>> authorizedMicroservicesEndpoints) {
            this.authorizedMicroservicesEndpoints = authorizedMicroservicesEndpoints;
        }

        public static class RateLimiting {

            private boolean enabled = LiferayPortalDefaults.Gateway.RateLimiting.enabled;

            private long limit = LiferayPortalDefaults.Gateway.RateLimiting.limit;

            private int durationInSeconds = LiferayPortalDefaults.Gateway.RateLimiting.durationInSeconds;

            public boolean isEnabled() {
                return enabled;
            }

            public void setEnabled(boolean enabled) {
                this.enabled = enabled;
            }

            public long getLimit() {
                return this.limit;
            }

            public void setLimit(long limit) {
                this.limit = limit;
            }

            public int getDurationInSeconds() {
                return durationInSeconds;
            }

            public void setDurationInSeconds(int durationInSeconds) {
                this.durationInSeconds = durationInSeconds;
            }
        }
    }

    public static class Ribbon {

        private String[] displayOnActiveProfiles = LiferayPortalDefaults.Ribbon.displayOnActiveProfiles;

        public String[] getDisplayOnActiveProfiles() {
            return displayOnActiveProfiles;
        }

        public void setDisplayOnActiveProfiles(String[] displayOnActiveProfiles) {
            this.displayOnActiveProfiles = displayOnActiveProfiles;
        }
    }

    public static class Registry {

        private String password = LiferayPortalDefaults.Registry.password;

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}
