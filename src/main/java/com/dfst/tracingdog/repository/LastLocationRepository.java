package com.dfst.tracingdog.repository;

import com.dfst.tracingdog.pojo.HistoryLocation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by yanfei on 2016-11-17.
 */

@Repository("LastLocationRepository")
public interface LastLocationRepository extends CrudRepository<HistoryLocation, Long> {
}
