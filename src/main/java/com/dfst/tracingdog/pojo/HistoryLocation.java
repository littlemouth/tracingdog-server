package com.dfst.tracingdog.pojo;

import com.dfst.tracingdog.util.CustomDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yanfei on 2016-11-17.
 */
@Entity
@Table(name="location_history")
public class HistoryLocation extends Location<Long> {
    private Long id;
    private Date time;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column
    @JsonSerialize(using = CustomDateSerializer.class)
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Column
    @Override
    public Double getLongitude() {
        return longitude;
    }

    @Column
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
