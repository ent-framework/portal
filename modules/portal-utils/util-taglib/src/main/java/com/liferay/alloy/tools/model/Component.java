package com.liferay.alloy.tools.model;

import java.util.List;

public class Component extends BaseModel {
  private static final String _CLASS_NAME_SUFFIX = "Tag";
  private boolean _alloyComponent;
  private List<Attribute> _attributes;
  private String[] _authors;
  private boolean _bodyContent;
  private String _className;
  
  public String getAttributeNamespace() { StringBuilder sb = new StringBuilder();
    
    sb.append(this._package);
    sb.append(":");
    sb.append(getUncamelizedName());
    sb.append(":");
    
    return sb.toString().toLowerCase(); }
  
  private String _description;
  
  public List<Attribute> getAttributes() { return this._attributes; }
  
  private boolean _dynamicAttributes;
  
  public List<Attribute> getAttributesAndEvents() { java.util.ArrayList<Attribute> attributes = new java.util.ArrayList();
    
    attributes.addAll(this._attributes);
    attributes.addAll(this._events);
    
    return attributes; }
  
  private List<Attribute> _events;
  
  public String[] getAuthors() { return this._authors; }
  
  private String _module;
  
  public String getCamelizedName() { return com.liferay.portal.kernel.util.TextFormatter.format(getName(), 12); }
  
  private String _package;
  
  public String getClassName() { String className = this._className;
    
    if (com.liferay.portal.kernel.util.Validator.isNull(className)) {
      className = getSafeName().concat("Tag");
    }
    
    return className; }
  
  private String _parentClass;
  private boolean _writeJSP;
  public String getDescription() { return this._description; }
  
  public List<Attribute> getEvents()
  {
    return this._events;
  }
  
  public String getModule() {
    return this._module;
  }
  
  public String getPackage() {
    return this._package;
  }
  
  public String getParentClass() {
    return this._parentClass;
  }
  
  public String getSafeName() {
    return com.liferay.portal.kernel.util.StringUtil.replace(getName(), ".", "");
  }
  
  public String getUncamelizedName()
  {
    String name = getName().replaceAll("\\.", "-");
    
    return com.liferay.portal.kernel.util.TextFormatter.format(name, 15);
  }
  
  public String getUncamelizedName(String delimiter) {
    return getUncamelizedName().replaceAll("\\-", delimiter);
  }
  
  public boolean getWriteJSP() {
    return this._writeJSP;
  }
  
  public boolean isAlloyComponent() {
    return this._alloyComponent;
  }
  
  public boolean isBodyContent() {
    return this._bodyContent;
  }
  
  public boolean isDynamicAttributes() {
    return this._dynamicAttributes;
  }
  
  public void setAlloyComponent(boolean alloyComponent) {
    this._alloyComponent = alloyComponent;
  }
  
  public void setAttributes(List<Attribute> attributes) {
    this._attributes = attributes;
    
    for (Attribute attribute : attributes) {
      attribute.setComponent(this);
    }
  }
  
  public void setAuthors(String[] authors) {
    this._authors = authors;
  }
  
  public void setBodyContent(boolean bodyContent) {
    this._bodyContent = bodyContent;
  }
  
  public void setClassName(String className) {
    this._className = className;
  }
  
  public void setDescription(String description) {
    this._description = description;
  }
  
  public void setDynamicAttributes(boolean dynamicAttributes) {
    this._dynamicAttributes = dynamicAttributes;
  }
  
  public void setEvents(List<Attribute> events) {
    this._events = events;
    
    for (Attribute event : events) {
      event.setComponent(this);
    }
  }
  
  public void setModule(String type) {
    this._module = type;
  }
  
  public void setPackage(String componentPackage) {
    this._package = componentPackage;
  }
  
  public void setParentClass(String parentClass) {
    this._parentClass = parentClass;
  }
  
  public void setWriteJSP(boolean writeJSP) {
    this._writeJSP = writeJSP;
  }
}
