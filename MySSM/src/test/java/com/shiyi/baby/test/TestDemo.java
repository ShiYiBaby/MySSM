package com.shiyi.baby.test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.shiyi.baby.vo.UserVo;

public class TestDemo {
	public SqlSessionFactory build = null;

	@Before
	public void init() {
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader("MybatisConfig.xml");
		} catch (IOException e) {
			e.printStackTrace();
		}
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
		build = sqlSessionFactoryBuilder.build(reader);
	}
	@Test
	public void show(){
		SqlSession session = build.openSession();
		UserVo userVo = new UserVo("root","root","问题","答案");
		int insert = session.insert("userVo.insertOne",userVo);
		session.commit();
		System.out.println(insert);
	}

}
