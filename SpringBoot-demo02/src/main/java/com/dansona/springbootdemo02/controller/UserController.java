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

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping
    public String getUserById(){
        System.out.println("zhangsan");
        return "zhangsan";
    }
}