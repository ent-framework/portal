package com.liferay.portal.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.portal.service.http.ImageServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.portal.service.http.ImageServiceSoap
 * @generated
 */
public class ImageSoap implements Serializable {
    private long _imageId;
    private Date _modifiedDate;
    private String _type;
    private int _height;
    private int _width;
    private int _size;

    public ImageSoap() {
    }

    public static ImageSoap toSoapModel(Image model) {
        ImageSoap soapModel = new ImageSoap();

        soapModel.setImageId(model.getImageId());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setType(model.getType());
        soapModel.setHeight(model.getHeight());
        soapModel.setWidth(model.getWidth());
        soapModel.setSize(model.getSize());

        return soapModel;
    }

    public static ImageSoap[] toSoapModels(Image[] models) {
        ImageSoap[] soapModels = new ImageSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static ImageSoap[][] toSoapModels(Image[][] models) {
        ImageSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new ImageSoap[models.length][models[0].length];
        } else {
            soapModels = new ImageSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static ImageSoap[] toSoapModels(List<Image> models) {
        List<ImageSoap> soapModels = new ArrayList<ImageSoap>(models.size());

        for (Image model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new ImageSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _imageId;
    }

    public void setPrimaryKey(long pk) {
        setImageId(pk);
    }

    public long getImageId() {
        return _imageId;
    }

    public void setImageId(long imageId) {
        _imageId = imageId;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public String getType() {
        return _type;
    }

    public void setType(String type) {
        _type = type;
    }

    public int getHeight() {
        return _height;
    }

    public void setHeight(int height) {
        _height = height;
    }

    public int getWidth() {
        return _width;
    }

    public void setWidth(int width) {
        _width = width;
    }

    public int getSize() {
        return _size;
    }

    public void setSize(int size) {
        _size = size;
    }
}
