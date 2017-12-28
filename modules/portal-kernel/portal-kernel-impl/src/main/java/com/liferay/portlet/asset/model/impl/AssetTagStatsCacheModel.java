package com.liferay.portlet.asset.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import com.liferay.portlet.asset.model.AssetTagStats;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing AssetTagStats in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see AssetTagStats
 * @generated
 */
public class AssetTagStatsCacheModel implements CacheModel<AssetTagStats>,
    Externalizable {
    public long tagStatsId;
    public long tagId;
    public long classNameId;
    public int assetCount;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{tagStatsId=");
        sb.append(tagStatsId);
        sb.append(", tagId=");
        sb.append(tagId);
        sb.append(", classNameId=");
        sb.append(classNameId);
        sb.append(", assetCount=");
        sb.append(assetCount);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public AssetTagStats toEntityModel() {
        AssetTagStatsImpl assetTagStatsImpl = new AssetTagStatsImpl();

        assetTagStatsImpl.setTagStatsId(tagStatsId);
        assetTagStatsImpl.setTagId(tagId);
        assetTagStatsImpl.setClassNameId(classNameId);
        assetTagStatsImpl.setAssetCount(assetCount);

        assetTagStatsImpl.resetOriginalValues();

        return assetTagStatsImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        tagStatsId = objectInput.readLong();
        tagId = objectInput.readLong();
        classNameId = objectInput.readLong();
        assetCount = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(tagStatsId);
        objectOutput.writeLong(tagId);
        objectOutput.writeLong(classNameId);
        objectOutput.writeInt(assetCount);
    }
}
