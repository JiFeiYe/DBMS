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

        if ("register".equals(oper)) {
            String username = req.getParameter("username");
            LoginDAO ld = new LoginDAO();
            boolean isR = ld.isRegister(username);
            out.println(isR);
        } else if ("login".equals(oper)) {
            String username = req.getParameter("username");
            String password = req.getParameter("password");
            LoginDAO ld = new LoginDAO();
            boolean isL = ld.isLogin(username, password);
            if (isL) { // 验证成功
                resp.sendRedirect("#");
            } else { // 登录验证失败
                resp.sendRedirect("login.html");
            }
        }
    }
}
