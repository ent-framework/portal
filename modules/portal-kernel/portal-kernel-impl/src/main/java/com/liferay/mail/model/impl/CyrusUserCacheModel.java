package com.liferay.mail.model.impl;

import com.liferay.mail.model.CyrusUser;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing CyrusUser in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CyrusUser
 * @generated
 */
public class CyrusUserCacheModel implements CacheModel<CyrusUser>,
    Externalizable {
    public String userId;
    public String password;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{userId=");
        sb.append(userId);
        sb.append(", password=");
        sb.append(password);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public CyrusUser toEntityModel() {
        CyrusUserImpl cyrusUserImpl = new CyrusUserImpl();

        if (userId == null) {
            cyrusUserImpl.setUserId(StringPool.BLANK);
        } else {
            cyrusUserImpl.setUserId(userId);
        }

        if (password == null) {
            cyrusUserImpl.setPassword(StringPool.BLANK);
        } else {
            cyrusUserImpl.setPassword(password);
        }

        cyrusUserImpl.resetOriginalValues();

        return cyrusUserImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        userId = objectInput.readUTF();
        password = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (userId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userId);
        }

        if (password == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(password);
        }
    }
}
