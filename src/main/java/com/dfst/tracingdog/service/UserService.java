package com.dfst.tracingdog.service;

import com.dfst.tracingdog.pojo.BaseEntity;
import com.dfst.tracingdog.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yanfei on 2016-11-17.
 */
@Service("UserService")
public class UserService extends BaseService<User, Integer> {

    @Override
    @Resource(name = "UserRepository")
    public void setRepository(CrudRepository repository) {
        this.repository = repository;
    }

    public void add(User user) {
        repository.save(user);
    }
}
