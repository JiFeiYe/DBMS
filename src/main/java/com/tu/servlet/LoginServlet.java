package com.tu.servlet;

import com.tu.dao.LoginDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String oper = req.getParameter("oper");
        PrintWriter out = resp.getWriter();
        HttpSession session = req.getSession();

        if ("register".equals(oper)) { // 注册验证(重名)
            String username = req.getParameter("userid");
            LoginDAO ld = new LoginDAO();
            boolean isR = ld.isRegister(username);
            out.println(isR);
        } else if ("registerIn".equals(oper)) { // 数据记录
            // todo
        } else if ("login".equals(oper)) { // 登录验证
            String userid = req.getParameter("userid");
            String password = req.getParameter("password");
            LoginDAO ld = new LoginDAO();
            int type = ld.isLogin(userid, password);
            if (type == 1) { // 验证成功，1是学生
                session.setAttribute("userid", userid);
                session.setAttribute("type", 1);
                resp.sendRedirect("/DBMS/InfoServlet?oper=student");
            } else if (type == 2) { // 验证成功，2是老师
                session.setAttribute("teachid", userid);
                session.setAttribute("type", 2);
                resp.sendRedirect("/DBMS/InfoServlet?oper=teacher");
            } else if (type == 3) { // 验证成功，3是管理员
                session.setAttribute("type", 3);
                session.setAttribute("rootid", userid);
                resp.sendRedirect("/DBMS/InfoServlet?oper=root");
            } else { // 登录验证失败
                out.print("<script>alert('login failed');</script>");
                out.print("<script>location.href='login.html';</script>");
            }
        }
    }
}
