package com.tu.dao;

import com.tu.pojo.Student;
import com.tu.util.BaseDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    public boolean updateStudent(Student s) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        boolean isU = false;
        try {
            conn = BaseDAO.getConnection();
            String sql = "update jwxt.student set userName = ?, userSex = ?, userAge = ?, classID = ?, majorID = ? where userID = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(6, s.getUserId());
            pstmt.setString(1, s.getUserName());
            pstmt.setInt(2, s.getUserSex());
            pstmt.setInt(3, s.getUserAge());
            pstmt.setInt(4, s.getClassId());
            pstmt.setInt(5, s.getMajorId());
            int count = pstmt.executeUpdate();
            if (count > 0)
                isU = true;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            BaseDAO.closeAll(null, pstmt, conn);
        }
        return isU;
    }

    public List<Student> getAllById(int userId) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Student> lts = new ArrayList<Student>();
        try {
            conn = BaseDAO.getConnection();
            String sql = "select * from jwxt.student where userID = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, userId);
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
                lts.add(st);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            BaseDAO.closeAll(rs, pstmt, conn);
        }
        return lts;
    }

    public List<Student> getAll() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Student> lts = new ArrayList<Student>();
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
                lts.add(st);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            BaseDAO.closeAll(rs, pstmt, conn);
        }
        return lts;
    }
}
