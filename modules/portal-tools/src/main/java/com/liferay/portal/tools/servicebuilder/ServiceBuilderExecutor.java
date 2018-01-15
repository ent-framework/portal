package com.liferay.portal.tools.servicebuilder;

import com.liferay.portal.kernel.util.ClearThreadLocalUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.tools.ArgumentsUtil;
import com.liferay.portal.tools.util.InitUtil;
import org.apache.commons.lang.StringUtils;

import java.beans.Introspector;
import java.util.Map;

public class ServiceBuilderExecutor {

    public static void main(String[] args) {
        Map<String, String> arguments = ArgumentsUtil.parseArguments(args);

        String resourceActionDir = arguments.get("resouces.actions.dir");

        String fileName = arguments.get("service.input.file");
        String hbmFileName = arguments.get("service.hbm.file");
        String ormFileName = arguments.get("service.orm.file");
        String modelHintsFileName = arguments.get("service.model.hints.file");
        String springFileName = arguments.get("service.spring.file");
        String springBaseFileName = arguments.get("service.spring.base.file");
        String springClusterFileName = arguments.get("service.spring.cluster.file");
        String springDynamicDataSourceFileName = arguments.get("service.spring.dynamic.data.source.file");
        String springHibernateFileName = arguments.get("service.spring.hibernate.file");
        String springInfrastructureFileName = arguments.get("service.spring.infrastructure.file");
        String springShardDataSourceFileName = arguments.get("service.spring.shard.data.source.file");
        String apiDir = arguments.get("service.api.dir");
        String implDir = arguments.get("service.impl.dir");
        String remotingFileName = arguments.get("service.remoting.file");
        String sqlDir = arguments.get("service.sql.dir");
        String sqlFileName = arguments.get("service.sql.file");
        String sqlIndexesFileName = arguments.get("service.sql.indexes.file");
        String sqlIndexesPropertiesFileName = arguments.get("service.sql.indexes.properties.file");
        String sqlSequencesFileName = arguments.get("service.sql.sequences.file");
        boolean autoNamespaceTables = GetterUtil.getBoolean(arguments.get("service.auto.namespace.tables"));
        String beanLocatorUtil = arguments.get("service.bean.locator.util");
        String propsUtil = arguments.get("service.props.util");
        String pluginName = arguments.get("service.plugin.name");
        String targetEntityName = arguments.get("service.target.entity.name");
        String testDir = arguments.get("service.test.dir");
        long buildNumber = GetterUtil.getLong(arguments.get("service.build.number"), 1);
        boolean buildNumberIncrement = GetterUtil.getBoolean(arguments.get("service.build.number.increment"), true);

        InitUtil.init(modelHintsFileName, resourceActionDir);

        String[] filesNames = StringUtils.split(fileName, ",");

        if (filesNames!=null && filesNames.length>0) {
            for (String _fileName : filesNames) {
                try {
                    new ServiceBuilder(
                            _fileName, hbmFileName, ormFileName, modelHintsFileName,
                            springFileName, springBaseFileName, springClusterFileName,
                            springDynamicDataSourceFileName, springHibernateFileName,
                            springInfrastructureFileName, springShardDataSourceFileName,
                            apiDir, implDir, remotingFileName, sqlDir, sqlFileName,
                            sqlIndexesFileName, sqlIndexesPropertiesFileName,
                            sqlSequencesFileName, autoNamespaceTables, beanLocatorUtil,
                            propsUtil, pluginName, targetEntityName, testDir, true,
                            buildNumber, buildNumberIncrement);
                }
                catch (RuntimeException re) {
                    System.out.println(
                            "Please set these required arguments. Sample values are:\n" +
                                    "\n" +
                                    "\tservice.input.file=${service.file}\n" +
                                    "\tservice.hbm.file=${basedir}/src/META-INF/portal-hbm.xml\n" +
                                    "\tservice.orm.file=${basedir}/src/META-INF/portal-orm.xml\n" +
                                    "\tservice.model.hints.file=${basedir}/src/META-INF/portal-model-hints.xml\n" +
                                    "\tservice.spring.file=${basedir}/src/META-INF/portal-spring.xml\n" +
                                    "\tservice.api.dir=${basedir}/../portal-service/src\n" +
                                    "\tservice.impl.dir=${basedir}/src\n" +
                                    "\tservice.remoting.file=${basedir}/../portal-web/docroot/WEB-INF/remoting-servlet.xml\n" +
                                    "\tservice.sql.dir=${basedir}/../sql\n" +
                                    "\tservice.sql.file=portal-tables.sql\n" +
                                    "\tservice.sql.indexes.file=indexes.sql\n" +
                                    "\tservice.sql.indexes.properties.file=indexes.properties\n" +
                                    "\tservice.sql.sequences.file=sequences.sql\n" +
                                    "\tservice.bean.locator.util=com.liferay.portal.kernel.bean.PortalBeanLocatorUtil\n" +
                                    "\tservice.props.util=com.liferay.portal.util.PropsUtil\n" +
                                    "\tservice.target.entity.name=${service.target.entity.name}\n" +
                                    "\tservice.test.dir=${basedir}/test/integration\n" +
                                    "\tservice.build.number=1\n" +
                                    "\tservice.build.number.increment=true\n" +
                                    "\n" +
                                    "You can also customize the generated code by overriding the default templates with these optional system properties:\n" +
                                    "\n" +
                                    "\t-Dservice.tpl.bad_alias_names=" + ServiceBuilder._TPL_ROOT + "bad_alias_names.txt\n"+
                                    "\t-Dservice.tpl.bad_column_names=" + ServiceBuilder._TPL_ROOT + "bad_column_names.txt\n"+
                                    "\t-Dservice.tpl.bad_json_types=" + ServiceBuilder._TPL_ROOT + "bad_json_types.txt\n"+
                                    "\t-Dservice.tpl.bad_table_names=" + ServiceBuilder._TPL_ROOT + "bad_table_names.txt\n"+
                                    "\t-Dservice.tpl.base_mode_impl=" + ServiceBuilder._TPL_ROOT + "base_mode_impl.ftl\n"+
                                    "\t-Dservice.tpl.blob_model=" + ServiceBuilder._TPL_ROOT + "blob_model.ftl\n"+
                                    "\t-Dservice.tpl.copyright.txt=copyright.txt\n"+
                                    "\t-Dservice.tpl.ejb_pk=" + ServiceBuilder._TPL_ROOT + "ejb_pk.ftl\n"+
                                    "\t-Dservice.tpl.exception=" + ServiceBuilder._TPL_ROOT + "exception.ftl\n"+
                                    "\t-Dservice.tpl.export_actionable_dynamic_query=" + ServiceBuilder._TPL_ROOT + "export_actionable_dynamic_query.ftl\n"+
                                    "\t-Dservice.tpl.extended_model=" + ServiceBuilder._TPL_ROOT + "extended_model.ftl\n"+
                                    "\t-Dservice.tpl.extended_model_base_impl=" + ServiceBuilder._TPL_ROOT + "extended_model_base_impl.ftl\n"+
                                    "\t-Dservice.tpl.extended_model_impl=" + ServiceBuilder._TPL_ROOT + "extended_model_impl.ftl\n"+
                                    "\t-Dservice.tpl.finder=" + ServiceBuilder._TPL_ROOT + "finder.ftl\n"+
                                    "\t-Dservice.tpl.finder_util=" + ServiceBuilder._TPL_ROOT + "finder_util.ftl\n"+
                                    "\t-Dservice.tpl.hbm_xml=" + ServiceBuilder._TPL_ROOT + "hbm_xml.ftl\n"+
                                    "\t-Dservice.tpl.orm_xml=" + ServiceBuilder._TPL_ROOT + "orm_xml.ftl\n"+
                                    "\t-Dservice.tpl.json_js=" + ServiceBuilder._TPL_ROOT + "json_js.ftl\n"+
                                    "\t-Dservice.tpl.json_js_method=" + ServiceBuilder._TPL_ROOT + "json_js_method.ftl\n"+
                                    "\t-Dservice.tpl.model=" + ServiceBuilder._TPL_ROOT + "model.ftl\n"+
                                    "\t-Dservice.tpl.model_cache=" + ServiceBuilder._TPL_ROOT + "model_cache.ftl\n"+
                                    "\t-Dservice.tpl.model_hints_xml=" + ServiceBuilder._TPL_ROOT + "model_hints_xml.ftl\n"+
                                    "\t-Dservice.tpl.model_impl=" + ServiceBuilder._TPL_ROOT + "model_impl.ftl\n"+
                                    "\t-Dservice.tpl.model_soap=" + ServiceBuilder._TPL_ROOT + "model_soap.ftl\n"+
                                    "\t-Dservice.tpl.model_wrapper=" + ServiceBuilder._TPL_ROOT + "model_wrapper.ftl\n"+
                                    "\t-Dservice.tpl.persistence=" + ServiceBuilder._TPL_ROOT + "persistence.ftl\n"+
                                    "\t-Dservice.tpl.persistence_impl=" + ServiceBuilder._TPL_ROOT + "persistence_impl.ftl\n"+
                                    "\t-Dservice.tpl.persistence_util=" + ServiceBuilder._TPL_ROOT + "persistence_util.ftl\n"+
                                    "\t-Dservice.tpl.props=" + ServiceBuilder._TPL_ROOT + "props.ftl\n"+
                                    "\t-Dservice.tpl.remoting_xml=" + ServiceBuilder._TPL_ROOT + "remoting_xml.ftl\n"+
                                    "\t-Dservice.tpl.service=" + ServiceBuilder._TPL_ROOT + "service.ftl\n"+
                                    "\t-Dservice.tpl.service_base_impl=" + ServiceBuilder._TPL_ROOT + "service_base_impl.ftl\n"+
                                    "\t-Dservice.tpl.service_clp=" + ServiceBuilder._TPL_ROOT + "service_clp.ftl\n"+
                                    "\t-Dservice.tpl.service_clp_invoker=" + ServiceBuilder._TPL_ROOT + "service_clp_invoker.ftl\n"+
                                    "\t-Dservice.tpl.service_clp_message_listener=" + ServiceBuilder._TPL_ROOT + "service_clp_message_listener.ftl\n"+
                                    "\t-Dservice.tpl.service_clp_serializer=" + ServiceBuilder._TPL_ROOT + "service_clp_serializer.ftl\n"+
                                    "\t-Dservice.tpl.service_http=" + ServiceBuilder._TPL_ROOT + "service_http.ftl\n"+
                                    "\t-Dservice.tpl.service_impl=" + ServiceBuilder._TPL_ROOT + "service_impl.ftl\n"+
                                    "\t-Dservice.tpl.service_soap=" + ServiceBuilder._TPL_ROOT + "service_soap.ftl\n"+
                                    "\t-Dservice.tpl.service_util=" + ServiceBuilder._TPL_ROOT + "service_util.ftl\n"+
                                    "\t-Dservice.tpl.service_wrapper=" + ServiceBuilder._TPL_ROOT + "service_wrapper.ftl\n"+
                                    "\t-Dservice.tpl.spring_base_xml=" + ServiceBuilder._TPL_ROOT + "spring_base_xml.ftl\n"+
                                    "\t-Dservice.tpl.spring_hibernate_xml=" + ServiceBuilder._TPL_ROOT + "spring_hibernate_xml.ftl\n"+
                                    "\t-Dservice.tpl.spring_infrastructure_xml=" + ServiceBuilder._TPL_ROOT + "spring_infrastructure_xml.ftl\n"+
                                    "\t-Dservice.tpl.spring_xml=" + ServiceBuilder._TPL_ROOT + "spring_xml.ftl\n"+
                                    "\t-Dservice.tpl.spring_xml_session=" + ServiceBuilder._TPL_ROOT + "spring_xml_session.ftl");

                    throw re;
                }
            }
        }



        try {
            ClearThreadLocalUtil.clearThreadLocal();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        Introspector.flushCaches();
    }

}
