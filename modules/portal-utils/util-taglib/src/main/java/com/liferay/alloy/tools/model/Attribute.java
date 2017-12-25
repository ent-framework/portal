package com.liferay.alloy.tools.model;

import com.liferay.alloy.util.TypeUtil;
import org.apache.commons.lang.StringUtils;

public class Attribute extends BaseModel {
    private Component _component;
    private String _defaultValue;
    private String _description;
    private boolean _gettable = true;
    private String _inputType;
    private String _outputType;
    private boolean _required;
    private boolean _settable = true;

    public String getCapitalizedName() {
        return StringUtils.capitalize(getSafeName());
    }

    public Component getComponent() {
        return this._component;
    }

    public void setComponent(Component component) {
        this._component = component;
    }

    public String getDefaultValue() {
        return this._defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this._defaultValue = defaultValue;
    }

    public String getDescription() {
        return this._description;
    }

    public void setDescription(String description) {
        this._description = description;
    }

    public String getInputType() {
        return TypeUtil.getInputJavaType(this._inputType, true);
    }

    public void setInputType(String inputType) {
        this._inputType = inputType;
    }

    public String getInputTypeSimpleClassName() {
        return getTypeSimpleClassName(getRawInputType());
    }

    public String getOutputType() {
        return TypeUtil.getOutputJavaType(this._outputType, true);
    }

    public void setOutputType(String outputType) {
        this._outputType = outputType;
    }

    public String getOutputTypeSimpleClassName() {
        return getTypeSimpleClassName(getRawOutputType());
    }

    public String getRawInputType() {
        return TypeUtil.getInputJavaType(this._inputType, false);
    }

    public String getRawOutputType() {
        return TypeUtil.getOutputJavaType(this._outputType, false);
    }

    public String getSafeName() {
        String safeName = getName();

        if ((getComponent() != null) && (getComponent().isAlloyComponent())) {
            safeName = com.liferay.alloy.util.ReservedAttributeUtil.getSafeName(this);
        }

        if (safeName.indexOf(":") > -1) {
            safeName = StringUtils.substringAfterLast(safeName, ":");
        }


        return safeName;
    }

    public String getTypeSimpleClassName(String type) {
        if (TypeUtil.isPrimitiveType(type)) {
            return type;
        }
        try {
            return Class.forName(type).getSimpleName();
        } catch (ClassNotFoundException e) {
        }


        return "";
    }

    public boolean isEvent() {
        java.util.List<Attribute> events = this._component.getEvents();

        return events.contains(this);
    }

    public boolean isGettable() {
        return this._gettable;
    }

    public void setGettable(boolean gettable) {
        this._gettable = gettable;
    }

    public boolean isRequired() {
        return this._required;
    }

    public void setRequired(boolean required) {
        this._required = required;
    }

    public boolean isSettable() {
        return this._settable;
    }

    public void setSettable(boolean settable) {
        this._settable = settable;
    }
}
