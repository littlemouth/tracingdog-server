package com.dfst.tracingdog.pojo;

import javax.persistence.*;

/**
 * Created by yanfei on 2016-11-16.
 */
@Entity
@Table(name="user")
public class User extends BaseEntity<Integer> {
    private Integer id;
    private String username;
    private String password;
    private String head;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    @Column
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }
}
