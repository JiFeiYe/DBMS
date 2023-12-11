package com.tu.pojo;


public class Major {

    private Integer majorId;
    private String majorName;
    private Integer deptId;

    public Major() {
    }

    public Major(Integer majorId, String majorName, Integer deptId) {
        this.majorId = majorId;
        this.majorName = majorName;
        this.deptId = deptId;
    }

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }


    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }


    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

}
