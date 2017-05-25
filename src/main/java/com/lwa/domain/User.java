package com.lwa.domain;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by lwa on 2017/5/25.
 */
@Table(name = "user")
public class User {
    @Id
    private Long id;
    private String email;
    private String name;
    private String password;
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
