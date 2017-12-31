package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.Portlet;
import com.liferay.portal.model.PortletModel;
import com.liferay.portal.model.PortletSoap;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Portlet service. Represents a row in the &quot;Portlet&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.portal.model.PortletModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PortletImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PortletImpl
 * @see com.liferay.portal.model.Portlet
 * @see com.liferay.portal.model.PortletModel
 * @generated
 */
@JSON(strict = true)
public class PortletModelImpl extends BaseModelImpl<Portlet>
    implements PortletModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a portlet model instance should use the {@link com.liferay.portal.model.Portlet} interface instead.
     */
    public static final String TABLE_NAME = "Portlet";
    public static final Object[][] TABLE_COLUMNS = {
            { "id_", Types.BIGINT },
            { "companyId", Types.BIGINT },
            { "portletId", Types.VARCHAR },
            { "roles", Types.VARCHAR },
            { "active_", Types.BOOLEAN }
        };
    public static final String TABLE_SQL_CREATE = "create table Portlet (id_ LONG not null primary key,companyId LONG,portletId VARCHAR(200) null,roles STRING null,active_ BOOLEAN)";
    public static final String TABLE_SQL_DROP = "drop table Portlet";
    public static final String ORDER_BY_JPQL = " ORDER BY portlet.id ASC";
    public static final String ORDER_BY_SQL = " ORDER BY Portlet.id_ ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
                "value.object.entity.cache.enabled.com.liferay.portal.model.Portlet"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
                "value.object.finder.cache.enabled.com.liferay.portal.model.Portlet"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
                "value.object.column.bitmask.enabled.com.liferay.portal.model.Portlet"),
            true);
    public static long COMPANYID_COLUMN_BITMASK = 1L;
    public static long PORTLETID_COLUMN_BITMASK = 2L;
    public static long ID_COLUMN_BITMASK = 4L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.util.PropsUtil.get(
                "lock.expiration.time.com.liferay.portal.model.Portlet"));
    private static ClassLoader _classLoader = Portlet.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            Portlet.class
        };
    private long _id;
    private long _companyId;
    private long _originalCompanyId;
    private boolean _setOriginalCompanyId;
    private String _portletId;
    private String _originalPortletId;
    private String _roles;
    private boolean _active;
    private long _columnBitmask;
    private Portlet _escapedModel;

    public PortletModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Portlet toModel(PortletSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Portlet model = new PortletImpl();

        model.setId(soapModel.getId());
        model.setCompanyId(soapModel.getCompanyId());
        model.setPortletId(soapModel.getPortletId());
        model.setRoles(soapModel.getRoles());
        model.setActive(soapModel.getActive());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Portlet> toModels(PortletSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Portlet> models = new ArrayList<Portlet>(soapModels.length);

        for (PortletSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return Portlet.class;
    }

    @Override
    public String getModelClassName() {
        return Portlet.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("companyId", getCompanyId());
        attributes.put("portletId", getPortletId());
        attributes.put("roles", getRoles());
        attributes.put("active", getActive());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        String portletId = (String) attributes.get("portletId");

        if (portletId != null) {
            setPortletId(portletId);
        }

        String roles = (String) attributes.get("roles");

        if (roles != null) {
            setRoles(roles);
        }

        Boolean active = (Boolean) attributes.get("active");

        if (active != null) {
            setActive(active);
        }
    }

    @JSON
    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(Long id) {
        if (id == null) {
            id = new Long(0);
        }

        _id = id;
    }

    @JSON
    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(Long companyId) {
        _columnBitmask |= COMPANYID_COLUMN_BITMASK;

        if (!_setOriginalCompanyId) {
            _setOriginalCompanyId = true;

            _originalCompanyId = _companyId;
        }

        if (companyId == null) {
            companyId = new Long(0);
        }

        _companyId = companyId;
    }

    public long getOriginalCompanyId() {
        return _originalCompanyId;
    }

    @JSON
    @Override
    public String getPortletId() {
        if (_portletId == null) {
            return StringPool.BLANK;
        } else {
            return _portletId;
        }
    }

    @Override
    public void setPortletId(String portletId) {
        _columnBitmask |= PORTLETID_COLUMN_BITMASK;

        if (_originalPortletId == null) {
            _originalPortletId = _portletId;
        }

        _portletId = portletId;
    }

    public String getOriginalPortletId() {
        return GetterUtil.getString(_originalPortletId);
    }

    @JSON
    @Override
    public String getRoles() {
        if (_roles == null) {
            return StringPool.BLANK;
        } else {
            return _roles;
        }
    }

    @Override
    public void setRoles(String roles) {
        _roles = roles;
    }

    @JSON
    @Override
    public boolean getActive() {
        return _active;
    }

    @Override
    public boolean isActive() {
        return _active;
    }

    @Override
    public void setActive(Boolean active) {
        if (active == null) {
            active = Boolean.FALSE;
        }

        _active = active;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
            Portlet.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Portlet toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Portlet) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        PortletImpl portletImpl = new PortletImpl();

        portletImpl.setId(getId());
        portletImpl.setCompanyId(getCompanyId());
        portletImpl.setPortletId(getPortletId());
        portletImpl.setRoles(getRoles());
        portletImpl.setActive(getActive());

        portletImpl.resetOriginalValues();

        return portletImpl;
    }

    @Override
    public int compareTo(Portlet portlet) {
        long primaryKey = portlet.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Portlet)) {
            return false;
        }

        Portlet portlet = (Portlet) obj;

        long primaryKey = portlet.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        PortletModelImpl portletModelImpl = this;

        portletModelImpl._originalCompanyId = portletModelImpl._companyId;

        portletModelImpl._setOriginalCompanyId = false;

        portletModelImpl._originalPortletId = portletModelImpl._portletId;

        portletModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<Portlet> toCacheModel() {
        PortletCacheModel portletCacheModel = new PortletCacheModel();

        portletCacheModel.id = getId();

        portletCacheModel.companyId = getCompanyId();

        portletCacheModel.portletId = getPortletId();

        String portletId = portletCacheModel.portletId;

        if ((portletId != null) && (portletId.length() == 0)) {
            portletCacheModel.portletId = null;
        }

        portletCacheModel.roles = getRoles();

        String roles = portletCacheModel.roles;

        if ((roles != null) && (roles.length() == 0)) {
            portletCacheModel.roles = null;
        }

        portletCacheModel.active = getActive();

        return portletCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", portletId=");
        sb.append(getPortletId());
        sb.append(", roles=");
        sb.append(getRoles());
        sb.append(", active=");
        sb.append(getActive());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(19);

        sb.append("<model><model-name>");
        sb.append("com.liferay.portal.model.Portlet");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>portletId</column-name><column-value><![CDATA[");
        sb.append(getPortletId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>roles</column-name><column-value><![CDATA[");
        sb.append(getRoles());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>active</column-name><column-value><![CDATA[");
        sb.append(getActive());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
