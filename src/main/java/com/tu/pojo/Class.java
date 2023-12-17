package com.tu.pojo;


import java.io.Serializable;

public class Class implements Serializable {

    private Integer classId;
    private Integer majorId;

    public Class() {
    }

    public Class(Integer classId, Integer majorId) {
        this.classId = classId;
        this.majorId = majorId;
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
