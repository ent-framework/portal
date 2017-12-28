package com.liferay.portal.model;

import com.liferay.portal.service.persistence.UserGroupRolePK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.portal.service.http.UserGroupRoleServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.portal.service.http.UserGroupRoleServiceSoap
 * @generated
 */
public class UserGroupRoleSoap implements Serializable {
    private long _userId;
    private long _groupId;
    private long _roleId;

    public UserGroupRoleSoap() {
    }

    public static UserGroupRoleSoap toSoapModel(UserGroupRole model) {
        UserGroupRoleSoap soapModel = new UserGroupRoleSoap();

        soapModel.setUserId(model.getUserId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setRoleId(model.getRoleId());

        return soapModel;
    }

    public static UserGroupRoleSoap[] toSoapModels(UserGroupRole[] models) {
        UserGroupRoleSoap[] soapModels = new UserGroupRoleSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static UserGroupRoleSoap[][] toSoapModels(UserGroupRole[][] models) {
        UserGroupRoleSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new UserGroupRoleSoap[models.length][models[0].length];
        } else {
            soapModels = new UserGroupRoleSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static UserGroupRoleSoap[] toSoapModels(List<UserGroupRole> models) {
        List<UserGroupRoleSoap> soapModels = new ArrayList<UserGroupRoleSoap>(models.size());

        for (UserGroupRole model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new UserGroupRoleSoap[soapModels.size()]);
    }

    public UserGroupRolePK getPrimaryKey() {
        return new UserGroupRolePK(_userId, _groupId, _roleId);
    }

    public void setPrimaryKey(UserGroupRolePK pk) {
        setUserId(pk.userId);
        setGroupId(pk.groupId);
        setRoleId(pk.roleId);
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getRoleId() {
        return _roleId;
    }

    public void setRoleId(long roleId) {
        _roleId = roleId;
    }
}
