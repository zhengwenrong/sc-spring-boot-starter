package com.sc.starter.service;

import com.sc.starter.properties.ScProperties;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName : ScService
 * @Description :  测试service
 * @Author : wenrong
 * @Date: 2020-12-11 22:31
 */
public class ScService {

    @Autowired
    private ScProperties scProperties;

    public  void  printProperties(){
        System.out.println(scProperties.getName() + "----" + scProperties.getAge());
    }

}
