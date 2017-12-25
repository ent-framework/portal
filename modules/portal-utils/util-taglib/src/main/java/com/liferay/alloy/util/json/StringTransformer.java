package com.liferay.alloy.util.json;

import com.liferay.portal.kernel.json.JSONTransformer;
import flexjson.Path;
import flexjson.TypeContext;
import flexjson.transformer.AbstractTransformer;

import java.util.Collections;
import java.util.List;


public class StringTransformer
        extends AbstractTransformer
        implements JSONTransformer {
    private static final String _AFTER = "after";
    private static final String _ON = "on";
    private List<String> _javaScriptAttributes = Collections.EMPTY_LIST;

    public List<String> getJavaScriptAttributes() {
        return this._javaScriptAttributes;
    }

    public void setJavaScriptAttributes(List<String> javaScriptAttributes) {
        this._javaScriptAttributes = javaScriptAttributes;
    }

    public boolean isEventPath(Path path) {
        String parentPath = path.toString();

        if (path.length() > 1) {
            parentPath = (String) path.getPath().get(path.length() - 2);
        }

        if ((parentPath.equals("on")) || (parentPath.equals("after"))) {
            return true;
        }

        return false;
    }

    public boolean isJavaScriptAttribute(String key) {
        return this._javaScriptAttributes.contains(key);
    }

    public void transform(Object object) {
        Path path = getContext().getPath();
        TypeContext typeContext = getContext().peekTypeContext();

        if (typeContext != null) {
            String propertyName = typeContext.getPropertyName();

            if ((isEventPath(path)) || (isJavaScriptAttribute(propertyName))) {

                getContext().write((String) object);
            } else {
                getContext().writeQuoted((String) object);
            }
        } else {
            getContext().write((String) object);
        }
    }
}
