package com.liferay.portal.workflow.kaleo.designer.service.base;

import com.liferay.portal.workflow.kaleo.designer.service.KaleoDraftDefinitionLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Eduardo Lundgren
 * @generated
 */
public class KaleoDraftDefinitionLocalServiceClpInvoker {
    private String _methodName0;
    private String[] _methodParameterTypes0;
    private String _methodName1;
    private String[] _methodParameterTypes1;
    private String _methodName2;
    private String[] _methodParameterTypes2;
    private String _methodName3;
    private String[] _methodParameterTypes3;
    private String _methodName4;
    private String[] _methodParameterTypes4;
    private String _methodName5;
    private String[] _methodParameterTypes5;
    private String _methodName6;
    private String[] _methodParameterTypes6;
    private String _methodName7;
    private String[] _methodParameterTypes7;
    private String _methodName8;
    private String[] _methodParameterTypes8;
    private String _methodName9;
    private String[] _methodParameterTypes9;
    private String _methodName10;
    private String[] _methodParameterTypes10;
    private String _methodName11;
    private String[] _methodParameterTypes11;
    private String _methodName12;
    private String[] _methodParameterTypes12;
    private String _methodName13;
    private String[] _methodParameterTypes13;
    private String _methodName14;
    private String[] _methodParameterTypes14;
    private String _methodName15;
    private String[] _methodParameterTypes15;
    private String _methodName34;
    private String[] _methodParameterTypes34;
    private String _methodName35;
    private String[] _methodParameterTypes35;
    private String _methodName40;
    private String[] _methodParameterTypes40;
    private String _methodName41;
    private String[] _methodParameterTypes41;
    private String _methodName42;
    private String[] _methodParameterTypes42;
    private String _methodName43;
    private String[] _methodParameterTypes43;
    private String _methodName44;
    private String[] _methodParameterTypes44;
    private String _methodName45;
    private String[] _methodParameterTypes45;
    private String _methodName46;
    private String[] _methodParameterTypes46;
    private String _methodName47;
    private String[] _methodParameterTypes47;
    private String _methodName48;
    private String[] _methodParameterTypes48;
    private String _methodName49;
    private String[] _methodParameterTypes49;
    private String _methodName50;
    private String[] _methodParameterTypes50;
    private String _methodName51;
    private String[] _methodParameterTypes51;

    public KaleoDraftDefinitionLocalServiceClpInvoker() {
        _methodName0 = "addKaleoDraftDefinition";

        _methodParameterTypes0 = new String[] {
                "com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinition"
            };

        _methodName1 = "createKaleoDraftDefinition";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteKaleoDraftDefinition";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteKaleoDraftDefinition";

        _methodParameterTypes3 = new String[] {
                "com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinition"
            };

        _methodName4 = "dynamicQuery";

        _methodParameterTypes4 = new String[] {  };

        _methodName5 = "dynamicQuery";

        _methodParameterTypes5 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName6 = "dynamicQuery";

        _methodParameterTypes6 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
            };

        _methodName7 = "dynamicQuery";

        _methodParameterTypes7 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName8 = "dynamicQueryCount";

        _methodParameterTypes8 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName9 = "dynamicQueryCount";

