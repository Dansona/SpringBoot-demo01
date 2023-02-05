package com.dansona.springbootdemo02;

import com.dansona.springbootdemo02.dao.UserRepository;
import com.dansona.springbootdemo02.dao.impl.UserRepositoryImpl;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * SpringBoot测试类
 */
@SpringBootTest
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
