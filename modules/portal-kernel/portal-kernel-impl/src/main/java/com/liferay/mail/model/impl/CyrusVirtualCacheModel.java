package com.liferay.mail.model.impl;

import com.liferay.mail.model.CyrusVirtual;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing CyrusVirtual in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CyrusVirtual
 * @generated
 */
public class CyrusVirtualCacheModel implements CacheModel<CyrusVirtual>,
    Externalizable {
    public String emailAddress;
    public String userId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{emailAddress=");
        sb.append(emailAddress);
        sb.append(", userId=");
        sb.append(userId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public CyrusVirtual toEntityModel() {
        CyrusVirtualImpl cyrusVirtualImpl = new CyrusVirtualImpl();

        if (emailAddress == null) {
            cyrusVirtualImpl.setEmailAddress(StringPool.BLANK);
        } else {
            cyrusVirtualImpl.setEmailAddress(emailAddress);
        }

        if (userId == null) {
            cyrusVirtualImpl.setUserId(StringPool.BLANK);
        } else {
            cyrusVirtualImpl.setUserId(userId);
        }

        cyrusVirtualImpl.resetOriginalValues();

        return cyrusVirtualImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        emailAddress = objectInput.readUTF();
        userId = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (emailAddress == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(emailAddress);
        }

        if (userId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userId);
        }
    }
}
