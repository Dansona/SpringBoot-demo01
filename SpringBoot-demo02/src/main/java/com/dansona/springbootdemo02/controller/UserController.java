/**
 * Copyright (C), 2022-2023,
 * FileName: BookController
 * Author:   cyl
 * Date:     2023/2/1 22:38
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.dansona.springbootdemo02.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author cyl
 * @create 2023/2/1
 * @since 1.0.0
 */
@RestController
@RequestMapping("/users")
public class UserController {

    /**
     * 读取yml配置文件数据
     * 使用value读取yml属性文件 ${一级属性名.二级属性名...}
     */
    @Value("${name}")
    private String userName;
    @Value("${tempDir}")
    private String tempDir;
    //@Value("${subject}")
   // private List<String> subject;

    @GetMapping("/{id}")
    public String getUserById(@PathVariable Integer id){
        System.out.println(id+"---"+userName);
        System.out.println(id+"---"+tempDir);
        //System.out.println(id+"---"+subject);
        return userName;
    }
}