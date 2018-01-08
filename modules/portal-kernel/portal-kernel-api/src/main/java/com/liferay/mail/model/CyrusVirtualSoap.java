package com.liferay.mail.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CyrusVirtualSoap implements Serializable {
    private String _emailAddress;
    private String _userId;

    public CyrusVirtualSoap() {
    }

    public static CyrusVirtualSoap toSoapModel(CyrusVirtual model) {
        CyrusVirtualSoap soapModel = new CyrusVirtualSoap();

        soapModel.setEmailAddress(model.getEmailAddress());
        soapModel.setUserId(model.getUserId());

        return soapModel;
    }

    public static CyrusVirtualSoap[] toSoapModels(CyrusVirtual[] models) {
        CyrusVirtualSoap[] soapModels = new CyrusVirtualSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static CyrusVirtualSoap[][] toSoapModels(CyrusVirtual[][] models) {
        CyrusVirtualSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new CyrusVirtualSoap[models.length][models[0].length];
        } else {
            soapModels = new CyrusVirtualSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static CyrusVirtualSoap[] toSoapModels(List<CyrusVirtual> models) {
        List<CyrusVirtualSoap> soapModels = new ArrayList<CyrusVirtualSoap>(models.size());

        for (CyrusVirtual model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new CyrusVirtualSoap[soapModels.size()]);
    }

    public String getPrimaryKey() {
        return _emailAddress;
    }

    public void setPrimaryKey(String pk) {
        setEmailAddress(pk);
    }

    public String getEmailAddress() {
        return _emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        _emailAddress = emailAddress;
    }

    public String getUserId() {
        return _userId;
    }

    public void setUserId(String userId) {
        _userId = userId;
    }
}
