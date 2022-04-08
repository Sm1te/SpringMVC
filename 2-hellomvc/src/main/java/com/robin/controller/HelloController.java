package com.robin.controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//注意：这里要实现Controller接口，是web.servlet.mvc包下
public class HelloController implements Controller {

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
        // 获取ModelAndView对象 (模型和视图)
        ModelAndView mv = new ModelAndView();
        /**
         * 业务代码
         */
        // 设置返回结果
        String result = "HelloSpringMVC";
        // 封装对象，放在ModelAndView中
        mv.addObject("msg",result);
        // 视图跳转: 封装要跳转的视图, 放在ModelAndView中
        mv.setViewName("hello"); // 访问路径: /WEB-INF/jsp/hello.jsp
        return mv;
    }

}
