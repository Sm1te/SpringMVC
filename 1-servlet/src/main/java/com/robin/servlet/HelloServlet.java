package com.robin.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    /**
     * 1.重写doGet方法
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /**
         * 1.1 获取前端参数
         */
        String method =req.getParameter("method");
        // 判断调用的请求是add方法还是delete方法
        if(method.equals("add")) {
            // 执行add方法
            req.getSession().setAttribute("msg","执行了add方法");
        }
        if(method.equals("delete")) {
            // 执行delete方法
            req.getSession().setAttribute("msg","执行了delete方法");
        }

        /**
         * 1.2 调用业务层
         * 为了省事, 具体的业务逻辑就不写了
         */

        /**
         * 1.3 视图转或者重定向
         */
        // 1.3.1 使用转发请求
        req.getRequestDispatcher("/WEB-INF/jsp/test.jsp").forward(req,resp);
        // 1.3.2 或者使用重定向
//        resp.sendRedirect();
    }

    /**
     * 2.重写doPost方法
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

}