package com.sc.starter.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName : ScProperties
 * @Description : 配置文件
 * @Author : wenrong
 * @Date: 2020-12-11 22:15
 */
//读取sc前缀的配置
@ConfigurationProperties(prefix = "sc.test")
public class ScProperties {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
