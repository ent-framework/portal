package com.liferay.portal.ext.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Jeff Qian
 * @generated
 */
public class FilterGroupSoap implements Serializable {
    private String _uuid;
    private long _filterGroupId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private long _groupId;
    private long _filterScopeId;

    public FilterGroupSoap() {
    }

    public static FilterGroupSoap toSoapModel(FilterGroup model) {
        FilterGroupSoap soapModel = new FilterGroupSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setFilterGroupId(model.getFilterGroupId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setFilterScopeId(model.getFilterScopeId());

        return soapModel;
    }

    public static FilterGroupSoap[] toSoapModels(FilterGroup[] models) {
        FilterGroupSoap[] soapModels = new FilterGroupSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static FilterGroupSoap[][] toSoapModels(FilterGroup[][] models) {
        FilterGroupSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new FilterGroupSoap[models.length][models[0].length];
        } else {
            soapModels = new FilterGroupSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static FilterGroupSoap[] toSoapModels(List<FilterGroup> models) {
        List<FilterGroupSoap> soapModels = new ArrayList<FilterGroupSoap>(models.size());

        for (FilterGroup model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new FilterGroupSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _filterGroupId;
    }

    public void setPrimaryKey(long pk) {
        setFilterGroupId(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getFilterGroupId() {
        return _filterGroupId;
    }

    public void setFilterGroupId(long filterGroupId) {
        _filterGroupId = filterGroupId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        _userName = userName;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getFilterScopeId() {
        return _filterScopeId;
    }

    public void setFilterScopeId(long filterScopeId) {
        _filterScopeId = filterScopeId;
    }
}
