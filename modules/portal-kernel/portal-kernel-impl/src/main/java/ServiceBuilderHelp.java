import com.liferay.portal.kernel.xml.Document;
import com.liferay.portal.kernel.xml.DocumentException;
import com.liferay.portal.kernel.xml.Element;
import com.liferay.portal.kernel.xml.UnsecureSAXReaderUtil;
import com.liferay.portal.tools.servicebuilder.ServiceBuilder;

/**
 * Created by jeff on 18/12/2017.
 */
public class ServiceBuilderHelp {

    public static void main(String[] args) throws Exception {

        String fileName = "/Workspace/liferay_project/liferay-portal-src-6.2-ce-ga6/portal-impl/src/com/liferay/portal/service.xml";

        String content = ServiceBuilder.getContent(fileName);

        Document document = UnsecureSAXReaderUtil.read(content, true);


        Element rootElement = document.getRootElement();
    }
}
