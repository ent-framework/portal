package com.liferay.portlet.documentlibrary.model;

import java.sql.Blob;

/**
 * The Blob model class for lazy loading the data column in DLContent.
 *
 * @author Brian Wing Shun Chan
 * @see DLContent
 * @generated
 */
public class DLContentDataBlobModel {
    private long _contentId;
    private Blob _dataBlob;

    public DLContentDataBlobModel() {
    }

    public DLContentDataBlobModel(long contentId) {
        _contentId = contentId;
    }

    public DLContentDataBlobModel(long contentId, Blob dataBlob) {
        _contentId = contentId;
        _dataBlob = dataBlob;
    }

    public long getContentId() {
        return _contentId;
    }

    public void setContentId(long contentId) {
        _contentId = contentId;
    }

    public Blob getDataBlob() {
        return _dataBlob;
    }

    public void setDataBlob(Blob dataBlob) {
        _dataBlob = dataBlob;
    }
}
