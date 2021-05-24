package com.the.config;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisConfig {
	private static SqlSessionFactory sqlSessionFactory;
	
	public static SqlSessionFactory getInstance() {
		if(sqlSessionFactory == null)
			new MyBatisConfig();
		
		return sqlSessionFactory;
	}
	
	private MyBatisConfig() {
		Reader reader = null;
		
		try {
			reader = Resources.getResourceAsReader("/com/the/config/mybatis-config.xml");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);

	}
	
	
	
}
