package com.jiwei.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //调用前端参数
        String method = req.getParameter("method");
        if (method.equals("add")) {
            req.getSession().setAttribute("msg","执行了Add方法");
        }
        if (method.equals("delete")) {
            req.getSession().setAttribute("msg","执行了Delete方法");
        }
        //处理业务逻辑
        //视图转发或者重定向
        req.getRequestDispatcher("/WEB-INF/jsp/test.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
