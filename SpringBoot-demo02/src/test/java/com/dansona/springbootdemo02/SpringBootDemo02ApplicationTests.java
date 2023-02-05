package com.dansona.springbootdemo02;

import com.dansona.springbootdemo02.dao.UserRepository;
import com.dansona.springbootdemo02.dao.impl.UserRepositoryImpl;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * SpringBoot测试类
 * 前提是需要跟引导类的包匹配（相同包或子包）,因为需要调试的对象在spring容器中
 * 否则需要在@SpringBootTest加上classes属性 classes = SpringBootDemo02Application.class
 */
@SpringBootTest
//@SpringBootTest(classes = SpringBootDemo02Application.class)
class SpringBootDemo02ApplicationTests {

    @Test
    void contextLoads() {
    }

    /**
     * 1、注入测试对象
     * 2、执行注入对象方法
     */
    @Resource
    private UserRepository userRepository;

    @Test
    public void test1(){
        userRepository.save();
    }
}
