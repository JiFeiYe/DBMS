package com.tu.pojo;


import java.io.Serializable;

public class Student implements Serializable {

    private Integer userId;
    private String userName;
    private Integer userSex;
    private Integer userAge;
    private String markYear;
    private Integer classId;
    private Integer majorId;

    public Student() {
    }

    public Student(Integer userId, String userName, Integer userSex, Integer userAge, String markYear, Integer classId, Integer majorId) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.userAge = userAge;
        this.markYear = markYear;
        this.classId = classId;
        this.majorId = majorId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }


    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }


    public String getMarkYear() {
        return markYear;
    }

    public void setMarkYear(String markYear) {
        this.markYear = markYear;
    }


    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }


    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

}
