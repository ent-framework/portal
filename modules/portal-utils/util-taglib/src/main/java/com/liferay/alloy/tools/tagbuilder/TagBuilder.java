package com.liferay.alloy.tools.tagbuilder;

import com.liferay.alloy.tools.model.Attribute;
import com.liferay.alloy.tools.model.Component;
import com.liferay.alloy.util.TypeUtil;
import com.liferay.portal.util.FreeMarkerUtil;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.xml.*;
import org.apache.commons.lang.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.*;

//import com.liferay.portal.util.FileImpl;
//import com.liferay.portal.util.PropsImpl;
//import com.liferay.portal.xml.SAXReaderImpl;


public class TagBuilder {
    public static final String[] DEFAULT_AUTHORS = {"Eduardo Lundgren", "Bruno Basto", "Nathan Cavanaugh"};
    private static final String _AFTER = "after";
    private static final String _ATTRIBUTE = "attribute";
    private static final String _ATTRIBUTES = "attributes";
    private static final String _AUTHOR = "author";
    private static final String _AUTHORS = "authors";
    private static final String _BASE = "base";
    private static final String _BASE_CLASS_PREFIX = "Base";
    private static final String _CLASS_SUFFIX = ".java";
    private static final String _COMPONENT = "component";
    private static final String _DEFAULT_NAMESPACE = "alloy";
    private static final String _DEFAULT_PARENT_CLASS = "com.liferay.taglib.util.IncludeTag";
    private static final String _DEFAULT_TAGLIB_SHORT_NAME = "alloy";
    private static final String _DEFAULT_TAGLIB_URI = "http://alloy.liferay.com/tld/alloy";
    private static final String _DEFAULT_TAGLIB_VERSION = "1.0";
    private static final String _DEFAULT_TYPE = "java.lang.Object";
    private static final String _EVENT = "event";
    private static final String _EVENTS = "events";
    private static final String _INIT_EXT_PAGE = "/init-ext.jspf";
    private static final String _INIT_PAGE = "/init.jsp";
    private static final String _ON = "on";
    private static final String _PAGE = "/page.jsp";
    private static final String _START_PAGE = "/start.jsp";
    private static final String _TLD_EXTENSION = ".tld";
    private static final String _TLD_XPATH_PREFIX = "tld";
    private static final String _TLD_XPATH_URI = "http://java.sun.com/xml/ns/j2ee";
    private static String _copyrightYear;
    private List<Document> _componentsExtDoc;
    private List<String> _componentsXML;
    private String _docrootDir;
    private String _javaDir;
    private String _javaPackage;
    private String _jspCommonInitPath;
    private String _jspDir;
    private String _templatesDir;
    private String _tldDir;
    private String _tplCommonInitJsp;
    private String _tplInitJsp;
    private String _tplJsp;
    private String _tplStartJsp;
    private String _tplTag;
    private String _tplTagBase;
    private String _tplTld;
    public TagBuilder(String componentsXML, String templatesDir, String javaDir, String docrootDir, String javaPackage, String jspDir, String jspCommonInitPath, String tldDir)
            throws Exception {
//    if (PropsUtil.getProps() == null) {
//      PropsUtil.setProps(new PropsImpl());
//    }
//
//    if (SAXReaderUtil.getSecureSAXReader() == null) {
//      new SAXReaderUtil().setSecureSAXReader(new SAXReaderImpl());
//    }

        this._componentsXML = Arrays.asList(StringUtil.split(componentsXML));
        this._templatesDir = templatesDir;
        this._javaDir = javaDir;
        this._docrootDir = docrootDir;
        this._javaPackage = javaPackage;
        this._jspDir = jspDir;
        this._jspCommonInitPath = jspCommonInitPath;
        this._tldDir = tldDir;

        this._tplTld = (this._templatesDir + "tld.ftl");
        this._tplTag = (this._templatesDir + "tag.ftl");
        this._tplTagBase = (this._templatesDir + "tag_base.ftl");
        this._tplCommonInitJsp = (this._templatesDir + "common_init_jsp.ftl");
        this._tplJsp = (this._templatesDir + "jsp.ftl");
        this._tplInitJsp = (this._templatesDir + "init_jsp.ftl");
        this._tplStartJsp = (this._templatesDir + "start_jsp.ftl");

        this._componentsExtDoc = new ArrayList();

        for (String componentExtXML : this._componentsXML) {
            File extFile = new File(componentExtXML);

            if (extFile.exists()) {
                this._componentsExtDoc.add(SAXReaderUtil.read(extFile));
            }
        }

        _create();
    }

