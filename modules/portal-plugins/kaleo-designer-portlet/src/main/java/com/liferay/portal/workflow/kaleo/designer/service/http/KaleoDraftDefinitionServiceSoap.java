package com.liferay.portal.workflow.kaleo.designer.service.http;

import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.workflow.kaleo.designer.service.KaleoDraftDefinitionServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;

import java.util.Locale;
import java.util.Map;

/**
 * Provides the SOAP utility for the
 * {@link com.liferay.portal.workflow.kaleo.designer.service.KaleoDraftDefinitionServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinitionSoap}.
 * If the method in the service utility returns a
 * {@link com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinition}, that is translated to a
 * {@link com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinitionSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Eduardo Lundgren
 * @see KaleoDraftDefinitionServiceHttp
 * @see com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinitionSoap
 * @see com.liferay.portal.workflow.kaleo.designer.service.KaleoDraftDefinitionServiceUtil
 * @generated
 */
public class KaleoDraftDefinitionServiceSoap {
    private static final Logger _log = LoggerFactory.getLogger(KaleoDraftDefinitionServiceSoap.class);

    public static com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinitionSoap addKaleoDraftDefinition(
        long userId, java.lang.String name,
        java.lang.String[] titleMapLanguageIds,
        java.lang.String[] titleMapValues, java.lang.String content,
        int version, int draftVersion,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws RemoteException {
        try {
            Map<Locale, String> titleMap = LocalizationUtil.getLocalizationMap(titleMapLanguageIds,
                    titleMapValues);

            com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinition returnValue =
                KaleoDraftDefinitionServiceUtil.addKaleoDraftDefinition(userId,
                    name, titleMap, content, version, draftVersion,
                    serviceContext);

            return com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinitionSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinitionSoap getKaleoDraftDefinition(
        java.lang.String name, int version, int draftVersion,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws RemoteException {
        try {
            com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinition returnValue =
                KaleoDraftDefinitionServiceUtil.getKaleoDraftDefinition(name,
                    version, draftVersion, serviceContext);

            return com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinitionSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinitionSoap[] getLatestKaleoDraftDefinitions(
        long companyId, int version, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws RemoteException {
        try {
            java.util.List<com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinition> returnValue =
                KaleoDraftDefinitionServiceUtil.getLatestKaleoDraftDefinitions(companyId,
                    version, start, end, orderByComparator);

            return com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinitionSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinitionSoap[] getKaleoDraftDefinitions()
        throws RemoteException {
        try {
            java.util.List<com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinition> returnValue =
                KaleoDraftDefinitionServiceUtil.getKaleoDraftDefinitions();

            return com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinitionSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinitionSoap getLatestKaleoDraftDefinition(
        java.lang.String name, int version,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws RemoteException {
        try {
            com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinition returnValue =
                KaleoDraftDefinitionServiceUtil.getLatestKaleoDraftDefinition(name,
                    version, serviceContext);

            return com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinitionSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinitionSoap publishKaleoDraftDefinition(
        long userId, java.lang.String name,
        java.lang.String[] titleMapLanguageIds,
        java.lang.String[] titleMapValues, java.lang.String content,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws RemoteException {
        try {
            Map<Locale, String> titleMap = LocalizationUtil.getLocalizationMap(titleMapLanguageIds,
                    titleMapValues);

            com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinition returnValue =
                KaleoDraftDefinitionServiceUtil.publishKaleoDraftDefinition(userId,
                    name, titleMap, content, serviceContext);

            return com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinitionSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinitionSoap updateKaleoDraftDefinition(
        long userId, java.lang.String name,
        java.lang.String[] titleMapLanguageIds,
        java.lang.String[] titleMapValues, java.lang.String content,
        int version, com.liferay.portal.service.ServiceContext serviceContext)
        throws RemoteException {
        try {
            Map<Locale, String> titleMap = LocalizationUtil.getLocalizationMap(titleMapLanguageIds,
                    titleMapValues);

            com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinition returnValue =
                KaleoDraftDefinitionServiceUtil.updateKaleoDraftDefinition(userId,
                    name, titleMap, content, version, serviceContext);

            return com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinitionSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }
}
