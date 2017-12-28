package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.PluginSetting;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing PluginSetting in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see PluginSetting
 * @generated
 */
public class PluginSettingCacheModel implements CacheModel<PluginSetting>,
    Externalizable {
    public long pluginSettingId;
    public long companyId;
    public String pluginId;
    public String pluginType;
    public String roles;
    public boolean active;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{pluginSettingId=");
        sb.append(pluginSettingId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", pluginId=");
        sb.append(pluginId);
        sb.append(", pluginType=");
        sb.append(pluginType);
        sb.append(", roles=");
        sb.append(roles);
        sb.append(", active=");
        sb.append(active);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public PluginSetting toEntityModel() {
        PluginSettingImpl pluginSettingImpl = new PluginSettingImpl();

        pluginSettingImpl.setPluginSettingId(pluginSettingId);
        pluginSettingImpl.setCompanyId(companyId);

        if (pluginId == null) {
            pluginSettingImpl.setPluginId(StringPool.BLANK);
        } else {
            pluginSettingImpl.setPluginId(pluginId);
        }

        if (pluginType == null) {
            pluginSettingImpl.setPluginType(StringPool.BLANK);
        } else {
            pluginSettingImpl.setPluginType(pluginType);
        }

        if (roles == null) {
            pluginSettingImpl.setRoles(StringPool.BLANK);
        } else {
            pluginSettingImpl.setRoles(roles);
        }

        pluginSettingImpl.setActive(active);

        pluginSettingImpl.resetOriginalValues();

        return pluginSettingImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        pluginSettingId = objectInput.readLong();
        companyId = objectInput.readLong();
        pluginId = objectInput.readUTF();
        pluginType = objectInput.readUTF();
        roles = objectInput.readUTF();
        active = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(pluginSettingId);
        objectOutput.writeLong(companyId);

        if (pluginId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(pluginId);
        }

        if (pluginType == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(pluginType);
        }

        if (roles == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(roles);
        }

        objectOutput.writeBoolean(active);
    }
}
