/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 * <p>
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * <p>
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.search.solr.http;

import com.liferay.portal.kernel.util.StreamUtil;
import com.liferay.portal.kernel.util.StringBundler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.Certificate;
import java.util.Enumeration;

/**
 * @author László Csontos
 * @author André de Oliveira
 */
public class KeyStoreLoaderImpl implements KeyStoreLoader {

    @Override
    public KeyStore load(
            String keyStoreType, String keyStoreLocation,
            char[] keyStorePassword)
            throws Exception {

        if (keyStoreLocation == null) {
            return null;
        }

        KeyStore keyStore = KeyStore.getInstance(keyStoreType);

        InputStream inputStream = loadFile(keyStoreLocation);

        try {
            keyStore.load(inputStream, keyStorePassword);

            if (_log.isDebugEnabled()) {
                dumpKeyStore(keyStore);
            }
        } finally {
            StreamUtil.cleanUp(inputStream);
        }

        return keyStore;
    }

    protected void dumpKeyStore(KeyStore keyStore) throws KeyStoreException {
        Enumeration<String> aliases = keyStore.aliases();

        Logger log = _log;

        while (aliases.hasMoreElements()) {
            String alias = aliases.nextElement();

            boolean certificateEntry = keyStore.isCertificateEntry(alias);

            StringBundler sb = null;

            if (certificateEntry) {
                sb = new StringBundler(8);
            } else {
                sb = new StringBundler(6);
            }

            sb.append("alias=");
            sb.append(alias);

            if (certificateEntry) {
                Certificate certificate = keyStore.getCertificate(alias);

                sb.append(",certificate=");
                sb.append(certificate.toString());
            }

            sb.append(",certificateEntry=");
            sb.append(certificateEntry);
            sb.append(",keyEntry=");
            sb.append(keyStore.isKeyEntry(alias));

            log.debug(sb.toString());
        }
    }

    protected InputStream loadFile(String fileName)
            throws FileNotFoundException {

        if (_log.isDebugEnabled()) {
            _log.debug("Loading file " + fileName);
        }

        InputStream inputStream = null;

        if (fileName.startsWith("classpath:")) {
            fileName = fileName.substring(10);

            Class<?> clazz = KeyStoreLoaderImpl.class;

            inputStream = clazz.getResourceAsStream(fileName);
        }

        if (inputStream != null) {
            return inputStream;
        }

        if (_log.isInfoEnabled()) {
            _log.info(
                    "Attempting to laod from the file system because " + fileName +
                            " is not in the class path");
        }

        return new FileInputStream(fileName);
    }

    private static Logger _log = LoggerFactory.getLogger(KeyStoreLoaderImpl.class);

}