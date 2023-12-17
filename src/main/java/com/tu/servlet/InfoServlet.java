package com.tu.servlet;

import com.tu.dao.StudentDAO;
import com.tu.dao.TeacherDAO;
import com.tu.pojo.Student;
import com.tu.pojo.Teacher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/InfoServlet")
public class InfoServlet extends HttpServlet {
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

        if ("student".equals(oper)) { // session返回学生信息
            String temp = session.getAttribute("userid").toString();
            int userid = Integer.parseInt(temp);
            StudentDAO sd = new StudentDAO();
            List<Student> lts = sd.getAllById(userid);
            session.setAttribute("lts", lts);
            resp.sendRedirect("student.jsp");
        } else if ("teacher".equals(oper)) { // session返回老师信息
            String temp = session.getAttribute("teachid").toString();
            int teachid = Integer.parseInt(temp);
            TeacherDAO td = new TeacherDAO();
            List<Teacher> lts = td.getAllById(teachid);
            session.setAttribute("lts", lts);
            resp.sendRedirect("teacher.jsp");
        }
    }
}
