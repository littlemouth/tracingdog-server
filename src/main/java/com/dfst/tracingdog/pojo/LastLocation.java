package com.dfst.tracingdog.pojo;

import com.dfst.tracingdog.util.CustomDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yanfei on 2016-11-17.
 */

@Entity
@Table(name="location_last")
public class LastLocation extends Location<Integer> {
    private Integer id;
    private Date time;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Override
    public Integer getId() {
        return null;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public Double getLongitude() {
        return longitude;
    }

    @Override
    public Double getLatitude() {
        return latitude;
    }

    @Column(name="user_id")
    @Override
    public Integer getUserId() {
        return userId;
    }
}
