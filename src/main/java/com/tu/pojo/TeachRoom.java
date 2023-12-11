package com.tu.pojo;


public class TeachRoom {

    private Integer roomId;
    private String roomName;
    private Integer deptId;

    public TeachRoom() {
    }

    public TeachRoom(Integer roomId, String roomName, Integer deptId) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.deptId = deptId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }


    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }


    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

}
