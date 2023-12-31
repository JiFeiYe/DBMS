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

        if ("root".equals(oper)) { // 管理员查看所有信息，允许增删改查
            StudentDAO sd = new StudentDAO();
            TeacherDAO td = new TeacherDAO();
            List<Student> stults = sd.getAll();
            List<Teacher> tealts = td.getAll();
            session.setAttribute("stults", stults);
            session.setAttribute("tealts", tealts);
            resp.sendRedirect("allmessage.jsp");
        } else if ("detail".equals(oper)) { // 管理员查看详情，session需覆盖下两个elseif
            String man = req.getParameter("man");
            if ("stu".equals(man)) {
                String userid = req.getParameter("userId");
                StudentDAO sd = new StudentDAO();
                Student s = sd.getAllById(Integer.parseInt(userid));
                session.setAttribute("stu", s);
                resp.sendRedirect("studentdetail.jsp");
            } else if ("teach".equals(man)) {
                String teachid = req.getParameter("teachId");
                TeacherDAO td = new TeacherDAO();
                Teacher t = td.getAllById(Integer.parseInt(teachid));
                session.setAttribute("teach", t);
                resp.sendRedirect("teacherdetail.jsp");
            }
        } else if ("student".equals(oper)) { // session返回学生信息
            String temp = session.getAttribute("userid").toString();
            int userid = Integer.parseInt(temp);
            StudentDAO sd = new StudentDAO();
            Student s = sd.getAllById(userid);
            session.setAttribute("stu", s);
            resp.sendRedirect("student.jsp");
        } else if ("teacher".equals(oper)) { // session返回老师信息
            String temp = session.getAttribute("teachid").toString();
            int teachid = Integer.parseInt(temp);
            TeacherDAO td = new TeacherDAO();
            Teacher t = td.getAllById(teachid);
            session.setAttribute("teach", t);
            resp.sendRedirect("teacher.jsp");
        } else if ("studentupdate".equals(oper)) { // 学生信息更新
            int userId = Integer.parseInt(req.getParameter("userId"));
            String userName = req.getParameter("userName");
            int userSex = Integer.parseInt(req.getParameter("userSex"));
            int userAge = Integer.parseInt(req.getParameter("userAge"));
            String markYear = req.getParameter("markYear");
            int classId = Integer.parseInt(req.getParameter("classId"));
            int majorId = Integer.parseInt(req.getParameter("majorId"));

            Student s = new Student(userId, userName, userSex, userAge, markYear, classId, majorId);
            StudentDAO sd = new StudentDAO();
            boolean isU = sd.updateStudent(s);
            if (isU) { // 更新成功
                Student stu = sd.getAllById(userId);
                session.setAttribute("stu", stu);
                out.print("<script>alert('update success');</script>");
                out.print("<script>location.href='student.jsp';</script>");
            }
        } else if ("teacherupdate".equals(oper)) {
            int teachId = Integer.parseInt(req.getParameter("teachId"));
            String teachName = req.getParameter("teachName");
            int teachSex = Integer.parseInt(req.getParameter("teachSex"));
            int teachAge = Integer.parseInt(req.getParameter("teachAge"));
            String degree = req.getParameter("degree");
            String title = req.getParameter("title");
            String teachYear = req.getParameter("teachYear");
            int roomId = Integer.parseInt(req.getParameter("roomId"));
            int classId = Integer.parseInt(req.getParameter("classId"));

            Teacher t = new Teacher(teachId, teachName, teachSex, teachAge, degree, title, teachYear, roomId, classId);
            TeacherDAO td = new TeacherDAO();
            boolean isU = td.updateTeacher(t);
            if (isU) { // 更新成功
                Teacher tea = td.getAllById(teachId);
                session.setAttribute("teach", tea);
                out.print("<script>alert('update success');</script>");
                out.print("<script>location.href='teacher.jsp';</script>");
            }
        }
    }
}
