package com.dfst.tracingdog.pojo;

import java.io.Serializable;

/**
 * Created by yanfei on 2016-11-18.
 */
public abstract class Location<T extends Serializable> extends BaseEntity<T> {
    protected Double longitude;
    protected Double latitude;
    protected Integer userId;

    public abstract Double getLongitude();

    public abstract Double getLatitude();

    public abstract Integer getUserId();

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
