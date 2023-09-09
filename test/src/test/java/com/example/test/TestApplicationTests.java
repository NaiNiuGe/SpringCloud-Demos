package com.example.test;

import com.example.test.Infrastructure.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class TestApplicationTests {

	@Test
	void contextLoads() {
	}
	@Value("${com.druid.testuser.name}")
	private  String name;
	@Value("${com.druid.testuser.sex}")
	private  String sex;
	@Value("${com.druid.testuser.age}")
	private  int age;

	@Test
	void testProperties(){
		System.out.println("name==>"+name);
		System.out.println("age==>"+age);
		System.out.println("sex==>"+sex);
	}

	@Autowired
	StudentMapper mapper;

	@Autowired
	DataSource dataSource;
	@Test
	void testMapper() throws SQLException {
//		System.out.println(dataSource.getConnection());
//		System.out.printf("", mapper.queryById("001"));
	}

}
