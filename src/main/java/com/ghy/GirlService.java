package com.ghy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by GHY on 2017/6/26.
 */
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(16);
        girlRepository.save(girlA);
        System.out.print("1");
        Girl girlB = new Girl();
        girlB.setCupSize("BBB");
        girlB.setAge(19);
        girlRepository.save(girlB);
    }

}
