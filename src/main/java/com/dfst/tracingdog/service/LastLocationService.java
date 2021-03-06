package com.dfst.tracingdog.service;

import com.dfst.tracingdog.pojo.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yanfei on 2016-11-17.
 */
@Service("LastLocationService")
public class LastLocationService extends BaseService<User, Integer> {

    @Override
    @Resource(name = "LastLocationRepository")
    public void setRepository(CrudRepository repository) {
        this.repository = repository;
    }
}
