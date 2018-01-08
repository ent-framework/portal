package com.liferay.mail.service.impl;

import com.liferay.mail.model.Filter;
import com.liferay.mail.service.base.MailServiceBaseImpl;
import com.liferay.mail.util.Hook;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.mail.Account;
import com.liferay.portal.kernel.mail.MailMessage;
import com.liferay.portal.kernel.messaging.DestinationNames;
import com.liferay.portal.kernel.messaging.MessageBusUtil;
import com.liferay.portal.kernel.util.*;
import com.liferay.portal.util.PrefsPropsUtil;
import com.liferay.portal.util.PropsValues;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.mail.Session;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * The implementation of the mail remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.mail.service.MailService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.mail.service.base.MailServiceBaseImpl
 * @see com.liferay.mail.service.MailServiceUtil
 */
public class MailServiceImpl extends MailServiceBaseImpl {

    public void addForward(
            long companyId, long userId, List<Filter> filters,
            List<String> emailAddresses, boolean leaveCopy) {

        if (_log.isDebugEnabled()) {
            _log.debug("addForward");
        }

        MethodHandler methodHandler = new MethodHandler(
                _addForwardMethodKey, companyId, userId, filters, emailAddresses,
                leaveCopy);

        MessageBusUtil.sendMessage(DestinationNames.MAIL, methodHandler);
    }

    public void addUser(
            long companyId, long userId, String password, String firstName,
            String middleName, String lastName, String emailAddress) {

        if (_log.isDebugEnabled()) {
            _log.debug("addUser");
        }

        MethodHandler methodHandler = new MethodHandler(
                _addUserMethodKey, companyId, userId, password, firstName,
                middleName, lastName, emailAddress);

        MessageBusUtil.sendMessage(DestinationNames.MAIL, methodHandler);
    }

    public void addVacationMessage(
            long companyId, long userId, String emailAddress,
            String vacationMessage) {

        if (_log.isDebugEnabled()) {
            _log.debug("addVacationMessage");
        }

        MethodHandler methodHandler = new MethodHandler(
                _addVacationMessageMethodKey, companyId, userId, emailAddress,
                vacationMessage);

        MessageBusUtil.sendMessage(DestinationNames.MAIL, methodHandler);
    }

    public void clearSession() {
        _session = null;
    }

    public void deleteEmailAddress(long companyId, long userId) {
        if (_log.isDebugEnabled()) {
            _log.debug("deleteEmailAddress");
        }

        MethodHandler methodHandler = new MethodHandler(
                _deleteEmailAddressMethodKey, companyId, userId);

        MessageBusUtil.sendMessage(DestinationNames.MAIL, methodHandler);
    }

    public void deleteUser(long companyId, long userId) {
        if (_log.isDebugEnabled()) {
            _log.debug("deleteUser");
        }

        MethodHandler methodHandler = new MethodHandler(
                _deleteUserMethodKey, companyId, userId);

        MessageBusUtil.sendMessage(DestinationNames.MAIL, methodHandler);
    }

