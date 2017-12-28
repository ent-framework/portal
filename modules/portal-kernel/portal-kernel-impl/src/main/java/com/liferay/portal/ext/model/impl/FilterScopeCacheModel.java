package com.liferay.portal.ext.model.impl;

import com.liferay.portal.ext.model.FilterScope;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing FilterScope in entity cache.
 *
 * @author Jeff Qian
 * @see FilterScope
 * @generated
 */
public class FilterScopeCacheModel implements CacheModel<FilterScope>,
    Externalizable {
    public long filterScopeId;
    public String filterName;
    public String className;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{filterScopeId=");
        sb.append(filterScopeId);
        sb.append(", filterName=");
        sb.append(filterName);
        sb.append(", className=");
        sb.append(className);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public FilterScope toEntityModel() {
        FilterScopeImpl filterScopeImpl = new FilterScopeImpl();

        filterScopeImpl.setFilterScopeId(filterScopeId);

        if (filterName == null) {
            filterScopeImpl.setFilterName(StringPool.BLANK);
        } else {
            filterScopeImpl.setFilterName(filterName);
        }

        if (className == null) {
            filterScopeImpl.setClassName(StringPool.BLANK);
        } else {
            filterScopeImpl.setClassName(className);
        }

        filterScopeImpl.resetOriginalValues();

        return filterScopeImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        filterScopeId = objectInput.readLong();
        filterName = objectInput.readUTF();
        className = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(filterScopeId);

        if (filterName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(filterName);
        }

        if (className == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(className);
        }
    }
}
