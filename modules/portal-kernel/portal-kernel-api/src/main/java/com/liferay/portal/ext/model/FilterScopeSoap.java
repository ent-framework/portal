package com.liferay.portal.ext.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Jeff Qian
 * @generated
 */
public class FilterScopeSoap implements Serializable {
    private long _filterScopeId;
    private String _filterName;
    private String _className;

    public FilterScopeSoap() {
    }

    public static FilterScopeSoap toSoapModel(FilterScope model) {
        FilterScopeSoap soapModel = new FilterScopeSoap();

        soapModel.setFilterScopeId(model.getFilterScopeId());
        soapModel.setFilterName(model.getFilterName());
        soapModel.setClassName(model.getClassName());

        return soapModel;
    }

    public static FilterScopeSoap[] toSoapModels(FilterScope[] models) {
        FilterScopeSoap[] soapModels = new FilterScopeSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static FilterScopeSoap[][] toSoapModels(FilterScope[][] models) {
        FilterScopeSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new FilterScopeSoap[models.length][models[0].length];
        } else {
            soapModels = new FilterScopeSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static FilterScopeSoap[] toSoapModels(List<FilterScope> models) {
        List<FilterScopeSoap> soapModels = new ArrayList<FilterScopeSoap>(models.size());

        for (FilterScope model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new FilterScopeSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _filterScopeId;
    }

    public void setPrimaryKey(long pk) {
        setFilterScopeId(pk);
    }

    public long getFilterScopeId() {
        return _filterScopeId;
    }

    public void setFilterScopeId(long filterScopeId) {
        _filterScopeId = filterScopeId;
    }

    public String getFilterName() {
        return _filterName;
    }

    public void setFilterName(String filterName) {
        _filterName = filterName;
    }

    public String getClassName() {
        return _className;
    }

    public void setClassName(String className) {
        _className = className;
    }
}
