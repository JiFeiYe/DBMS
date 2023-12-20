package com.tu.dao;

import com.tu.pojo.Teacher;
import com.tu.util.BaseDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TeacherDAO {
    public boolean updateTeacher(Teacher t) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        boolean isU = false;
        try {
            conn = BaseDAO.getConnection();
            String sql = "update jwxt.teacher set teachName = ?, teachSex = ?, teachAge = ?, degree = ?, title = ?, roomID = ?, classID = ? where teachID = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(8, t.getTeachId());
            pstmt.setString(1, t.getTeachName());
            pstmt.setInt(2, t.getTeachSex());
            pstmt.setInt(3, t.getTeachAge());
            pstmt.setString(4, t.getDegree());
            pstmt.setString(5, t.getTitle());
            pstmt.setInt(6, t.getRoomId());
            pstmt.setInt(7, t.getClassId());
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

    public Teacher getAllById(int teachId) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Teacher t = null;
        try {
            conn = BaseDAO.getConnection();
            String sql = "select * from jwxt.teacher where teachID = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, teachId);
            rs = pstmt.executeQuery();
            rs.next();
            int teachID = rs.getInt("teachID");
            String teachName = rs.getString("teachName");
            int teachSex = rs.getInt("teachSex");
            int teachAge = rs.getInt("teachAge");
            String degree = rs.getString("degree");
            String title = rs.getString("title");
            String teachYear = rs.getString("teachYear");
            int roomId = rs.getInt("roomID");
            int classId = rs.getInt("classID");
            t = new Teacher(teachID, teachName, teachSex, teachAge, degree, title, teachYear, roomId, classId);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            BaseDAO.closeAll(rs, pstmt, conn);
        }
        return t;
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
                String degree = rs.getString("degree");
                String title = rs.getString("title");
                String teachYear = rs.getString("teachYear");
                int roomId = rs.getInt("roomID");
                int classId = rs.getInt("classID");
                Teacher te = new Teacher(teachId, teachName, teachSex, teachAge, degree, title, teachYear, roomId, classId);
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
