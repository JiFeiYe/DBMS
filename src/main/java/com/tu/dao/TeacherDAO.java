package com.tu.dao;

import com.tu.pojo.Teacher;
import com.tu.util.BaseDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TeacherDAO {
    public List<Teacher> getAllById(int teachId) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Teacher> lts = new ArrayList<Teacher>();
        try {
            conn = BaseDAO.getConnection();
            String sql = "select * from jwxt.teacher where teachID = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, teachId);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int teachID = rs.getInt("teachID");
                String teachName = rs.getString("teachName");
                int teachSex = rs.getInt("teachSex");
                int teachAge = rs.getInt("teachAge");
                String degree = rs.getString("degree");
                String title = rs.getString("title");
                String teachYear = rs.getString("teachYear");
                int roomId = rs.getInt("roomID");
                int classId = rs.getInt("classID");
                Teacher te = new Teacher(teachID, teachName, teachSex, teachAge, degree, title, teachYear, roomId, classId);
                lts.add(te);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            BaseDAO.closeAll(rs, pstmt, conn);
        }
        return lts;
    }

    public List<Teacher> getAll() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Teacher> lts = new ArrayList<Teacher>();
        try {
            conn = BaseDAO.getConnection();
            String sql = "select * from jwxt.teacher";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int teachId = rs.getInt("teachID");
                String teachName = rs.getString("teachName");
                int teachSex = rs.getInt("teachSex");
                int teachAge = rs.getInt("teachAge");
                String degeree = rs.getString("degeree");
                String title = rs.getString("title");
                String teachYear = rs.getString("teachYear");
                int roomId = rs.getInt("roomID");
                int classId = rs.getInt("classID");
                Teacher te = new Teacher(teachId, teachName, teachSex, teachAge, degeree, title, teachYear, roomId, classId);
                lts.add(te);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            BaseDAO.closeAll(rs, pstmt, conn);
        }
        return lts;
    }
}
