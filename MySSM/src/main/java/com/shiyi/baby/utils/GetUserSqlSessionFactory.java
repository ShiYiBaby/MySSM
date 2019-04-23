package com.shiyi.baby.utils;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class GetUserSqlSessionFactory {
	//获取User的SessionFactory
	public static SqlSessionFactory getSqlSessionFactory() {
		SqlSessionFactory build = null;
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader("MyBatisConfig.xml");
		} catch (IOException e) {
			e.printStackTrace();
		}
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
		build = sqlSessionFactoryBuilder.build(reader);
		return build;
	}
}
