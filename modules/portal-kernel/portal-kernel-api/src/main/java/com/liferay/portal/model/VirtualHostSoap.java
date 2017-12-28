package com.liferay.portal.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class VirtualHostSoap implements Serializable {
    private long _virtualHostId;
    private long _companyId;
    private long _layoutSetId;
    private String _hostname;

    public VirtualHostSoap() {
    }

    public static VirtualHostSoap toSoapModel(VirtualHost model) {
        VirtualHostSoap soapModel = new VirtualHostSoap();

        soapModel.setVirtualHostId(model.getVirtualHostId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setLayoutSetId(model.getLayoutSetId());
        soapModel.setHostname(model.getHostname());

        return soapModel;
    }

    public static VirtualHostSoap[] toSoapModels(VirtualHost[] models) {
        VirtualHostSoap[] soapModels = new VirtualHostSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static VirtualHostSoap[][] toSoapModels(VirtualHost[][] models) {
        VirtualHostSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new VirtualHostSoap[models.length][models[0].length];
        } else {
            soapModels = new VirtualHostSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static VirtualHostSoap[] toSoapModels(List<VirtualHost> models) {
        List<VirtualHostSoap> soapModels = new ArrayList<VirtualHostSoap>(models.size());

        for (VirtualHost model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new VirtualHostSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _virtualHostId;
    }

    public void setPrimaryKey(long pk) {
        setVirtualHostId(pk);
    }

    public long getVirtualHostId() {
        return _virtualHostId;
    }

    public void setVirtualHostId(long virtualHostId) {
        _virtualHostId = virtualHostId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getLayoutSetId() {
        return _layoutSetId;
    }

    public void setLayoutSetId(long layoutSetId) {
        _layoutSetId = layoutSetId;
    }

    public String getHostname() {
        return _hostname;
    }

    public void setHostname(String hostname) {
        _hostname = hostname;
    }
}
