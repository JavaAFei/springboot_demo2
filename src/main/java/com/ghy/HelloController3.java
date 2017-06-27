package com.ghy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by GHY on 2017/6/26.
 * 使用模板返回页面
 */
@Controller
public class HelloController3 {
    @RequestMapping(value = "/hello3",method = RequestMethod.GET)
    public String hello() {
        return "index";
    }
}
