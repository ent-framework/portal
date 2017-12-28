package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.PortalPreferences;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing PortalPreferences in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see PortalPreferences
 * @generated
 */
public class PortalPreferencesCacheModel implements CacheModel<PortalPreferences>,
    Externalizable {
    public long portalPreferencesId;
    public long ownerId;
    public int ownerType;
    public String preferences;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{portalPreferencesId=");
        sb.append(portalPreferencesId);
        sb.append(", ownerId=");
        sb.append(ownerId);
        sb.append(", ownerType=");
        sb.append(ownerType);
        sb.append(", preferences=");
        sb.append(preferences);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public PortalPreferences toEntityModel() {
        PortalPreferencesImpl portalPreferencesImpl = new PortalPreferencesImpl();

        portalPreferencesImpl.setPortalPreferencesId(portalPreferencesId);
        portalPreferencesImpl.setOwnerId(ownerId);
        portalPreferencesImpl.setOwnerType(ownerType);

        if (preferences == null) {
            portalPreferencesImpl.setPreferences(StringPool.BLANK);
        } else {
            portalPreferencesImpl.setPreferences(preferences);
        }

        portalPreferencesImpl.resetOriginalValues();

        return portalPreferencesImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        portalPreferencesId = objectInput.readLong();
        ownerId = objectInput.readLong();
        ownerType = objectInput.readInt();
        preferences = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(portalPreferencesId);
        objectOutput.writeLong(ownerId);
        objectOutput.writeInt(ownerType);

        if (preferences == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(preferences);
        }
    }
}
