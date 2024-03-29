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
import com.liferay.portal.model.WorkflowInstanceLink;
import com.liferay.portal.model.WorkflowInstanceLinkModel;
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
 * The base model implementation for the WorkflowInstanceLink service. Represents a row in the &quot;WorkflowInstanceLink&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.portal.model.WorkflowInstanceLinkModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link WorkflowInstanceLinkImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WorkflowInstanceLinkImpl
 * @see com.liferay.portal.model.WorkflowInstanceLink
 * @see com.liferay.portal.model.WorkflowInstanceLinkModel
 * @generated
 */
public class WorkflowInstanceLinkModelImpl extends BaseModelImpl<WorkflowInstanceLink>
    implements WorkflowInstanceLinkModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a workflow instance link model instance should use the {@link com.liferay.portal.model.WorkflowInstanceLink} interface instead.
     */
    public static final String TABLE_NAME = "WorkflowInstanceLink";
    public static final Object[][] TABLE_COLUMNS = {
            { "workflowInstanceLinkId", Types.BIGINT },
            { "groupId", Types.BIGINT },
            { "companyId", Types.BIGINT },
            { "userId", Types.BIGINT },
            { "userName", Types.VARCHAR },
            { "createDate", Types.TIMESTAMP },
            { "modifiedDate", Types.TIMESTAMP },
            { "classNameId", Types.BIGINT },
            { "classPK", Types.BIGINT },
            { "workflowInstanceId", Types.BIGINT }
        };
    public static final String TABLE_SQL_CREATE = "create table WorkflowInstanceLink (workflowInstanceLinkId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,classNameId LONG,classPK LONG,workflowInstanceId LONG)";
    public static final String TABLE_SQL_DROP = "drop table WorkflowInstanceLink";
    public static final String ORDER_BY_JPQL = " ORDER BY workflowInstanceLink.createDate DESC";
    public static final String ORDER_BY_SQL = " ORDER BY WorkflowInstanceLink.createDate DESC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
                "value.object.entity.cache.enabled.com.liferay.portal.model.WorkflowInstanceLink"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
                "value.object.finder.cache.enabled.com.liferay.portal.model.WorkflowInstanceLink"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
                "value.object.column.bitmask.enabled.com.liferay.portal.model.WorkflowInstanceLink"),
            true);
    public static long CLASSNAMEID_COLUMN_BITMASK = 1L;
    public static long CLASSPK_COLUMN_BITMASK = 2L;
    public static long COMPANYID_COLUMN_BITMASK = 4L;
    public static long GROUPID_COLUMN_BITMASK = 8L;
    public static long CREATEDATE_COLUMN_BITMASK = 16L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.util.PropsUtil.get(
                "lock.expiration.time.com.liferay.portal.model.WorkflowInstanceLink"));
    private static ClassLoader _classLoader = WorkflowInstanceLink.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            WorkflowInstanceLink.class
        };
    private long _workflowInstanceLinkId;
    private long _groupId;
    private long _originalGroupId;
    private boolean _setOriginalGroupId;
    private long _companyId;
    private long _originalCompanyId;
    private boolean _setOriginalCompanyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private long _classNameId;
    private long _originalClassNameId;
    private boolean _setOriginalClassNameId;
    private long _classPK;
    private long _originalClassPK;
    private boolean _setOriginalClassPK;
    private long _workflowInstanceId;
    private long _columnBitmask;
    private WorkflowInstanceLink _escapedModel;

    public WorkflowInstanceLinkModelImpl() {
    }

    @Override
    public long getPrimaryKey() {
        return _workflowInstanceLinkId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setWorkflowInstanceLinkId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _workflowInstanceLinkId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return WorkflowInstanceLink.class;
    }

    @Override
    public String getModelClassName() {
        return WorkflowInstanceLink.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("workflowInstanceLinkId", getWorkflowInstanceLinkId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("classNameId", getClassNameId());
        attributes.put("classPK", getClassPK());
        attributes.put("workflowInstanceId", getWorkflowInstanceId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long workflowInstanceLinkId = (Long) attributes.get(
                "workflowInstanceLinkId");

        if (workflowInstanceLinkId != null) {
            setWorkflowInstanceLinkId(workflowInstanceLinkId);
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

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        Long classNameId = (Long) attributes.get("classNameId");

        if (classNameId != null) {
            setClassNameId(classNameId);
        }

        Long classPK = (Long) attributes.get("classPK");

        if (classPK != null) {
            setClassPK(classPK);
        }

        Long workflowInstanceId = (Long) attributes.get("workflowInstanceId");

        if (workflowInstanceId != null) {
            setWorkflowInstanceId(workflowInstanceId);
        }
    }

    @Override
    public long getWorkflowInstanceLinkId() {
        return _workflowInstanceLinkId;
    }

    @Override
    public void setWorkflowInstanceLinkId(Long workflowInstanceLinkId) {
        if (workflowInstanceLinkId == null) {
            workflowInstanceLinkId = new Long(0);
        }

        _workflowInstanceLinkId = workflowInstanceLinkId;
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
    public long getWorkflowInstanceId() {
        return _workflowInstanceId;
    }

    @Override
    public void setWorkflowInstanceId(Long workflowInstanceId) {
        if (workflowInstanceId == null) {
            workflowInstanceId = new Long(0);
        }

        _workflowInstanceId = workflowInstanceId;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
            WorkflowInstanceLink.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public WorkflowInstanceLink toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (WorkflowInstanceLink) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        WorkflowInstanceLinkImpl workflowInstanceLinkImpl = new WorkflowInstanceLinkImpl();

        workflowInstanceLinkImpl.setWorkflowInstanceLinkId(getWorkflowInstanceLinkId());
        workflowInstanceLinkImpl.setGroupId(getGroupId());
        workflowInstanceLinkImpl.setCompanyId(getCompanyId());
        workflowInstanceLinkImpl.setUserId(getUserId());
        workflowInstanceLinkImpl.setUserName(getUserName());
        workflowInstanceLinkImpl.setCreateDate(getCreateDate());
        workflowInstanceLinkImpl.setModifiedDate(getModifiedDate());
        workflowInstanceLinkImpl.setClassNameId(getClassNameId());
        workflowInstanceLinkImpl.setClassPK(getClassPK());
        workflowInstanceLinkImpl.setWorkflowInstanceId(getWorkflowInstanceId());

        workflowInstanceLinkImpl.resetOriginalValues();

        return workflowInstanceLinkImpl;
    }

    @Override
    public int compareTo(WorkflowInstanceLink workflowInstanceLink) {
        int value = 0;

        value = DateUtil.compareTo(getCreateDate(),
                workflowInstanceLink.getCreateDate());

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

        if (!(obj instanceof WorkflowInstanceLink)) {
            return false;
        }

        WorkflowInstanceLink workflowInstanceLink = (WorkflowInstanceLink) obj;

        long primaryKey = workflowInstanceLink.getPrimaryKey();

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
        WorkflowInstanceLinkModelImpl workflowInstanceLinkModelImpl = this;

        workflowInstanceLinkModelImpl._originalGroupId = workflowInstanceLinkModelImpl._groupId;

        workflowInstanceLinkModelImpl._setOriginalGroupId = false;

        workflowInstanceLinkModelImpl._originalCompanyId = workflowInstanceLinkModelImpl._companyId;

        workflowInstanceLinkModelImpl._setOriginalCompanyId = false;

        workflowInstanceLinkModelImpl._originalClassNameId = workflowInstanceLinkModelImpl._classNameId;

        workflowInstanceLinkModelImpl._setOriginalClassNameId = false;

        workflowInstanceLinkModelImpl._originalClassPK = workflowInstanceLinkModelImpl._classPK;

        workflowInstanceLinkModelImpl._setOriginalClassPK = false;

        workflowInstanceLinkModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<WorkflowInstanceLink> toCacheModel() {
        WorkflowInstanceLinkCacheModel workflowInstanceLinkCacheModel = new WorkflowInstanceLinkCacheModel();

        workflowInstanceLinkCacheModel.workflowInstanceLinkId = getWorkflowInstanceLinkId();

        workflowInstanceLinkCacheModel.groupId = getGroupId();

        workflowInstanceLinkCacheModel.companyId = getCompanyId();

        workflowInstanceLinkCacheModel.userId = getUserId();

        workflowInstanceLinkCacheModel.userName = getUserName();

        String userName = workflowInstanceLinkCacheModel.userName;

        if ((userName != null) && (userName.length() == 0)) {
            workflowInstanceLinkCacheModel.userName = null;
        }

        Date createDate = getCreateDate();

        if (createDate != null) {
            workflowInstanceLinkCacheModel.createDate = createDate.getTime();
        } else {
            workflowInstanceLinkCacheModel.createDate = Long.MIN_VALUE;
        }

        Date modifiedDate = getModifiedDate();

        if (modifiedDate != null) {
            workflowInstanceLinkCacheModel.modifiedDate = modifiedDate.getTime();
        } else {
            workflowInstanceLinkCacheModel.modifiedDate = Long.MIN_VALUE;
        }

        workflowInstanceLinkCacheModel.classNameId = getClassNameId();

        workflowInstanceLinkCacheModel.classPK = getClassPK();

        workflowInstanceLinkCacheModel.workflowInstanceId = getWorkflowInstanceId();

        return workflowInstanceLinkCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{workflowInstanceLinkId=");
        sb.append(getWorkflowInstanceLinkId());
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
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", classNameId=");
        sb.append(getClassNameId());
        sb.append(", classPK=");
        sb.append(getClassPK());
        sb.append(", workflowInstanceId=");
        sb.append(getWorkflowInstanceId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(34);

        sb.append("<model><model-name>");
        sb.append("com.liferay.portal.model.WorkflowInstanceLink");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>workflowInstanceLinkId</column-name><column-value><![CDATA[");
        sb.append(getWorkflowInstanceLinkId());
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
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
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
            "<column><column-name>workflowInstanceId</column-name><column-value><![CDATA[");
        sb.append(getWorkflowInstanceId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
