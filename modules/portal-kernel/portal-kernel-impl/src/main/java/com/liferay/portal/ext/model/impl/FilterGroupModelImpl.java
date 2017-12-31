package com.liferay.portal.ext.model.impl;

import com.liferay.portal.ext.model.FilterGroup;
import com.liferay.portal.ext.model.FilterGroupModel;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the FilterGroup service. Represents a row in the &quot;FilterGroup&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.portal.ext.model.FilterGroupModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FilterGroupImpl}.
 * </p>
 *
 * @author Jeff Qian
 * @see FilterGroupImpl
 * @see com.liferay.portal.ext.model.FilterGroup
 * @see com.liferay.portal.ext.model.FilterGroupModel
 * @generated
 */
public class FilterGroupModelImpl extends BaseModelImpl<FilterGroup>
    implements FilterGroupModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a filter group model instance should use the {@link com.liferay.portal.ext.model.FilterGroup} interface instead.
     */
    public static final String TABLE_NAME = "FilterGroup";
    public static final Object[][] TABLE_COLUMNS = {
            { "uuid_", Types.VARCHAR },
            { "filterGroupId", Types.BIGINT },
            { "userId", Types.BIGINT },
            { "userName", Types.VARCHAR },
            { "createDate", Types.TIMESTAMP },
            { "modifiedDate", Types.TIMESTAMP },
            { "groupId", Types.BIGINT },
            { "filterScopeId", Types.BIGINT }
        };
    public static final String TABLE_SQL_CREATE = "create table FilterGroup (uuid_ VARCHAR(75) null,filterGroupId LONG not null primary key,userId LONG,userName VARCHAR(255) null,createDate DATE null,modifiedDate DATE null,groupId LONG,filterScopeId LONG)";
    public static final String TABLE_SQL_DROP = "drop table FilterGroup";
    public static final String ORDER_BY_JPQL = " ORDER BY filterGroup.createDate ASC";
    public static final String ORDER_BY_SQL = " ORDER BY FilterGroup.createDate ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
                "value.object.entity.cache.enabled.com.liferay.portal.ext.model.FilterGroup"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
                "value.object.finder.cache.enabled.com.liferay.portal.ext.model.FilterGroup"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
                "value.object.column.bitmask.enabled.com.liferay.portal.ext.model.FilterGroup"),
            true);
    public static long FILTERSCOPEID_COLUMN_BITMASK = 1L;
    public static long GROUPID_COLUMN_BITMASK = 2L;
    public static long UUID_COLUMN_BITMASK = 4L;
    public static long CREATEDATE_COLUMN_BITMASK = 8L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.util.PropsUtil.get(
                "lock.expiration.time.com.liferay.portal.ext.model.FilterGroup"));
    private static ClassLoader _classLoader = FilterGroup.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            FilterGroup.class
        };
    private String _uuid;
    private String _originalUuid;
    private long _filterGroupId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private long _groupId;
    private long _originalGroupId;
    private boolean _setOriginalGroupId;
    private long _filterScopeId;
    private long _originalFilterScopeId;
    private boolean _setOriginalFilterScopeId;
    private long _columnBitmask;
    private FilterGroup _escapedModel;

    public FilterGroupModelImpl() {
    }

    @Override
    public long getPrimaryKey() {
        return _filterGroupId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setFilterGroupId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _filterGroupId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return FilterGroup.class;
    }

    @Override
    public String getModelClassName() {
        return FilterGroup.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("filterGroupId", getFilterGroupId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("groupId", getGroupId());
        attributes.put("filterScopeId", getFilterScopeId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long filterGroupId = (Long) attributes.get("filterGroupId");

        if (filterGroupId != null) {
            setFilterGroupId(filterGroupId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long filterScopeId = (Long) attributes.get("filterScopeId");

        if (filterScopeId != null) {
            setFilterScopeId(filterScopeId);
        }
    }

    @Override
    public String getUuid() {
        if (_uuid == null) {
            return StringPool.BLANK;
        } else {
            return _uuid;
        }
    }

    @Override
    public void setUuid(String uuid) {
        if (_originalUuid == null) {
            _originalUuid = _uuid;
        }

        _uuid = uuid;
    }

    public String getOriginalUuid() {
        return GetterUtil.getString(_originalUuid);
    }

    @Override
    public long getFilterGroupId() {
        return _filterGroupId;
    }

    @Override
    public void setFilterGroupId(Long filterGroupId) {
        if (filterGroupId == null) {
            filterGroupId = new Long(0);
        }

        _filterGroupId = filterGroupId;
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(Long userId) {
        if (userId == null) {
            userId = new Long(0);
        }

        _userId = userId;
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public String getUserName() {
        if (_userName == null) {
            return StringPool.BLANK;
        } else {
            return _userName;
        }
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _columnBitmask = -1L;

        _createDate = createDate;
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(Long groupId) {
        _columnBitmask |= GROUPID_COLUMN_BITMASK;

        if (!_setOriginalGroupId) {
            _setOriginalGroupId = true;

            _originalGroupId = _groupId;
        }

        if (groupId == null) {
            groupId = new Long(0);
        }

        _groupId = groupId;
    }

    public long getOriginalGroupId() {
        return _originalGroupId;
    }

    @Override
    public long getFilterScopeId() {
        return _filterScopeId;
    }

    @Override
    public void setFilterScopeId(Long filterScopeId) {
        _columnBitmask |= FILTERSCOPEID_COLUMN_BITMASK;

        if (!_setOriginalFilterScopeId) {
            _setOriginalFilterScopeId = true;

            _originalFilterScopeId = _filterScopeId;
        }

        if (filterScopeId == null) {
            filterScopeId = new Long(0);
        }

        _filterScopeId = filterScopeId;
    }

    public long getOriginalFilterScopeId() {
        return _originalFilterScopeId;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            FilterGroup.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public FilterGroup toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (FilterGroup) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        FilterGroupImpl filterGroupImpl = new FilterGroupImpl();

        filterGroupImpl.setUuid(getUuid());
        filterGroupImpl.setFilterGroupId(getFilterGroupId());
        filterGroupImpl.setUserId(getUserId());
        filterGroupImpl.setUserName(getUserName());
        filterGroupImpl.setCreateDate(getCreateDate());
        filterGroupImpl.setModifiedDate(getModifiedDate());
        filterGroupImpl.setGroupId(getGroupId());
        filterGroupImpl.setFilterScopeId(getFilterScopeId());

        filterGroupImpl.resetOriginalValues();

        return filterGroupImpl;
    }

    @Override
    public int compareTo(FilterGroup filterGroup) {
        int value = 0;

        value = DateUtil.compareTo(getCreateDate(), filterGroup.getCreateDate());

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof FilterGroup)) {
            return false;
        }

        FilterGroup filterGroup = (FilterGroup) obj;

        long primaryKey = filterGroup.getPrimaryKey();

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
        FilterGroupModelImpl filterGroupModelImpl = this;

        filterGroupModelImpl._originalUuid = filterGroupModelImpl._uuid;

        filterGroupModelImpl._originalGroupId = filterGroupModelImpl._groupId;

        filterGroupModelImpl._setOriginalGroupId = false;

        filterGroupModelImpl._originalFilterScopeId = filterGroupModelImpl._filterScopeId;

        filterGroupModelImpl._setOriginalFilterScopeId = false;

        filterGroupModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<FilterGroup> toCacheModel() {
        FilterGroupCacheModel filterGroupCacheModel = new FilterGroupCacheModel();

        filterGroupCacheModel.uuid = getUuid();

        String uuid = filterGroupCacheModel.uuid;

        if ((uuid != null) && (uuid.length() == 0)) {
            filterGroupCacheModel.uuid = null;
        }

        filterGroupCacheModel.filterGroupId = getFilterGroupId();

        filterGroupCacheModel.userId = getUserId();

        filterGroupCacheModel.userName = getUserName();

        String userName = filterGroupCacheModel.userName;

        if ((userName != null) && (userName.length() == 0)) {
            filterGroupCacheModel.userName = null;
        }

        Date createDate = getCreateDate();

        if (createDate != null) {
            filterGroupCacheModel.createDate = createDate.getTime();
        } else {
            filterGroupCacheModel.createDate = Long.MIN_VALUE;
        }

        Date modifiedDate = getModifiedDate();

        if (modifiedDate != null) {
            filterGroupCacheModel.modifiedDate = modifiedDate.getTime();
        } else {
            filterGroupCacheModel.modifiedDate = Long.MIN_VALUE;
        }

        filterGroupCacheModel.groupId = getGroupId();

        filterGroupCacheModel.filterScopeId = getFilterScopeId();

        return filterGroupCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{uuid=");
        sb.append(getUuid());
        sb.append(", filterGroupId=");
        sb.append(getFilterGroupId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", userName=");
        sb.append(getUserName());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", filterScopeId=");
        sb.append(getFilterScopeId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(28);

        sb.append("<model><model-name>");
        sb.append("com.liferay.portal.ext.model.FilterGroup");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>uuid</column-name><column-value><![CDATA[");
        sb.append(getUuid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>filterGroupId</column-name><column-value><![CDATA[");
        sb.append(getFilterGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userName</column-name><column-value><![CDATA[");
        sb.append(getUserName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>filterScopeId</column-name><column-value><![CDATA[");
        sb.append(getFilterScopeId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
