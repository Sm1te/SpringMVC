package com.robin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// 使用@Controller注解, 将该类注册为控制器, 交由Spring的IOC容器统一管理
@Controller
// 使用@RequestMapping注解, 设置请求映射: 作用域是类或者方法
@RequestMapping("/hello")
public class HelloController {

    // 真实访问地址：localhost:8080/hello/h1
    @RequestMapping("/h1")
    public String hello1(Model model) {
        // 封装数据: 向模型中添加属性msg与值, 可以在JSP页面中取出并渲染
        model.addAttribute("msg","Hello，SpringMVCAnnotation!");
        // 视图解析器处理视图名称 (注意: 这里的"hello"是指jsp页面的名称)
        return "hello";
    }

    /**
     * 设置多个请求映射, 用来跳转不同的页面
     */
    // 真实访问地址：localhost:8080/hello/h2
    @RequestMapping("/h2")
    public String hello2(Model model) {
        // 封装数据
        model.addAttribute("msg","Hello，SpringMVC!");
        // 视图解析器处理视图名称
        return "hello";
    }

    // 真实访问地址：localhost:8080/hello/h3
    @RequestMapping("/h3")
    public String hello3(Model model) {
        // 封装数据
        model.addAttribute("msg","Hello，Spring!");
        // 视图解析器处理视图名称
        return "hello";
    }

}
