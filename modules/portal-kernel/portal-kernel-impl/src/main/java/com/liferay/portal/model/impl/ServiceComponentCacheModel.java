package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ServiceComponent;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ServiceComponent in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ServiceComponent
 * @generated
 */
public class ServiceComponentCacheModel implements CacheModel<ServiceComponent>,
    Externalizable {
    public long serviceComponentId;
    public String buildNamespace;
    public long buildNumber;
    public long buildDate;
    public String data;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{serviceComponentId=");
        sb.append(serviceComponentId);
        sb.append(", buildNamespace=");
        sb.append(buildNamespace);
        sb.append(", buildNumber=");
        sb.append(buildNumber);
        sb.append(", buildDate=");
        sb.append(buildDate);
        sb.append(", data=");
        sb.append(data);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public ServiceComponent toEntityModel() {
        ServiceComponentImpl serviceComponentImpl = new ServiceComponentImpl();

        serviceComponentImpl.setServiceComponentId(serviceComponentId);

        if (buildNamespace == null) {
            serviceComponentImpl.setBuildNamespace(StringPool.BLANK);
        } else {
            serviceComponentImpl.setBuildNamespace(buildNamespace);
        }

        serviceComponentImpl.setBuildNumber(buildNumber);
        serviceComponentImpl.setBuildDate(buildDate);

        if (data == null) {
            serviceComponentImpl.setData(StringPool.BLANK);
        } else {
            serviceComponentImpl.setData(data);
        }

        serviceComponentImpl.resetOriginalValues();

        return serviceComponentImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        serviceComponentId = objectInput.readLong();
        buildNamespace = objectInput.readUTF();
        buildNumber = objectInput.readLong();
        buildDate = objectInput.readLong();
        data = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(serviceComponentId);

        if (buildNamespace == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(buildNamespace);
        }

        objectOutput.writeLong(buildNumber);
        objectOutput.writeLong(buildDate);

        if (data == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(data);
        }
    }
}
