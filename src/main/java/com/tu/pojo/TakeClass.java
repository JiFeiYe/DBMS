package com.tu.pojo;


import java.sql.Timestamp;

public class TakeClass {

    private Integer teachId;
    private Integer courseId;
    private java.sql.Timestamp startTime;
    private java.sql.Timestamp endTime;

    public TakeClass() {
    }

    public TakeClass(Integer teachId, Integer courseId, Timestamp startTime, Timestamp endTime) {
        this.teachId = teachId;
        this.courseId = courseId;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Integer getTeachId() {
        return teachId;
    }

    public void setTeachId(Integer teachId) {
        this.teachId = teachId;
    }


    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }


    public java.sql.Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(java.sql.Timestamp startTime) {
        this.startTime = startTime;
    }


    public java.sql.Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(java.sql.Timestamp endTime) {
        this.endTime = endTime;
    }

}
