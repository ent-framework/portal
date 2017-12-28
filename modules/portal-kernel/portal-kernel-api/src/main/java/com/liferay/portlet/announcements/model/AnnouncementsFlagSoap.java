package com.liferay.portlet.announcements.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.portlet.announcements.service.http.AnnouncementsFlagServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.portlet.announcements.service.http.AnnouncementsFlagServiceSoap
 * @generated
 */
public class AnnouncementsFlagSoap implements Serializable {
    private long _flagId;
    private long _userId;
    private Date _createDate;
    private long _entryId;
    private int _value;

    public AnnouncementsFlagSoap() {
    }

    public static AnnouncementsFlagSoap toSoapModel(AnnouncementsFlag model) {
        AnnouncementsFlagSoap soapModel = new AnnouncementsFlagSoap();

        soapModel.setFlagId(model.getFlagId());
        soapModel.setUserId(model.getUserId());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setEntryId(model.getEntryId());
        soapModel.setValue(model.getValue());

        return soapModel;
    }

    public static AnnouncementsFlagSoap[] toSoapModels(
        AnnouncementsFlag[] models) {
        AnnouncementsFlagSoap[] soapModels = new AnnouncementsFlagSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static AnnouncementsFlagSoap[][] toSoapModels(
        AnnouncementsFlag[][] models) {
        AnnouncementsFlagSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new AnnouncementsFlagSoap[models.length][models[0].length];
        } else {
            soapModels = new AnnouncementsFlagSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static AnnouncementsFlagSoap[] toSoapModels(
        List<AnnouncementsFlag> models) {
        List<AnnouncementsFlagSoap> soapModels = new ArrayList<AnnouncementsFlagSoap>(models.size());

        for (AnnouncementsFlag model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new AnnouncementsFlagSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _flagId;
    }

    public void setPrimaryKey(long pk) {
        setFlagId(pk);
    }

    public long getFlagId() {
        return _flagId;
    }

    public void setFlagId(long flagId) {
        _flagId = flagId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public long getEntryId() {
        return _entryId;
    }

    public void setEntryId(long entryId) {
        _entryId = entryId;
    }

    public int getValue() {
        return _value;
    }

    public void setValue(int value) {
        _value = value;
    }
}
