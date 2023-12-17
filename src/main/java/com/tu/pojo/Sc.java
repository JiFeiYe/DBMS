package com.tu.pojo;


import java.io.Serializable;

public class Sc implements Serializable {

    private Integer userId;
    private Integer courseId;
    private Integer grade;

    public Sc() {
    }

    public Sc(Integer userId, Integer courseId, Integer grade) {
        this.userId = userId;
        this.courseId = courseId;
        this.grade = grade;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }


    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

}
