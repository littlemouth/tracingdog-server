package com.dfst.tracingdog.service;

import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

/**
 * Created by yanfei on 2016-11-17.
 */
public abstract class BaseService<T, ID extends Serializable> {
    protected CrudRepository repository;

    public abstract void setRepository(CrudRepository repository);

    public T findOne(ID id) {
        return (T) repository.findOne(id);
    }
}
