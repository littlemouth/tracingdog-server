package com.dfst.tracingdog.repository;

import com.dfst.tracingdog.pojo.HistoryLocation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

/**
 * Created by yanfei on 2016-11-17.
 */

@Repository("HistroyLocationRepository")
public interface HistroyLocationRepository extends CrudRepository<HistoryLocation, Long> {
}
