package com.liferay.mail.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.mail.service.http.CyrusUserServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.mail.service.http.CyrusUserServiceSoap
 * @generated
 */
public class CyrusUserSoap implements Serializable {
    private String _userId;
    private String _password;

    public CyrusUserSoap() {
    }

    public static CyrusUserSoap toSoapModel(CyrusUser model) {
        CyrusUserSoap soapModel = new CyrusUserSoap();

        soapModel.setUserId(model.getUserId());
        soapModel.setPassword(model.getPassword());

        return soapModel;
    }

    public static CyrusUserSoap[] toSoapModels(CyrusUser[] models) {
        CyrusUserSoap[] soapModels = new CyrusUserSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static CyrusUserSoap[][] toSoapModels(CyrusUser[][] models) {
        CyrusUserSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new CyrusUserSoap[models.length][models[0].length];
        } else {
            soapModels = new CyrusUserSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static CyrusUserSoap[] toSoapModels(List<CyrusUser> models) {
        List<CyrusUserSoap> soapModels = new ArrayList<CyrusUserSoap>(models.size());

        for (CyrusUser model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new CyrusUserSoap[soapModels.size()]);
    }

    public String getPrimaryKey() {
        return _userId;
    }

    public void setPrimaryKey(String pk) {
        setUserId(pk);
    }

    public String getUserId() {
        return _userId;
    }

    public void setUserId(String userId) {
        _userId = userId;
    }

    public String getPassword() {
        return _password;
    }

    public void setPassword(String password) {
        _password = password;
    }
}