    public Session getSession() throws SystemException {
        if (_session != null) {
            return _session;
        }

        Session session = InfrastructureUtil.getMailSession();

        if (!PrefsPropsUtil.getBoolean(PropsKeys.MAIL_SESSION_MAIL)) {
            _session = session;

            return _session;
        }

        String advancedPropertiesString = PrefsPropsUtil.getString(
                PropsKeys.MAIL_SESSION_MAIL_ADVANCED_PROPERTIES,
                PropsValues.MAIL_SESSION_MAIL_ADVANCED_PROPERTIES);
        String pop3Host = PrefsPropsUtil.getString(
                PropsKeys.MAIL_SESSION_MAIL_POP3_HOST,
                PropsValues.MAIL_SESSION_MAIL_POP3_HOST);
        String pop3Password = PrefsPropsUtil.getString(
                PropsKeys.MAIL_SESSION_MAIL_POP3_PASSWORD,
                PropsValues.MAIL_SESSION_MAIL_POP3_PASSWORD);
        int pop3Port = PrefsPropsUtil.getInteger(
                PropsKeys.MAIL_SESSION_MAIL_POP3_PORT,
                PropsValues.MAIL_SESSION_MAIL_POP3_PORT);
        String pop3User = PrefsPropsUtil.getString(
                PropsKeys.MAIL_SESSION_MAIL_POP3_USER,
                PropsValues.MAIL_SESSION_MAIL_POP3_USER);
        String smtpHost = PrefsPropsUtil.getString(
                PropsKeys.MAIL_SESSION_MAIL_SMTP_HOST,
                PropsValues.MAIL_SESSION_MAIL_SMTP_HOST);
        String smtpPassword = PrefsPropsUtil.getString(
                PropsKeys.MAIL_SESSION_MAIL_SMTP_PASSWORD,
                PropsValues.MAIL_SESSION_MAIL_SMTP_PASSWORD);
        int smtpPort = PrefsPropsUtil.getInteger(
                PropsKeys.MAIL_SESSION_MAIL_SMTP_PORT,
                PropsValues.MAIL_SESSION_MAIL_SMTP_PORT);
        String smtpUser = PrefsPropsUtil.getString(
                PropsKeys.MAIL_SESSION_MAIL_SMTP_USER,
                PropsValues.MAIL_SESSION_MAIL_SMTP_USER);
        String storeProtocol = PrefsPropsUtil.getString(
                PropsKeys.MAIL_SESSION_MAIL_STORE_PROTOCOL,
                PropsValues.MAIL_SESSION_MAIL_STORE_PROTOCOL);
        String transportProtocol = PrefsPropsUtil.getString(
                PropsKeys.MAIL_SESSION_MAIL_TRANSPORT_PROTOCOL,
                PropsValues.MAIL_SESSION_MAIL_TRANSPORT_PROTOCOL);

        Properties properties = session.getProperties();

        // Incoming

        if (!storeProtocol.equals(Account.PROTOCOL_POPS)) {
            storeProtocol = Account.PROTOCOL_POP;
        }

        properties.setProperty("mail.store.protocol", storeProtocol);

        String storePrefix = "mail." + storeProtocol + ".";

        properties.setProperty(storePrefix + "host", pop3Host);
        properties.setProperty(storePrefix + "password", pop3Password);
        properties.setProperty(storePrefix + "port", String.valueOf(pop3Port));
        properties.setProperty(storePrefix + "user", pop3User);

        // Outgoing

        if (!transportProtocol.equals(Account.PROTOCOL_SMTPS)) {
            transportProtocol = Account.PROTOCOL_SMTP;
        }

        properties.setProperty("mail.transport.protocol", transportProtocol);

        String transportPrefix = "mail." + transportProtocol + ".";

        boolean smtpAuth = false;

        if (Validator.isNotNull(smtpPassword) ||
                Validator.isNotNull(smtpUser)) {

            smtpAuth = true;
        }

        properties.setProperty(
                transportPrefix + "auth", String.valueOf(smtpAuth));
        properties.setProperty(transportPrefix + "host", smtpHost);
        properties.setProperty(transportPrefix + "password", smtpPassword);
        properties.setProperty(
                transportPrefix + "port", String.valueOf(smtpPort));
        properties.setProperty(transportPrefix + "user", smtpUser);

        // Advanced

        try {
            if (Validator.isNotNull(advancedPropertiesString)) {
                Properties advancedProperties = PropertiesUtil.load(
                        advancedPropertiesString);

                for (Map.Entry<Object, Object> entry :
                        advancedProperties.entrySet()) {

                    String key = (String)entry.getKey();
                    String value = (String)entry.getValue();

                    properties.setProperty(key, value);
                }
            }
        }
        catch (IOException ioe) {
            if (_log.isWarnEnabled()) {
                _log.warn(ioe.getMessage(), ioe);
            }
        }

        _session = Session.getInstance(properties);

        return _session;
    }

    public void sendEmail(MailMessage mailMessage) {
        if (_log.isDebugEnabled()) {
            _log.debug("sendEmail");
        }

        MessageBusUtil.sendMessage(DestinationNames.MAIL, mailMessage);
    }

    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    public void updateBlocked(
            long companyId, long userId, List<String> blocked) {

        if (_log.isDebugEnabled()) {
            _log.debug("updateBlocked");
        }

        MethodHandler methodHandler = new MethodHandler(
                _updateBlockedMethodKey, companyId, userId, blocked);

        MessageBusUtil.sendMessage(DestinationNames.MAIL, methodHandler);
    }

    public void updateEmailAddress(
            long companyId, long userId, String emailAddress) {

        if (_log.isDebugEnabled()) {
            _log.debug("updateEmailAddress");
        }

        MethodHandler methodHandler = new MethodHandler(
                _updateEmailAddressMethodKey, companyId, userId, emailAddress);

        MessageBusUtil.sendMessage(DestinationNames.MAIL, methodHandler);
    }

    public void updatePassword(long companyId, long userId, String password) {
        if (_log.isDebugEnabled()) {
            _log.debug("updatePassword");
        }

        MethodHandler methodHandler = new MethodHandler(
                _updatePasswordMethodKey, companyId, userId, password);

        MessageBusUtil.sendMessage(DestinationNames.MAIL, methodHandler);
    }

    private static Logger _log = LoggerFactory.getLogger(MailServiceImpl.class);

    private static MethodKey _addForwardMethodKey = new MethodKey(
            Hook.class, "addForward", long.class, long.class, List.class,
            List.class, boolean.class);
    private static MethodKey _addUserMethodKey = new MethodKey(
            Hook.class, "addUser", long.class, long.class, String.class,
            String.class, String.class, String.class, String.class);
    private static MethodKey _addVacationMessageMethodKey = new MethodKey(
            Hook.class, "addVacationMessage", long.class, long.class, String.class,
            String.class);
    private static MethodKey _deleteEmailAddressMethodKey = new MethodKey(
            Hook.class, "deleteEmailAddress", long.class, long.class);
    private static MethodKey _deleteUserMethodKey = new MethodKey(
            Hook.class, "deleteUser", long.class, long.class);
    private static MethodKey _updateBlockedMethodKey = new MethodKey(
            Hook.class, "updateBlocked", long.class, long.class, List.class);
    private static MethodKey _updateEmailAddressMethodKey = new MethodKey(
            Hook.class, "updateEmailAddress", long.class, long.class, String.class);
    private static MethodKey _updatePasswordMethodKey = new MethodKey(
            Hook.class, "updatePassword", long.class, long.class, String.class);

    private String _beanIdentifier;
    private Session _session;
}
