package com.tu.pojo;


import java.io.Serializable;

public class Teacher implements Serializable {

    private Integer teachId;
    private String teachName;
    private Integer teachSex;
    private Integer teachAge;
    private String degree;
    private String title;
    private String teachYear;
    private Integer roomId;
    private Integer classId;

    public Teacher() {
    }

    public Teacher(Integer teachId, String teachName, Integer teachSex, Integer teachAge, String degree, String title, String teachYear, Integer roomId, Integer classId) {
        this.teachId = teachId;
        this.teachName = teachName;
        this.teachSex = teachSex;
        this.teachAge = teachAge;
        this.degree = degree;
        this.title = title;
        this.teachYear = teachYear;
        this.roomId = roomId;
        this.classId = classId;
    }

    public Integer getTeachId() {
        return teachId;
    }

    public void setTeachId(Integer teachId) {
        this.teachId = teachId;
    }


    public String getTeachName() {
        return teachName;
    }

    public void setTeachName(String teachName) {
        this.teachName = teachName;
    }


    public Integer getTeachSex() {
        return teachSex;
    }

    public void setTeachSex(Integer teachSex) {
        this.teachSex = teachSex;
    }


    public Integer getTeachAge() {
        return teachAge;
    }

    public void setTeachAge(Integer teachAge) {
        this.teachAge = teachAge;
    }


    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getTeachYear() {
        return teachYear;
    }

    public void setTeachYear(String teachYear) {
        this.teachYear = teachYear;
    }


    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }


    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

}
