package com.dansona;

import com.dansona.dao.BookRepository;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootDemo03MybatisApplicationTests {

	@Test
	void contextLoads() {
	}

	@Resource
	private BookRepository bookRepository;

	@Test
	public void test(){
		bookRepository.getBookById(1L);
	}
}
