package com.tu.pojo;


public class Department {

    private Integer deptId;
    private String deptName;
    private String schoolName;

    public Department() {
    }

    public Department(Integer deptId, String deptName, String schoolName) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.schoolName = schoolName;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }


    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }


    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

}
