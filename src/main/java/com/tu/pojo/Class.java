package com.tu.pojo;


public class Class {

    private Integer classId;
    private String className;
    private Integer majorId;

    public Class() {
    }

    public Class(Integer classId, String className, Integer majorId) {
        this.classId = classId;
        this.className = className;
        this.majorId = majorId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }


    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }


    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

}
