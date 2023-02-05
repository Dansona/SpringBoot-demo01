/**
 * Copyright (C), 2022-2023,
 * FileName: User2Controller
 * Author:   cyl
 * Date:     2023/2/5 21:01
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.dansona.springbootdemo02.controller;

import com.dansona.springbootdemo02.bean.UserInfo;
import com.dansona.springbootdemo02.config.DataSource;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author cyl
 * @create 2023/2/5
 * @since 1.0.0
 */
@RestController
@RequestMapping("/user2")
public class User2Controller {
    /**
     * 使用自动装配将所有的数据装载到一个对象Environment
     */
    @Resource
    private Environment environment;

    @Resource
    private UserInfo userInfo;

    @Resource
    private DataSource dataSource;

    @GetMapping("/{id}")
    public String getUser(@PathVariable Integer id){
        System.out.println(environment.getProperty("name"));
        System.out.println(userInfo);
        System.out.println(dataSource);
        return id.toString();
    }
}