    public static void main(String[] args)
            throws Exception {
        String componentsXML = System.getProperty("tagbuilder.components.xml");
        String copyrightYear = System.getProperty("tagbuilder.copyright.year");
        String docrootDir = System.getProperty("tagbuilder.docroot.dir");
        String javaDir = System.getProperty("tagbuilder.java.dir");
        String javaPackage = System.getProperty("tagbuilder.java.package");
        String jspCommonInitPath = System.getProperty("tagbuilder.jsp.common.init.path");

        String jspDir = System.getProperty("tagbuilder.jsp.dir");
        String templatesDir = System.getProperty("tagbuilder.templates.dir");
        String tldDir = System.getProperty("tagbuilder.tld.dir");

        Calendar calendar = Calendar.getInstance();

        _copyrightYear = String.valueOf(calendar.get(1));

        if (Validator.isNotNull(copyrightYear)) {
            _copyrightYear = copyrightYear;
        }

        new TagBuilder(componentsXML, templatesDir, javaDir, docrootDir, javaPackage, jspDir, jspCommonInitPath, tldDir);
    }

    protected List<Component> getAllComponents()
            throws Exception {
        Document doc = SAXReaderUtil.createDocument();

        Document taglibsDoc = SAXReaderUtil.read("<taglibs></taglibs>");

        Element root = taglibsDoc.getRootElement();

        for (Document extDoc : this._componentsExtDoc) {
            Element extRoot = extDoc.getRootElement();

            String defaultPackage = extRoot.attributeValue("short-name");
            List<Element> extComponentNodes = extRoot.elements("component");

            for (Element extComponent : extComponentNodes) {
                String extComponentPackage = GetterUtil.getString(extComponent.attributeValue("package"), defaultPackage);


                extComponent.addAttribute("package", extComponentPackage);
            }

            Document parentDoc = getComponentsDocByShortName(extDoc.getRootElement().attributeValue("extends"));


            if (parentDoc != null) {
                extDoc = mergeXMLAttributes(extDoc, parentDoc);
            }

            Element authors;

            authors = extRoot.element("authors");

            List<Element> components = extRoot.elements("component");

            for (Element component : components) {
                Element copy = component.createCopy();
                Element componentAuthors = copy.element("authors");

                if ((authors != null) && (componentAuthors == null)) {
                    copy.add(authors.createCopy());
                }

                root.add(copy);
            }
        }

        doc.add(root.createCopy());

        return getComponents(doc);
    }

    protected List<Attribute> getAttributes(Element componentNode) {
        return getAttributes(componentNode, "attributes", "attribute");
    }

    protected List<Attribute> getAttributes(Element componentNode, String group, String nodeName) {
        List<Element> nodes = Collections.emptyList();

        List<Attribute> attributes = new ArrayList();

        Element node = componentNode.element(group);

        if (node != null) {
            nodes = node.elements(nodeName);
        }

        for (Element attributeNode : nodes) {
            String defaultValue = attributeNode.elementText("defaultValue");
            String description = attributeNode.elementText("description");
            String name = attributeNode.elementText("name");
            String type = GetterUtil.getString(attributeNode.elementText("type"), "java.lang.Object");

            String inputType = GetterUtil.getString(attributeNode.elementText("inputType"), type);

            String outputType = GetterUtil.getString(attributeNode.elementText("outputType"), type);


            boolean gettable = GetterUtil.getBoolean(attributeNode.elementText("gettable"), true);

            boolean required = GetterUtil.getBoolean(attributeNode.elementText("required"));

            boolean settable = GetterUtil.getBoolean(attributeNode.elementText("settable"), true);


            Attribute attribute = new Attribute();

            attribute.setDefaultValue(defaultValue);
            attribute.setDescription(description);
            attribute.setGettable(gettable);
            attribute.setInputType(inputType);
            attribute.setName(name);
            attribute.setOutputType(outputType);
            attribute.setRequired(required);
            attribute.setSettable(settable);

            attributes.add(attribute);
        }

        return attributes;
    }

    protected String[] getAuthorList(Element element) {
        List<String> authors = new ArrayList();

        if (element != null) {
            Element elAuthors = element.element("authors");

            if (elAuthors != null) {
                List<Element> authorList = elAuthors.elements("author");

                for (Element author : authorList) {
                    authors.add(author.getText());
                }
            }
        }

        if (authors.isEmpty()) {
            return DEFAULT_AUTHORS;
        }

        return (String[]) authors.toArray(new String[authors.size()]);
    }

