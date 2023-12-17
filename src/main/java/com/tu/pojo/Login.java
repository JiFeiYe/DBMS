package com.tu.pojo;


import java.io.Serializable;

public class Login implements Serializable {

    private Integer id;
    private String userid;
    private String password;
    private Integer type;

    public Login() {
    }

    public Login(Integer id, String userid, String password, Integer type) {
        this.id = id;
        this.userid = userid;
        this.password = password;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

}
