package com.tu.dao;

import com.tu.util.BaseDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
    /**
     * 通过名字判断账号是否已存在
     *
     * @param username
     * @return
     */
    public boolean isRegister(String username) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        boolean isR = false;
        try {
            conn = BaseDAO.getConnection();
            String sql = "select count(1) from jwxt.login where userid = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            rs = pstmt.executeQuery();
            rs.next();
            int count = rs.getInt(1);
            if (count > 0)
                isR = true;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            BaseDAO.closeAll(rs, pstmt, conn);
        }
        return isR;
    }

    /**
     * 验证登录
     *
     * @param username
     * @param password
     * @return
     */
    public int isLogin(String username, String password) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        int type = 0;
        try {
            conn = BaseDAO.getConnection();
            String sql = "select count(1), type from jwxt.login where userid = ? and password = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            rs = pstmt.executeQuery();
            rs.next();
            int count = rs.getInt(1);
            if (count > 0)
                type = rs.getInt("type");
            else
                return count;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            BaseDAO.closeAll(rs, pstmt, conn);
        }
        return type;
    }
}
