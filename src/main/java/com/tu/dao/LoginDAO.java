package com.tu.dao;

import com.tu.util.BaseDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
    public boolean isLogin(String username, String password) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        boolean isL = false;
        try {
            conn = BaseDAO.getConnection();
            String sql = "select count(1) from login where username = ? and password = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            rs = pstmt.executeQuery();
            rs.next();
            int count = rs.getInt(1);
            if (count > 0)
                isL = true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return isL;
    }
}
