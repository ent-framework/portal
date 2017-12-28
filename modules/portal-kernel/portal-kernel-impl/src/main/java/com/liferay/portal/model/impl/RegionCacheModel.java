package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.Region;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Region in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Region
 * @generated
 */
public class RegionCacheModel implements CacheModel<Region>, Externalizable {
    public long regionId;
    public long countryId;
    public String regionCode;
    public String name;
    public boolean active;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{regionId=");
        sb.append(regionId);
        sb.append(", countryId=");
        sb.append(countryId);
        sb.append(", regionCode=");
        sb.append(regionCode);
        sb.append(", name=");
        sb.append(name);
        sb.append(", active=");
        sb.append(active);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Region toEntityModel() {
        RegionImpl regionImpl = new RegionImpl();

        regionImpl.setRegionId(regionId);
        regionImpl.setCountryId(countryId);

        if (regionCode == null) {
            regionImpl.setRegionCode(StringPool.BLANK);
        } else {
            regionImpl.setRegionCode(regionCode);
        }

        if (name == null) {
            regionImpl.setName(StringPool.BLANK);
        } else {
            regionImpl.setName(name);
        }

        regionImpl.setActive(active);

        regionImpl.resetOriginalValues();

        return regionImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        regionId = objectInput.readLong();
        countryId = objectInput.readLong();
        regionCode = objectInput.readUTF();
        name = objectInput.readUTF();
        active = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(regionId);
        objectOutput.writeLong(countryId);

        if (regionCode == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(regionCode);
        }

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        objectOutput.writeBoolean(active);
    }
}