    protected Element getComponentNode(Document doc, String name) {
        List<Element> components = doc.getRootElement().elements("component");

        for (Element component : components) {
            if (component.attributeValue("name").equals(name)) {
                return component;
            }
        }

        return null;
    }

    protected List<Component> getComponents(Document doc) throws Exception {
        Element root = doc.getRootElement();

        List<Component> components = new ArrayList();

        String defaultPackage = root.attributeValue("short-name");
        List<Element> allComponentNodes = root.elements("component");

        for (Element node : allComponentNodes) {
            String componentPackage = GetterUtil.getString(node.attributeValue("package"), defaultPackage);


            String name = node.attributeValue("name");

            boolean alloyComponent = GetterUtil.getBoolean(node.attributeValue("alloyComponent"));


            boolean bodyContent = GetterUtil.getBoolean(node.attributeValue("bodyContent"));


            String className = GetterUtil.getString(node.attributeValue("className"));


            String description = node.elementText("description");

            boolean dynamicAttributes = GetterUtil.getBoolean(node.attributeValue("dynamicAttributes"), true);


            String module = GetterUtil.getString(node.attributeValue("module"));

            String parentClass = GetterUtil.getString(node.attributeValue("parentClass"), "com.liferay.taglib.util.IncludeTag");


            boolean writeJSP = GetterUtil.getBoolean(node.attributeValue("writeJSP"), true);


            String[] authors = getAuthorList(node);
            List<Attribute> attributes = getAttributes(node);
            List<Attribute> events = getPrefixedEvents(node);

            Component component = new Component();

            component.setAlloyComponent(alloyComponent);
            component.setAttributes(attributes);
            component.setAuthors(authors);
            component.setBodyContent(bodyContent);
            component.setClassName(className);
            component.setDescription(description);
            component.setDynamicAttributes(dynamicAttributes);
            component.setEvents(events);
            component.setModule(module);
            component.setName(name);
            component.setPackage(componentPackage);
            component.setParentClass(parentClass);
            component.setWriteJSP(writeJSP);

            components.add(component);
        }

        return components;
    }

    protected Document getComponentsDocByShortName(String name) {
        for (Document doc : this._componentsExtDoc) {
            Element root = doc.getRootElement();

            if (root.attributeValue("short-name").equals(name)) {
                return doc;
            }
        }

        return null;
    }

    protected Map<String, Object> getDefaultTemplateContext() {
        Map<String, Object> context = new HashMap();

        context.put("copyrightYear", _copyrightYear);
        context.put("jspCommonInitPath", this._jspCommonInitPath);
        context.put("jspDir", this._jspDir);
        context.put("packagePath", this._javaPackage);
        context.put("typeUtil", TypeUtil.getInstance());

        return context;
    }

    protected Element getElementByName(List<Element> elements, String name) {
        for (Element element : elements) {
            if (name.equals(element.elementText("name"))) {
                return element;
            }
        }

        return null;
    }

    protected String getJavaOutputBaseDir(Component component) {
        StringBuilder sb = new StringBuilder();

        sb.append(getJavaOutputDir(component));
        sb.append("base");
        sb.append("/");

        return sb.toString();
    }

    protected String getJavaOutputDir(Component component) {
        StringBuilder sb = new StringBuilder();

        sb.append(this._javaDir);
        sb.append(component.getPackage());
        sb.append("/");

        return sb.toString();
    }

    protected String getJspDir(Component component) {
        StringBuilder sb = new StringBuilder();

        sb.append(this._jspDir);
        sb.append(component.getPackage());
        sb.append("/");

        return sb.toString();
    }

    protected String getJspOutputDir(Component component) {
        StringBuilder sb = new StringBuilder();

        sb.append(this._docrootDir);
        sb.append("/");
        sb.append(this._jspDir);
        sb.append(component.getPackage());
        sb.append("/");

        return sb.toString();
    }

    protected List<Attribute> getPrefixedEvents(Element componentNode) {
        List<Attribute> afterEvents = getAttributes(componentNode, "events", "event");


        List<Attribute> onEvents = getAttributes(componentNode, "events", "event");


        List<Attribute> prefixedEvents = new ArrayList();

        for (Attribute event : afterEvents) {
            String name = "after".concat(StringUtils.capitalize(event.getSafeName()));


            event.setName(name);

            prefixedEvents.add(event);
        }

        for (Attribute event : onEvents) {
            String name = "on".concat(StringUtils.capitalize(event.getSafeName()));


            event.setName(name);

            prefixedEvents.add(event);
        }

        return prefixedEvents;
    }

