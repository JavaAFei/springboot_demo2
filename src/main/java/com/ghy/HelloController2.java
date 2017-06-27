package com.ghy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by GHY on 2017/6/26.
 */
@RestController
public class HelloController2 {
    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    public String hello() {
        return girlProperties.getCupSize()+"---"+girlProperties.getAge()+"---"+girlProperties.getContent();
    }
}
