package com.dfst.tracingdog.service;

import com.dfst.tracingdog.pojo.HistoryLocation;
import com.dfst.tracingdog.pojo.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yanfei on 2016-11-17.
 */
@Service("HistoryLocationService")
public class HistoryLocationService extends BaseService<HistoryLocation, Long> {

    @Override
    @Resource(name = "HistroyLocationRepository")
    public void setRepository(CrudRepository repository) {
        this.repository = repository;
    }

    public void add(HistoryLocation location) {
        repository.save(location);
    }
}
