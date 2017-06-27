package com.ghy;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by GHY on 2017/6/26.
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {

    public List<Girl> findByAge(Integer age);
}
