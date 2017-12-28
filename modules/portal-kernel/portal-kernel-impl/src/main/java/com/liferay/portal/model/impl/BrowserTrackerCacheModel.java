package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BrowserTracker;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing BrowserTracker in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see BrowserTracker
 * @generated
 */
public class BrowserTrackerCacheModel implements CacheModel<BrowserTracker>,
    Externalizable {
    public long browserTrackerId;
    public long userId;
    public long browserKey;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{browserTrackerId=");
        sb.append(browserTrackerId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", browserKey=");
        sb.append(browserKey);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public BrowserTracker toEntityModel() {
        BrowserTrackerImpl browserTrackerImpl = new BrowserTrackerImpl();

        browserTrackerImpl.setBrowserTrackerId(browserTrackerId);
        browserTrackerImpl.setUserId(userId);
        browserTrackerImpl.setBrowserKey(browserKey);

        browserTrackerImpl.resetOriginalValues();

        return browserTrackerImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        browserTrackerId = objectInput.readLong();
        userId = objectInput.readLong();
        browserKey = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(browserTrackerId);
        objectOutput.writeLong(userId);
        objectOutput.writeLong(browserKey);
    }
}
