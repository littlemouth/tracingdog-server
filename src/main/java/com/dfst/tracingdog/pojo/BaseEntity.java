package com.dfst.tracingdog.pojo;

import java.io.Serializable;

/**
 * Created by yanfei on 2016-11-17.
 */
public abstract class BaseEntity<ID extends Serializable> {

    public abstract ID getId();
}
