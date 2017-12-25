package com.liferay.alloy.tools.model;

import java.util.List;

public class Component extends BaseModel {
    private static final String _CLASS_NAME_SUFFIX = "Tag";
    private boolean _alloyComponent;
    private List<Attribute> _attributes;
    private String[] _authors;
    private boolean _bodyContent;
    private String _className;
    private String _description;
    private boolean _dynamicAttributes;
    private List<Attribute> _events;
    private String _module;
    private String _package;
    private String _parentClass;
    private boolean _writeJSP;

    public String getAttributeNamespace() {
        StringBuilder sb = new StringBuilder();

        sb.append(this._package);
        sb.append(":");
        sb.append(getUncamelizedName());
        sb.append(":");

        return sb.toString().toLowerCase();
    }

    public List<Attribute> getAttributes() {
        return this._attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this._attributes = attributes;

        for (Attribute attribute : attributes) {
            attribute.setComponent(this);
        }
    }

    public List<Attribute> getAttributesAndEvents() {
        java.util.ArrayList<Attribute> attributes = new java.util.ArrayList();

        attributes.addAll(this._attributes);
        attributes.addAll(this._events);

        return attributes;
    }

    public String[] getAuthors() {
        return this._authors;
    }

    public void setAuthors(String[] authors) {
        this._authors = authors;
    }

    public String getCamelizedName() {
        return com.liferay.portal.kernel.util.TextFormatter.format(getName(), 12);
    }

    public String getClassName() {
        String className = this._className;

        if (com.liferay.portal.kernel.util.Validator.isNull(className)) {
            className = getSafeName().concat("Tag");
        }

        return className;
    }

    public void setClassName(String className) {
        this._className = className;
    }

    public String getDescription() {
        return this._description;
    }

    public void setDescription(String description) {
        this._description = description;
    }

    public List<Attribute> getEvents() {
        return this._events;
    }

    public void setEvents(List<Attribute> events) {
        this._events = events;

        for (Attribute event : events) {
            event.setComponent(this);
        }
    }

    public String getModule() {
        return this._module;
    }

    public void setModule(String type) {
        this._module = type;
    }

    public String getPackage() {
        return this._package;
    }

    public void setPackage(String componentPackage) {
        this._package = componentPackage;
    }

    public String getParentClass() {
        return this._parentClass;
    }

    public void setParentClass(String parentClass) {
        this._parentClass = parentClass;
    }

    public String getSafeName() {
        return com.liferay.portal.kernel.util.StringUtil.replace(getName(), ".", "");
    }

    public String getUncamelizedName() {
        String name = getName().replaceAll("\\.", "-");

        return com.liferay.portal.kernel.util.TextFormatter.format(name, 15);
    }

    public String getUncamelizedName(String delimiter) {
        return getUncamelizedName().replaceAll("\\-", delimiter);
    }

    public boolean getWriteJSP() {
        return this._writeJSP;
    }

    public void setWriteJSP(boolean writeJSP) {
        this._writeJSP = writeJSP;
    }

    public boolean isAlloyComponent() {
        return this._alloyComponent;
    }

    public void setAlloyComponent(boolean alloyComponent) {
        this._alloyComponent = alloyComponent;
    }

    public boolean isBodyContent() {
        return this._bodyContent;
    }

    public void setBodyContent(boolean bodyContent) {
        this._bodyContent = bodyContent;
    }

    public boolean isDynamicAttributes() {
        return this._dynamicAttributes;
    }

    public void setDynamicAttributes(boolean dynamicAttributes) {
        this._dynamicAttributes = dynamicAttributes;
    }
}
