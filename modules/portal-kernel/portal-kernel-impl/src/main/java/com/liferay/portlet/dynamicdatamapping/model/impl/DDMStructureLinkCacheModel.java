package com.liferay.portlet.dynamicdatamapping.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DDMStructureLink in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see DDMStructureLink
 * @generated
 */
public class DDMStructureLinkCacheModel implements CacheModel<DDMStructureLink>,
    Externalizable {
    public long structureLinkId;
    public long classNameId;
    public long classPK;
    public long structureId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{structureLinkId=");
        sb.append(structureLinkId);
        sb.append(", classNameId=");
        sb.append(classNameId);
        sb.append(", classPK=");
        sb.append(classPK);
        sb.append(", structureId=");
        sb.append(structureId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public DDMStructureLink toEntityModel() {
        DDMStructureLinkImpl ddmStructureLinkImpl = new DDMStructureLinkImpl();

        ddmStructureLinkImpl.setStructureLinkId(structureLinkId);
        ddmStructureLinkImpl.setClassNameId(classNameId);
        ddmStructureLinkImpl.setClassPK(classPK);
        ddmStructureLinkImpl.setStructureId(structureId);

        ddmStructureLinkImpl.resetOriginalValues();

        return ddmStructureLinkImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        structureLinkId = objectInput.readLong();
        classNameId = objectInput.readLong();
        classPK = objectInput.readLong();
        structureId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(structureLinkId);
        objectOutput.writeLong(classNameId);
        objectOutput.writeLong(classPK);
        objectOutput.writeLong(structureId);
    }
}
