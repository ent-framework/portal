package com.liferay.portlet.ratings.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.liferay.portlet.ratings.model.RatingsEntry;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing RatingsEntry in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see RatingsEntry
 * @generated
 */
public class RatingsEntryCacheModel implements CacheModel<RatingsEntry>,
    Externalizable {
    public long entryId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public long classNameId;
    public long classPK;
    public double score;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{entryId=");
        sb.append(entryId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", classNameId=");
        sb.append(classNameId);
        sb.append(", classPK=");
        sb.append(classPK);
        sb.append(", score=");
        sb.append(score);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public RatingsEntry toEntityModel() {
        RatingsEntryImpl ratingsEntryImpl = new RatingsEntryImpl();

        ratingsEntryImpl.setEntryId(entryId);
        ratingsEntryImpl.setCompanyId(companyId);
        ratingsEntryImpl.setUserId(userId);

        if (userName == null) {
            ratingsEntryImpl.setUserName(StringPool.BLANK);
        } else {
            ratingsEntryImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            ratingsEntryImpl.setCreateDate(null);
        } else {
            ratingsEntryImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            ratingsEntryImpl.setModifiedDate(null);
        } else {
            ratingsEntryImpl.setModifiedDate(new Date(modifiedDate));
        }

        ratingsEntryImpl.setClassNameId(classNameId);
        ratingsEntryImpl.setClassPK(classPK);
        ratingsEntryImpl.setScore(score);

        ratingsEntryImpl.resetOriginalValues();

        return ratingsEntryImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        entryId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        classNameId = objectInput.readLong();
        classPK = objectInput.readLong();
        score = objectInput.readDouble();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(entryId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);
        objectOutput.writeLong(classNameId);
        objectOutput.writeLong(classPK);
        objectOutput.writeDouble(score);
    }
}
