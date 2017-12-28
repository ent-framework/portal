package com.liferay.portal.model;

import com.liferay.portal.service.persistence.OrgGroupRolePK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OrgGroupRoleSoap implements Serializable {
    private long _organizationId;
    private long _groupId;
    private long _roleId;

    public OrgGroupRoleSoap() {
    }

    public static OrgGroupRoleSoap toSoapModel(OrgGroupRole model) {
        OrgGroupRoleSoap soapModel = new OrgGroupRoleSoap();

        soapModel.setOrganizationId(model.getOrganizationId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setRoleId(model.getRoleId());

        return soapModel;
    }

    public static OrgGroupRoleSoap[] toSoapModels(OrgGroupRole[] models) {
        OrgGroupRoleSoap[] soapModels = new OrgGroupRoleSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static OrgGroupRoleSoap[][] toSoapModels(OrgGroupRole[][] models) {
        OrgGroupRoleSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new OrgGroupRoleSoap[models.length][models[0].length];
        } else {
            soapModels = new OrgGroupRoleSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static OrgGroupRoleSoap[] toSoapModels(List<OrgGroupRole> models) {
        List<OrgGroupRoleSoap> soapModels = new ArrayList<OrgGroupRoleSoap>(models.size());

        for (OrgGroupRole model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new OrgGroupRoleSoap[soapModels.size()]);
    }

    public OrgGroupRolePK getPrimaryKey() {
        return new OrgGroupRolePK(_organizationId, _groupId, _roleId);
    }

    public void setPrimaryKey(OrgGroupRolePK pk) {
        setOrganizationId(pk.organizationId);
        setGroupId(pk.groupId);
        setRoleId(pk.roleId);
    }

    public long getOrganizationId() {
        return _organizationId;
    }

    public void setOrganizationId(long organizationId) {
        _organizationId = organizationId;
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
