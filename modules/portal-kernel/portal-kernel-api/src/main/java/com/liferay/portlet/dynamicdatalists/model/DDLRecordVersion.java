package com.liferay.portlet.dynamicdatalists.model;

/**
 * The extended model interface for the DDLRecordVersion service. Represents a row in the &quot;DDLRecordVersion&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see DDLRecordVersionModel
 * @see com.liferay.portlet.dynamicdatalists.model.impl.DDLRecordVersionImpl
 * @see com.liferay.portlet.dynamicdatalists.model.impl.DDLRecordVersionModelImpl
 * @generated
 */
public interface DDLRecordVersion extends DDLRecordVersionModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.dynamicdatalists.model.impl.DDLRecordVersionImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public com.liferay.portlet.dynamicdatalists.model.DDLRecord getRecord()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portlet.dynamicdatalists.model.DDLRecordSet getRecordSet()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;
}
