package com.ghy;

import org.springframework.web.bind.annotation.*;

/**
 * Created by GHY on 2017/6/26.
 * 使用模板返回页面
 */
//@Controller
//@ResponseBody
@RestController
@RequestMapping("say")
public class HelloController4 {
    @RequestMapping(value ={"{id1}//hello4/{id2}","hi"},method = RequestMethod.GET)
    public String hello(@PathVariable("id1") String id1,
                        @PathVariable("id2") Integer id2,
                        @RequestParam("id3") Integer id3,
                        @RequestParam(value = "id4",required = false,defaultValue = "0") Integer id4) {
        return "id1："+id1+"，id2："+id2+"，id3："+id3+"，id4："+id4;
    }
}