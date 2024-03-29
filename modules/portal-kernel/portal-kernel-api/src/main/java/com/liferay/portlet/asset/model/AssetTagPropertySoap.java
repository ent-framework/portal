package com.liferay.portlet.asset.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.portlet.asset.service.http.AssetTagPropertyServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.portlet.asset.service.http.AssetTagPropertyServiceSoap
 * @generated
 */
public class AssetTagPropertySoap implements Serializable {
    private long _tagPropertyId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private long _tagId;
    private String _key;
    private String _value;

    public AssetTagPropertySoap() {
    }

    public static AssetTagPropertySoap toSoapModel(AssetTagProperty model) {
        AssetTagPropertySoap soapModel = new AssetTagPropertySoap();

        soapModel.setTagPropertyId(model.getTagPropertyId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setTagId(model.getTagId());
        soapModel.setKey(model.getKey());
        soapModel.setValue(model.getValue());

        return soapModel;
    }

    public static AssetTagPropertySoap[] toSoapModels(AssetTagProperty[] models) {
        AssetTagPropertySoap[] soapModels = new AssetTagPropertySoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static AssetTagPropertySoap[][] toSoapModels(
        AssetTagProperty[][] models) {
        AssetTagPropertySoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new AssetTagPropertySoap[models.length][models[0].length];
        } else {
            soapModels = new AssetTagPropertySoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static AssetTagPropertySoap[] toSoapModels(
        List<AssetTagProperty> models) {
        List<AssetTagPropertySoap> soapModels = new ArrayList<AssetTagPropertySoap>(models.size());

        for (AssetTagProperty model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new AssetTagPropertySoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _tagPropertyId;
    }

    public void setPrimaryKey(long pk) {
        setTagPropertyId(pk);
    }

    public long getTagPropertyId() {
        return _tagPropertyId;
    }

    public void setTagPropertyId(long tagPropertyId) {
        _tagPropertyId = tagPropertyId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
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

    public long getTagId() {
        return _tagId;
    }

    public void setTagId(long tagId) {
        _tagId = tagId;
    }

    public String getKey() {
        return _key;
    }

    public void setKey(String key) {
        _key = key;
    }

    public String getValue() {
        return _value;
    }

    public void setValue(String value) {
        _value = value;
    }
}
