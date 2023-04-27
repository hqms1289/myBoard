package com.myproject.myBoard;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@SpringBootApplication
public class MyBoardApplication {

	
//	전체 어플리케이션의 메인 함수
	public static void main(String[] args) {
		SpringApplication.run(MyBoardApplication.class, args);
		System.out.println("======================== App Start Complete ========================");
	}
	
	
//	SqlSessionFactory가 무엇을 의미하는지?
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		
		Resource[] res = new PathMatchingResourcePatternResolver()
						.getResources("classpath:mybatis/mapper/*.xml");
		
		sessionFactory.setMapperLocations(res);
		
		return sessionFactory.getObject();
		
		
	}

}
