/**
 * Copyright (C), 2022-2023,
 * FileName: UserInfo
 * Author:   cyl
 * Date:     2023/2/5 21:10
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.dansona.springbootdemo02.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author cyl
 * @create 2023/2/5
 * @since 1.0.0
 */
//1、定义数据模式封装yml文件中对应的数据
//2、定义为spring管理的bean
@Component
//3、指定加载的数据 该注解需要引入spring-boot-configuration-processor包
@ConfigurationProperties(prefix = "userinfo")
public class UserInfo {
    /**
     * 定义数据模式封装yml文件中对应的数据
     * 定义为spring管理的bean
     * 指定加载的数据
     * 不能缺少getter、setter方法
     */
    private String name;
    private Integer gender;

    private String[] subject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String[] getSubject() {
        return subject;
    }

    public void setSubject(String[] subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", subject=" + subject +
                '}';
    }
}