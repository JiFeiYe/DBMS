package com.tu.dao;

import com.tu.pojo.Student;
import com.tu.util.BaseDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    public List<Student> getAll() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Student> lt = new ArrayList<Student>();
        try {
            conn = BaseDAO.getConnection();
            String sql = "select * from jwxt.student";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int userID = rs.getInt("userID");
                String userName = rs.getString("userName");
                int userSex = rs.getInt("userSex");
                int userAge = rs.getInt("userAge");
                String markYear = rs.getString("markYear");
                int classID = rs.getInt("classID");
                int majorID = rs.getInt("majorID");
                Student st = new Student(userID, userName, userSex, userAge, markYear, classID, majorID);
                lt.add(st);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lt;
    }
}