    protected Map<String, Object> getTemplateContext(Component component) {
        Map<String, Object> context = getDefaultTemplateContext();

        String jspRelativePath = getJspDir(component).concat(component.getUncamelizedName("_"));


        context.put("component", component);
        context.put("namespace", component.getAttributeNamespace());
        context.put("jspRelativePath", jspRelativePath);

        return context;
    }

    protected Document mergeTlds(Document sourceDoc, Document targetDoc) {
        Element targetRoot = targetDoc.getRootElement();

        XPath xpathTags = SAXReaderUtil.createXPath("//tld:tag", "tld", "http://java.sun.com/xml/ns/j2ee");


        List<Node> sources = xpathTags.selectNodes(sourceDoc);

        for (Node source : sources) {
            Element sourceElement = (Element) source;

            String sourceName = sourceElement.elementText("name");

            String xpathTagValue = "//tld:tag[tld:name='" + sourceName + "']";

            XPath xpathTag = SAXReaderUtil.createXPath(xpathTagValue, "tld", "http://java.sun.com/xml/ns/j2ee");


            List<Node> targets = xpathTag.selectNodes(targetDoc);

            if (targets.size() > 0) {
                Element targetElement = (Element) targets.get(0);

                XPath xpathAttributes = SAXReaderUtil.createXPath(xpathTagValue + "//tld:attribute", "tld", "http://java.sun.com/xml/ns/j2ee");


                List<Node> sourceAttributes = xpathAttributes.selectNodes(source);


                for (Node sourceAttribute : sourceAttributes) {
                    Element sourceAttributeElement = (Element) sourceAttribute;

                    String attributeName = sourceAttributeElement.elementText("name");


                    String xpathAttributeValue = "//tld:attribute[tld:name='" + attributeName + "']";


                    XPath xpathAttribute = SAXReaderUtil.createXPath(xpathTagValue + xpathAttributeValue, "tld", "http://java.sun.com/xml/ns/j2ee");


                    Node targetAttribute = xpathAttribute.selectSingleNode(targetElement);


                    if (targetAttribute != null) {
                        targetAttribute.detach();
                    }

                    targetElement.add(sourceAttributeElement.createCopy());
                }

                Element dynamicAttrElement = targetElement.element("dynamic-attributes");


                if (dynamicAttrElement != null) {
                    targetElement.add(dynamicAttrElement.detach());
                }
            } else {
                targetRoot.add(sourceElement.createCopy());
            }
        }

        return targetDoc;
    }

    protected Document mergeXMLAttributes(Document doc1, Document doc2) {
        Element doc1Root = doc1.getRootElement();

        Element docRoot = doc1Root.createCopy();
        docRoot.clearContent();

        Document doc = SAXReaderUtil.createDocument();
        doc.setRootElement(docRoot);

        List<Element> doc1Components = doc1Root.elements("component");

        for (Element doc1Component : doc1Components) {
            String name = doc1Component.attributeValue("name");

            Element doc2Component = getComponentNode(doc2, name);
            Element doc1EventsNode;
            if (doc2Component != null) {
                Element doc2AttributesNode = doc2Component.element("attributes");
                Element doc1AttributesNode;
                if (doc2AttributesNode != null) {
                    List<Element> doc2Attributes = doc2AttributesNode.elements("attribute");


                    doc1AttributesNode = doc1Component.element("attributes");


                    for (Element doc2Attribute : doc2Attributes) {
                        Element doc1Attribute = getElementByName(doc1AttributesNode.elements("attribute"), doc2Attribute.elementText("name"));


                        if (doc1Attribute == null) {
                            doc1AttributesNode.add(doc2Attribute.createCopy());
                        }
                    }
                }

                Element doc2EventsNode = doc2Component.element("events");

                if (doc2EventsNode != null) {
                    List<Element> doc2Events = doc2EventsNode.elements("event");

                    doc1EventsNode = doc1Component.element("events");

                    for (Element doc2Event : doc2Events) {
                        Element doc1Event = getElementByName(doc1EventsNode.elements("event"), doc2Event.elementText("name"));


                        if (doc1Event == null) {
                            doc1EventsNode.add(doc2Event.createCopy());
                        }
                    }
                }
            }

            doc.getRootElement().add(doc1Component.createCopy());
        }

        return doc;
    }

