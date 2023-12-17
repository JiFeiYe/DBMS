package com.tu.pojo;


import java.io.Serializable;

public class TeachRoom implements Serializable {

    private Integer roomId;
    private String roomName;
    private Integer majorId;

    public TeachRoom() {
    }

    public TeachRoom(Integer roomId, String roomName, Integer majorId) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.majorId = majorId;
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


    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

}
