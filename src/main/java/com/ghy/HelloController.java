package com.ghy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by GHY on 2017/6/26.
 */
@RestController
public class HelloController {

    @Value("${girl.cupSize}")
    private String cupSize;

    @Value("${girl.age}")
    private Integer age;

    @Value("${girl.content}")
    private String content;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello() {
        return cupSize+"---"+age+"---"+content;
    }
}
