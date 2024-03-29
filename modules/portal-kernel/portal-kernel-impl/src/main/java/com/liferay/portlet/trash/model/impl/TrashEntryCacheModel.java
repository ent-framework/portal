package com.liferay.portlet.trash.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.liferay.portlet.trash.model.TrashEntry;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TrashEntry in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see TrashEntry
 * @generated
 */
public class TrashEntryCacheModel implements CacheModel<TrashEntry>,
    Externalizable {
    public long entryId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long classNameId;
    public long classPK;
    public long systemEventSetKey;
    public String typeSettings;
    public int status;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(23);

        sb.append("{entryId=");
        sb.append(entryId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", classNameId=");
        sb.append(classNameId);
        sb.append(", classPK=");
        sb.append(classPK);
        sb.append(", systemEventSetKey=");
        sb.append(systemEventSetKey);
        sb.append(", typeSettings=");
        sb.append(typeSettings);
        sb.append(", status=");
        sb.append(status);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public TrashEntry toEntityModel() {
        TrashEntryImpl trashEntryImpl = new TrashEntryImpl();

        trashEntryImpl.setEntryId(entryId);
        trashEntryImpl.setGroupId(groupId);
        trashEntryImpl.setCompanyId(companyId);
        trashEntryImpl.setUserId(userId);

        if (userName == null) {
            trashEntryImpl.setUserName(StringPool.BLANK);
        } else {
            trashEntryImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            trashEntryImpl.setCreateDate(null);
        } else {
            trashEntryImpl.setCreateDate(new Date(createDate));
        }

        trashEntryImpl.setClassNameId(classNameId);
        trashEntryImpl.setClassPK(classPK);
        trashEntryImpl.setSystemEventSetKey(systemEventSetKey);

        if (typeSettings == null) {
            trashEntryImpl.setTypeSettings(StringPool.BLANK);
        } else {
            trashEntryImpl.setTypeSettings(typeSettings);
        }

        trashEntryImpl.setStatus(status);

        trashEntryImpl.resetOriginalValues();

        return trashEntryImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        entryId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        classNameId = objectInput.readLong();
        classPK = objectInput.readLong();
        systemEventSetKey = objectInput.readLong();
        typeSettings = objectInput.readUTF();
        status = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(entryId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(classNameId);
        objectOutput.writeLong(classPK);
        objectOutput.writeLong(systemEventSetKey);

        if (typeSettings == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(typeSettings);
        }

        objectOutput.writeInt(status);
    }
}
