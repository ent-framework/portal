package com.liferay.portlet.dynamicdatamapping.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DDMStructureLinkSoap implements Serializable {
    private long _structureLinkId;
    private long _classNameId;
    private long _classPK;
    private long _structureId;

    public DDMStructureLinkSoap() {
    }

    public static DDMStructureLinkSoap toSoapModel(DDMStructureLink model) {
        DDMStructureLinkSoap soapModel = new DDMStructureLinkSoap();

        soapModel.setStructureLinkId(model.getStructureLinkId());
        soapModel.setClassNameId(model.getClassNameId());
        soapModel.setClassPK(model.getClassPK());
        soapModel.setStructureId(model.getStructureId());

        return soapModel;
    }

    public static DDMStructureLinkSoap[] toSoapModels(DDMStructureLink[] models) {
        DDMStructureLinkSoap[] soapModels = new DDMStructureLinkSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static DDMStructureLinkSoap[][] toSoapModels(
        DDMStructureLink[][] models) {
        DDMStructureLinkSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new DDMStructureLinkSoap[models.length][models[0].length];
        } else {
            soapModels = new DDMStructureLinkSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static DDMStructureLinkSoap[] toSoapModels(
        List<DDMStructureLink> models) {
        List<DDMStructureLinkSoap> soapModels = new ArrayList<DDMStructureLinkSoap>(models.size());

        for (DDMStructureLink model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new DDMStructureLinkSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _structureLinkId;
    }

    public void setPrimaryKey(long pk) {
        setStructureLinkId(pk);
    }

    public long getStructureLinkId() {
        return _structureLinkId;
    }

    public void setStructureLinkId(long structureLinkId) {
        _structureLinkId = structureLinkId;
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

    public long getStructureId() {
        return _structureId;
    }

    public void setStructureId(long structureId) {
        _structureId = structureId;
    }
}
