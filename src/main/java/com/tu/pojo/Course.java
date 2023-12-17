package com.tu.pojo;


import java.io.Serializable;
import java.sql.Date;

public class Course implements Serializable {

    private Integer courseId;
    private String courseName;
    private java.sql.Date hours;
    private double credit;
    private Integer teachId;

    public Course() {
    }

    public Course(Integer courseId, String courseName, Date hours, double credit, Integer teachId) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.hours = hours;
        this.credit = credit;
        this.teachId = teachId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    public java.sql.Date getHours() {
        return hours;
    }

    public void setHours(java.sql.Date hours) {
        this.hours = hours;
    }


    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }


    public Integer getTeachId() {
        return teachId;
    }

    public void setTeachId(Integer teachId) {
        this.teachId = teachId;
    }

}
