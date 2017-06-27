package com.ghy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by GHY on 2017/6/26.
 */
@RestController
@RequestMapping("/girl")
public class GirlController {
    @Autowired
    private GirlRepository girlRepository;
    @Autowired
    private GirlService girlService;
    /**
     * 查询所有女生列表
     * @return
     */
    @GetMapping(value = "/list")
    public List<Girl> girlList(){
        return girlRepository.findAll();
    }

    @PostMapping(value = "/add")
    public Girl girlAdd(@RequestParam("cupSize") String cupSize,
                          @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);
       return girlRepository.save(girl);
    }

    @GetMapping("/find/{id}")
    public Girl girlFind(@PathVariable("id") Integer id){
        return  girlRepository.findOne(id);
    }

    @PostMapping("/update/{id}")
    public Girl girlUpdate(@PathVariable("id") Integer id,
                           @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return girlRepository.save(girl);
    }

    @PostMapping("/delete/{id}")
    public String girlDelete(@PathVariable("id") Integer id){
        girlRepository.delete(id);
        return id.toString();
    }

    @PostMapping("/findByAge")
    public List<Girl> girlFindByAge(@RequestParam("age") Integer age){
        return  girlRepository.findByAge(age);
    }

    @GetMapping("/addTwo")
    public void addTwo(){
        girlService.insertTwo();
    }
}
