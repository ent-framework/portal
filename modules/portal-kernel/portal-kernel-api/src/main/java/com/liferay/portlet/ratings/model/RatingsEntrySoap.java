package com.liferay.portlet.ratings.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.portlet.ratings.service.http.RatingsEntryServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.portlet.ratings.service.http.RatingsEntryServiceSoap
 * @generated
 */
public class RatingsEntrySoap implements Serializable {
    private long _entryId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private long _classNameId;
    private long _classPK;
    private double _score;

    public RatingsEntrySoap() {
    }

    public static RatingsEntrySoap toSoapModel(RatingsEntry model) {
        RatingsEntrySoap soapModel = new RatingsEntrySoap();

        soapModel.setEntryId(model.getEntryId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setClassNameId(model.getClassNameId());
        soapModel.setClassPK(model.getClassPK());
        soapModel.setScore(model.getScore());

        return soapModel;
    }

    public static RatingsEntrySoap[] toSoapModels(RatingsEntry[] models) {
        RatingsEntrySoap[] soapModels = new RatingsEntrySoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static RatingsEntrySoap[][] toSoapModels(RatingsEntry[][] models) {
        RatingsEntrySoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new RatingsEntrySoap[models.length][models[0].length];
        } else {
            soapModels = new RatingsEntrySoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static RatingsEntrySoap[] toSoapModels(List<RatingsEntry> models) {
        List<RatingsEntrySoap> soapModels = new ArrayList<RatingsEntrySoap>(models.size());

        for (RatingsEntry model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new RatingsEntrySoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _entryId;
    }

    public void setPrimaryKey(long pk) {
        setEntryId(pk);
    }

    public long getEntryId() {
        return _entryId;
    }

    public void setEntryId(long entryId) {
        _entryId = entryId;
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

    public long getClassNameId() {
        return _classNameId;
    }

    public void setClassNameId(long classNameId) {
        _classNameId = classNameId;
    }

    public long getClassPK() {
        return _classPK;
    }

    public void setClassPK(long classPK) {
        _classPK = classPK;
    }

    public double getScore() {
        return _score;
    }

    public void setScore(double score) {
        _score = score;
    }
}