    protected String processTemplate(String name, Map<String, Object> context)
            throws Exception {
        return StringUtil.replace(FreeMarkerUtil.process(name, context), '\r', "");
    }

    protected void writeFile(File file, String content) {
        writeFile(file, content, true);
    }

    protected void writeFile(File file, String content, boolean overwrite) {
//    if (FileUtil.getFile() == null) {
//      new FileUtil().setFile(new FileImpl());
//    }
        try {
            if ((overwrite) || (!file.exists())) {
                String oldContent = "";

                if (file.exists()) {
                    oldContent = FileUtil.read(file);
                }

                if ((!file.exists()) || (!content.equals(oldContent))) {
                    System.out.println("Writing " + file);

                    FileUtil.write(file, content);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void _create() throws Exception {
        List<Component> components = getAllComponents();

        for (Component component : components) {
            Map<String, Object> context = getTemplateContext(component);

            _createBaseTag(component, context);

            if (component.getWriteJSP()) {
                _createPageJSP(component, context);
            }

            _createTag(component, context);
        }

        _createCommonInitJSP();
        _createTld();
    }

    private void _createBaseTag(Component component, Map<String, Object> context) throws Exception {
        StringBuilder sb = new StringBuilder();

        sb.append(getJavaOutputBaseDir(component));
        sb.append("Base");
        sb.append(component.getClassName());
        sb.append(".java");

        String content = processTemplate(this._tplTagBase, context);

        File tagFile = new File(sb.toString());

        writeFile(tagFile, content);
    }

    private void _createCommonInitJSP() throws Exception {
        Map<String, Object> context = getDefaultTemplateContext();

        String contentCommonInitJsp = processTemplate(this._tplCommonInitJsp, context);


        StringBuilder sb = new StringBuilder();

        sb.append(this._docrootDir);
        sb.append("/");
        sb.append(this._jspCommonInitPath);

        File commonInitFile = new File(sb.toString());

        writeFile(commonInitFile, contentCommonInitJsp, false);
    }


    private void _createPageJSP(Component component, Map<String, Object> context)
            throws Exception {
        String pathName = component.getUncamelizedName("_");
        String path = getJspOutputDir(component).concat(pathName);

        String contentJsp = processTemplate(this._tplJsp, context);
        String contentInitJsp = processTemplate(this._tplInitJsp, context);

        File initFile = new File(path.concat("/init.jsp"));
        File initExtFile = new File(path.concat("/init-ext.jspf"));

        writeFile(initFile, contentInitJsp);
        writeFile(initExtFile, "", false);

        if (component.isBodyContent()) {
            String contentStart = processTemplate(this._tplStartJsp, context);

            File startFile = new File(path.concat("/start.jsp"));

            writeFile(startFile, contentStart, false);
        } else {
            File pageFile = new File(path.concat("/page.jsp"));

            writeFile(pageFile, contentJsp, false);
        }
    }

    private void _createTag(Component component, Map<String, Object> context)
            throws Exception {
        StringBuilder sb = new StringBuilder();

        sb.append(getJavaOutputDir(component));
        sb.append(component.getClassName());
        sb.append(".java");

        String content = processTemplate(this._tplTag, context);

        File tagFile = new File(sb.toString());

        writeFile(tagFile, content, false);
    }

    private void _createTld() throws Exception {
        Map<String, Object> context = getDefaultTemplateContext();

        for (Document doc : this._componentsExtDoc) {
            Element root = doc.getRootElement();

            String description = GetterUtil.getString(root.elementText("description"), "");

            String shortName = GetterUtil.getString(root.attributeValue("short-name"), "alloy");

            String uri = GetterUtil.getString(root.attributeValue("uri"), "http://alloy.liferay.com/tld/alloy");

            String version = GetterUtil.getString(root.attributeValue("tlib-version"), "1.0");


            context.put("alloyComponent", Boolean.valueOf(shortName.equals("alloy")));
            context.put("description", description);
            context.put("shortName", shortName);
            context.put("uri", uri);
            context.put("version", version);
            context.put("components", getComponents(doc));

            String tldFilePath = this._tldDir.concat(shortName).concat(".tld");


            File tldFile = new File(tldFilePath);

            String content = processTemplate(this._tplTld, context);

            Document source = SAXReaderUtil.read(content);

            if (tldFile.exists()) {
                Document target = SAXReaderUtil.read(tldFile);

                source = mergeTlds(source, target);
            }

            writeFile(tldFile, source.formattedString());
        }
    }
}
