package com.dfst.tracingdog.repository;

import com.dfst.tracingdog.pojo.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

/**
 * Created by yanfei on 2016-11-17.
 */
@Table(name="user")
@Repository("UserRepository")
public interface UserRepository extends CrudRepository<User, Long> {

    /*@Query("select u from User u where u.username=:name")//"select t from User t where t.username=:name")
    public User findUserByName(@Param("name") String name);*/
}