        _methodParameterTypes9 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery",
                "com.liferay.portal.kernel.dao.orm.Projection"
            };

        _methodName10 = "fetchKaleoDraftDefinition";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "getKaleoDraftDefinition";

        _methodParameterTypes11 = new String[] { "long" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getKaleoDraftDefinitions";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getKaleoDraftDefinitionsCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateKaleoDraftDefinition";

        _methodParameterTypes15 = new String[] {
                "com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinition"
            };

        _methodName34 = "getBeanIdentifier";

        _methodParameterTypes34 = new String[] {  };

        _methodName35 = "setBeanIdentifier";

        _methodParameterTypes35 = new String[] { "java.lang.String" };

        _methodName40 = "addKaleoDraftDefinition";

        _methodParameterTypes40 = new String[] {
                "long", "java.lang.String", "java.util.Map", "java.lang.String",
                "int", "int", "com.liferay.portal.service.ServiceContext"
            };

        _methodName41 = "deleteKaleoDraftDefinition";

        _methodParameterTypes41 = new String[] {
                "java.lang.String", "int", "int",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName42 = "deleteKaleoDraftDefinitions";

        _methodParameterTypes42 = new String[] {
                "java.lang.String", "int",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName43 = "getKaleoDraftDefinition";

        _methodParameterTypes43 = new String[] {
                "java.lang.String", "int", "int",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName44 = "getKaleoDraftDefinitions";

        _methodParameterTypes44 = new String[] {
                "java.lang.String", "int", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName45 = "getKaleoDraftDefinitionsCount";

        _methodParameterTypes45 = new String[] {
                "java.lang.String", "int",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName46 = "getLatestKaleoDraftDefinition";

        _methodParameterTypes46 = new String[] {
                "java.lang.String", "int",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName47 = "getLatestKaleoDraftDefinitions";

        _methodParameterTypes47 = new String[] {
                "long", "int", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName48 = "getLatestKaleoDraftDefinitionsCount";

        _methodParameterTypes48 = new String[] { "long", "int" };

        _methodName49 = "incrementKaleoDraftDefinitionDraftVersion";

        _methodParameterTypes49 = new String[] {
                "long", "java.lang.String", "int",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName50 = "publishKaleoDraftDefinition";

        _methodParameterTypes50 = new String[] {
                "long", "java.lang.String", "java.util.Map", "java.lang.String",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName51 = "updateKaleoDraftDefinition";

        _methodParameterTypes51 = new String[] {
                "long", "java.lang.String", "java.util.Map", "java.lang.String",
                "int", "com.liferay.portal.service.ServiceContext"
            };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return KaleoDraftDefinitionLocalServiceUtil.addKaleoDraftDefinition((com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinition) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return KaleoDraftDefinitionLocalServiceUtil.createKaleoDraftDefinition(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return KaleoDraftDefinitionLocalServiceUtil.deleteKaleoDraftDefinition(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return KaleoDraftDefinitionLocalServiceUtil.deleteKaleoDraftDefinition((com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinition) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return KaleoDraftDefinitionLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return KaleoDraftDefinitionLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return KaleoDraftDefinitionLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return KaleoDraftDefinitionLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return KaleoDraftDefinitionLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return KaleoDraftDefinitionLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return KaleoDraftDefinitionLocalServiceUtil.fetchKaleoDraftDefinition(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return KaleoDraftDefinitionLocalServiceUtil.getKaleoDraftDefinition(((Long) arguments[0]).longValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return KaleoDraftDefinitionLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return KaleoDraftDefinitionLocalServiceUtil.getKaleoDraftDefinitions(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return KaleoDraftDefinitionLocalServiceUtil.getKaleoDraftDefinitionsCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return KaleoDraftDefinitionLocalServiceUtil.updateKaleoDraftDefinition((com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinition) arguments[0]);
        }

        if (_methodName34.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes34, parameterTypes)) {
            return KaleoDraftDefinitionLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName35.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes35, parameterTypes)) {
            KaleoDraftDefinitionLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName40.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes40, parameterTypes)) {
            return KaleoDraftDefinitionLocalServiceUtil.addKaleoDraftDefinition(((Long) arguments[0]).longValue(),
                (java.lang.String) arguments[1],
                (java.util.Map<java.util.Locale, java.lang.String>) arguments[2],
                (java.lang.String) arguments[3],
                ((Integer) arguments[4]).intValue(),
                ((Integer) arguments[5]).intValue(),
                (com.liferay.portal.service.ServiceContext) arguments[6]);
        }

        if (_methodName41.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes41, parameterTypes)) {
            return KaleoDraftDefinitionLocalServiceUtil.deleteKaleoDraftDefinition((java.lang.String) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.service.ServiceContext) arguments[3]);
        }

        if (_methodName42.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes42, parameterTypes)) {
            KaleoDraftDefinitionLocalServiceUtil.deleteKaleoDraftDefinitions((java.lang.String) arguments[0],
                ((Integer) arguments[1]).intValue(),
                (com.liferay.portal.service.ServiceContext) arguments[2]);

            return null;
        }

        if (_methodName43.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes43, parameterTypes)) {
            return KaleoDraftDefinitionLocalServiceUtil.getKaleoDraftDefinition((java.lang.String) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.service.ServiceContext) arguments[3]);
        }

        if (_methodName44.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes44, parameterTypes)) {
            return KaleoDraftDefinitionLocalServiceUtil.getKaleoDraftDefinitions((java.lang.String) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                ((Integer) arguments[3]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[4],
                (com.liferay.portal.service.ServiceContext) arguments[5]);
        }

        if (_methodName45.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes45, parameterTypes)) {
            return KaleoDraftDefinitionLocalServiceUtil.getKaleoDraftDefinitionsCount((java.lang.String) arguments[0],
                ((Integer) arguments[1]).intValue(),
                (com.liferay.portal.service.ServiceContext) arguments[2]);
        }

        if (_methodName46.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes46, parameterTypes)) {
            return KaleoDraftDefinitionLocalServiceUtil.getLatestKaleoDraftDefinition((java.lang.String) arguments[0],
                ((Integer) arguments[1]).intValue(),
                (com.liferay.portal.service.ServiceContext) arguments[2]);
        }

        if (_methodName47.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes47, parameterTypes)) {
            return KaleoDraftDefinitionLocalServiceUtil.getLatestKaleoDraftDefinitions(((Long) arguments[0]).longValue(),
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                ((Integer) arguments[3]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[4]);
        }

        if (_methodName48.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes48, parameterTypes)) {
            return KaleoDraftDefinitionLocalServiceUtil.getLatestKaleoDraftDefinitionsCount(((Long) arguments[0]).longValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName49.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes49, parameterTypes)) {
            return KaleoDraftDefinitionLocalServiceUtil.incrementKaleoDraftDefinitionDraftVersion(((Long) arguments[0]).longValue(),
                (java.lang.String) arguments[1],
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.service.ServiceContext) arguments[3]);
        }

        if (_methodName50.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes50, parameterTypes)) {
            return KaleoDraftDefinitionLocalServiceUtil.publishKaleoDraftDefinition(((Long) arguments[0]).longValue(),
                (java.lang.String) arguments[1],
                (java.util.Map<java.util.Locale, java.lang.String>) arguments[2],
                (java.lang.String) arguments[3],
                (com.liferay.portal.service.ServiceContext) arguments[4]);
        }

        if (_methodName51.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes51, parameterTypes)) {
            return KaleoDraftDefinitionLocalServiceUtil.updateKaleoDraftDefinition(((Long) arguments[0]).longValue(),
                (java.lang.String) arguments[1],
                (java.util.Map<java.util.Locale, java.lang.String>) arguments[2],
                (java.lang.String) arguments[3],
                ((Integer) arguments[4]).intValue(),
                (com.liferay.portal.service.ServiceContext) arguments[5]);
        }

        throw new UnsupportedOperationException();
    }
}
