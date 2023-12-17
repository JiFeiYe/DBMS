package com.tu.util;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BaseDAO {
    public static Connection getConnection() {
        Context context;
        Connection conn = null;
        try {
            context = new InitialContext();
            DataSource ds = (DataSource) context.lookup("java:comp/env/jndi/jwxt");
            conn = ds.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeAll(ResultSet rs, PreparedStatement pstmt, Connection conn) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
