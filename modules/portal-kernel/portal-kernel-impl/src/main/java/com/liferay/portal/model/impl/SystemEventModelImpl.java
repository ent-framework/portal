package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.SystemEvent;
import com.liferay.portal.model.SystemEventModel;
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
 * The base model implementation for the SystemEvent service. Represents a row in the &quot;SystemEvent&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.portal.model.SystemEventModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SystemEventImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SystemEventImpl
 * @see com.liferay.portal.model.SystemEvent
 * @see com.liferay.portal.model.SystemEventModel
 * @generated
 */
public class SystemEventModelImpl extends BaseModelImpl<SystemEvent>
    implements SystemEventModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a system event model instance should use the {@link com.liferay.portal.model.SystemEvent} interface instead.
     */
    public static final String TABLE_NAME = "SystemEvent";
    public static final Object[][] TABLE_COLUMNS = {
            { "systemEventId", Types.BIGINT },
            { "groupId", Types.BIGINT },
            { "companyId", Types.BIGINT },
            { "userId", Types.BIGINT },
            { "userName", Types.VARCHAR },
            { "createDate", Types.TIMESTAMP },
            { "classNameId", Types.BIGINT },
            { "classPK", Types.BIGINT },
            { "classUuid", Types.VARCHAR },
            { "referrerClassNameId", Types.BIGINT },
            { "parentSystemEventId", Types.BIGINT },
            { "systemEventSetKey", Types.BIGINT },
            { "type_", Types.INTEGER },
            { "extraData", Types.CLOB }
        };
    public static final String TABLE_SQL_CREATE = "create table SystemEvent (systemEventId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,classNameId LONG,classPK LONG,classUuid VARCHAR(75) null,referrerClassNameId LONG,parentSystemEventId LONG,systemEventSetKey LONG,type_ INTEGER,extraData TEXT null)";
    public static final String TABLE_SQL_DROP = "drop table SystemEvent";
    public static final String ORDER_BY_JPQL = " ORDER BY systemEvent.createDate DESC";
    public static final String ORDER_BY_SQL = " ORDER BY SystemEvent.createDate DESC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
                "value.object.entity.cache.enabled.com.liferay.portal.model.SystemEvent"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
                "value.object.finder.cache.enabled.com.liferay.portal.model.SystemEvent"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
                "value.object.column.bitmask.enabled.com.liferay.portal.model.SystemEvent"),
            true);
    public static long CLASSNAMEID_COLUMN_BITMASK = 1L;
    public static long CLASSPK_COLUMN_BITMASK = 2L;
    public static long GROUPID_COLUMN_BITMASK = 4L;
    public static long SYSTEMEVENTSETKEY_COLUMN_BITMASK = 8L;
    public static long TYPE_COLUMN_BITMASK = 16L;
    public static long CREATEDATE_COLUMN_BITMASK = 32L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.util.PropsUtil.get(
                "lock.expiration.time.com.liferay.portal.model.SystemEvent"));
    private static ClassLoader _classLoader = SystemEvent.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            SystemEvent.class
        };
    private long _systemEventId;
    private long _groupId;
    private long _originalGroupId;
    private boolean _setOriginalGroupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private long _classNameId;
    private long _originalClassNameId;
    private boolean _setOriginalClassNameId;
    private long _classPK;
    private long _originalClassPK;
    private boolean _setOriginalClassPK;
    private String _classUuid;
    private long _referrerClassNameId;
    private long _parentSystemEventId;
    private long _systemEventSetKey;
    private long _originalSystemEventSetKey;
    private boolean _setOriginalSystemEventSetKey;
    private int _type;
    private int _originalType;
    private boolean _setOriginalType;
    private String _extraData;
    private long _columnBitmask;
    private SystemEvent _escapedModel;

    public SystemEventModelImpl() {
    }

    @Override
    public long getPrimaryKey() {
        return _systemEventId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setSystemEventId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _systemEventId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return SystemEvent.class;
    }

    @Override
    public String getModelClassName() {
        return SystemEvent.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("systemEventId", getSystemEventId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("classNameId", getClassNameId());
        attributes.put("classPK", getClassPK());
        attributes.put("classUuid", getClassUuid());
        attributes.put("referrerClassNameId", getReferrerClassNameId());
        attributes.put("parentSystemEventId", getParentSystemEventId());
        attributes.put("systemEventSetKey", getSystemEventSetKey());
        attributes.put("type", getType());
        attributes.put("extraData", getExtraData());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long systemEventId = (Long) attributes.get("systemEventId");

        if (systemEventId != null) {
            setSystemEventId(systemEventId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
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

        Long classNameId = (Long) attributes.get("classNameId");

        if (classNameId != null) {
            setClassNameId(classNameId);
        }

        Long classPK = (Long) attributes.get("classPK");

        if (classPK != null) {
            setClassPK(classPK);
        }

        String classUuid = (String) attributes.get("classUuid");

        if (classUuid != null) {
            setClassUuid(classUuid);
        }

        Long referrerClassNameId = (Long) attributes.get("referrerClassNameId");

        if (referrerClassNameId != null) {
            setReferrerClassNameId(referrerClassNameId);
        }

        Long parentSystemEventId = (Long) attributes.get("parentSystemEventId");

        if (parentSystemEventId != null) {
            setParentSystemEventId(parentSystemEventId);
        }

        Long systemEventSetKey = (Long) attributes.get("systemEventSetKey");

        if (systemEventSetKey != null) {
            setSystemEventSetKey(systemEventSetKey);
        }

        Integer type = (Integer) attributes.get("type");

        if (type != null) {
            setType(type);
        }

        String extraData = (String) attributes.get("extraData");

        if (extraData != null) {
            setExtraData(extraData);
        }
    }

    @Override
    public long getSystemEventId() {
        return _systemEventId;
    }

    @Override
    public void setSystemEventId(Long systemEventId) {
        if (systemEventId == null) {
            systemEventId = new Long(0);
        }

        _systemEventId = systemEventId;
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
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(Long companyId) {
        if (companyId == null) {
            companyId = new Long(0);
        }

        _companyId = companyId;
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
    public String getClassName() {
        if (getClassNameId() <= 0) {
            return StringPool.BLANK;
        }

        return PortalUtil.getClassName(getClassNameId());
    }

    @Override
    public void setClassName(String className) {
        long classNameId = 0;

        if (Validator.isNotNull(className)) {
            classNameId = PortalUtil.getClassNameId(className);
        }

        setClassNameId(classNameId);
    }

    @Override
    public long getClassNameId() {
        return _classNameId;
    }

    @Override
    public void setClassNameId(Long classNameId) {
        _columnBitmask |= CLASSNAMEID_COLUMN_BITMASK;

        if (!_setOriginalClassNameId) {
            _setOriginalClassNameId = true;

            _originalClassNameId = _classNameId;
        }

        if (classNameId == null) {
            classNameId = new Long(0);
        }

        _classNameId = classNameId;
    }

    public long getOriginalClassNameId() {
        return _originalClassNameId;
    }

    @Override
    public long getClassPK() {
        return _classPK;
    }

    @Override
    public void setClassPK(Long classPK) {
        _columnBitmask |= CLASSPK_COLUMN_BITMASK;

        if (!_setOriginalClassPK) {
            _setOriginalClassPK = true;

            _originalClassPK = _classPK;
        }

        if (classPK == null) {
            classPK = new Long(0);
        }

        _classPK = classPK;
    }

    public long getOriginalClassPK() {
        return _originalClassPK;
    }

    @Override
    public String getClassUuid() {
        if (_classUuid == null) {
            return StringPool.BLANK;
        } else {
            return _classUuid;
        }
    }

    @Override
    public void setClassUuid(String classUuid) {
        _classUuid = classUuid;
    }

    @Override
    public long getReferrerClassNameId() {
        return _referrerClassNameId;
    }

    @Override
    public void setReferrerClassNameId(Long referrerClassNameId) {
        if (referrerClassNameId == null) {
            referrerClassNameId = new Long(0);
        }

        _referrerClassNameId = referrerClassNameId;
    }

    @Override
    public long getParentSystemEventId() {
        return _parentSystemEventId;
    }

    @Override
    public void setParentSystemEventId(Long parentSystemEventId) {
        if (parentSystemEventId == null) {
            parentSystemEventId = new Long(0);
        }

        _parentSystemEventId = parentSystemEventId;
    }

    @Override
    public long getSystemEventSetKey() {
        return _systemEventSetKey;
    }

    @Override
    public void setSystemEventSetKey(Long systemEventSetKey) {
        _columnBitmask |= SYSTEMEVENTSETKEY_COLUMN_BITMASK;

        if (!_setOriginalSystemEventSetKey) {
            _setOriginalSystemEventSetKey = true;

            _originalSystemEventSetKey = _systemEventSetKey;
        }

        if (systemEventSetKey == null) {
            systemEventSetKey = new Long(0);
        }

        _systemEventSetKey = systemEventSetKey;
    }

    public long getOriginalSystemEventSetKey() {
        return _originalSystemEventSetKey;
    }

    @Override
    public int getType() {
        return _type;
    }

    @Override
    public void setType(Integer type) {
        _columnBitmask |= TYPE_COLUMN_BITMASK;

        if (!_setOriginalType) {
            _setOriginalType = true;

            _originalType = _type;
        }

        if (type == null) {
            type = new Integer(0);
        }

        _type = type;
    }

    public int getOriginalType() {
        return _originalType;
    }

    @Override
    public String getExtraData() {
        if (_extraData == null) {
            return StringPool.BLANK;
        } else {
            return _extraData;
        }
    }

    @Override
    public void setExtraData(String extraData) {
        _extraData = extraData;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
            SystemEvent.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public SystemEvent toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (SystemEvent) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        SystemEventImpl systemEventImpl = new SystemEventImpl();

        systemEventImpl.setSystemEventId(getSystemEventId());
        systemEventImpl.setGroupId(getGroupId());
        systemEventImpl.setCompanyId(getCompanyId());
        systemEventImpl.setUserId(getUserId());
        systemEventImpl.setUserName(getUserName());
        systemEventImpl.setCreateDate(getCreateDate());
        systemEventImpl.setClassNameId(getClassNameId());
        systemEventImpl.setClassPK(getClassPK());
        systemEventImpl.setClassUuid(getClassUuid());
        systemEventImpl.setReferrerClassNameId(getReferrerClassNameId());
        systemEventImpl.setParentSystemEventId(getParentSystemEventId());
        systemEventImpl.setSystemEventSetKey(getSystemEventSetKey());
        systemEventImpl.setType(getType());
        systemEventImpl.setExtraData(getExtraData());

        systemEventImpl.resetOriginalValues();

        return systemEventImpl;
    }

    @Override
    public int compareTo(SystemEvent systemEvent) {
        int value = 0;

        value = DateUtil.compareTo(getCreateDate(), systemEvent.getCreateDate());

        value = value * -1;

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

        if (!(obj instanceof SystemEvent)) {
            return false;
        }

        SystemEvent systemEvent = (SystemEvent) obj;

        long primaryKey = systemEvent.getPrimaryKey();

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
        SystemEventModelImpl systemEventModelImpl = this;

        systemEventModelImpl._originalGroupId = systemEventModelImpl._groupId;

        systemEventModelImpl._setOriginalGroupId = false;

        systemEventModelImpl._originalClassNameId = systemEventModelImpl._classNameId;

        systemEventModelImpl._setOriginalClassNameId = false;

        systemEventModelImpl._originalClassPK = systemEventModelImpl._classPK;

        systemEventModelImpl._setOriginalClassPK = false;

        systemEventModelImpl._originalSystemEventSetKey = systemEventModelImpl._systemEventSetKey;

        systemEventModelImpl._setOriginalSystemEventSetKey = false;

        systemEventModelImpl._originalType = systemEventModelImpl._type;

        systemEventModelImpl._setOriginalType = false;

        systemEventModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<SystemEvent> toCacheModel() {
        SystemEventCacheModel systemEventCacheModel = new SystemEventCacheModel();

        systemEventCacheModel.systemEventId = getSystemEventId();

        systemEventCacheModel.groupId = getGroupId();

        systemEventCacheModel.companyId = getCompanyId();

        systemEventCacheModel.userId = getUserId();

        systemEventCacheModel.userName = getUserName();

        String userName = systemEventCacheModel.userName;

        if ((userName != null) && (userName.length() == 0)) {
            systemEventCacheModel.userName = null;
        }

        Date createDate = getCreateDate();

        if (createDate != null) {
            systemEventCacheModel.createDate = createDate.getTime();
        } else {
            systemEventCacheModel.createDate = Long.MIN_VALUE;
        }

        systemEventCacheModel.classNameId = getClassNameId();

        systemEventCacheModel.classPK = getClassPK();

        systemEventCacheModel.classUuid = getClassUuid();

        String classUuid = systemEventCacheModel.classUuid;

        if ((classUuid != null) && (classUuid.length() == 0)) {
            systemEventCacheModel.classUuid = null;
        }

        systemEventCacheModel.referrerClassNameId = getReferrerClassNameId();

        systemEventCacheModel.parentSystemEventId = getParentSystemEventId();

        systemEventCacheModel.systemEventSetKey = getSystemEventSetKey();

        systemEventCacheModel.type = getType();

        systemEventCacheModel.extraData = getExtraData();

        String extraData = systemEventCacheModel.extraData;

        if ((extraData != null) && (extraData.length() == 0)) {
            systemEventCacheModel.extraData = null;
        }

        return systemEventCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(29);

        sb.append("{systemEventId=");
        sb.append(getSystemEventId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", userName=");
        sb.append(getUserName());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", classNameId=");
        sb.append(getClassNameId());
        sb.append(", classPK=");
        sb.append(getClassPK());
        sb.append(", classUuid=");
        sb.append(getClassUuid());
        sb.append(", referrerClassNameId=");
        sb.append(getReferrerClassNameId());
        sb.append(", parentSystemEventId=");
        sb.append(getParentSystemEventId());
        sb.append(", systemEventSetKey=");
        sb.append(getSystemEventSetKey());
        sb.append(", type=");
        sb.append(getType());
        sb.append(", extraData=");
        sb.append(getExtraData());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(46);

        sb.append("<model><model-name>");
        sb.append("com.liferay.portal.model.SystemEvent");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>systemEventId</column-name><column-value><![CDATA[");
        sb.append(getSystemEventId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
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
            "<column><column-name>classNameId</column-name><column-value><![CDATA[");
        sb.append(getClassNameId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>classPK</column-name><column-value><![CDATA[");
        sb.append(getClassPK());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>classUuid</column-name><column-value><![CDATA[");
        sb.append(getClassUuid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>referrerClassNameId</column-name><column-value><![CDATA[");
        sb.append(getReferrerClassNameId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>parentSystemEventId</column-name><column-value><![CDATA[");
        sb.append(getParentSystemEventId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>systemEventSetKey</column-name><column-value><![CDATA[");
        sb.append(getSystemEventSetKey());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>type</column-name><column-value><![CDATA[");
        sb.append(getType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>extraData</column-name><column-value><![CDATA[");
        sb.append(getExtraData());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
