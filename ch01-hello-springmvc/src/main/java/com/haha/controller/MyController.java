package com.haha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2022/3/28 19:30
 */

@Controller
public class MyController {

    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(){

        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","欢迎使用springmvc");
        mv.addObject("fun","执行的是dosome方法");

        mv.setViewName("show");

        return mv;

    }

}
