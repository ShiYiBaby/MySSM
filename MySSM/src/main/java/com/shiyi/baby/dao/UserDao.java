package com.shiyi.baby.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.shiyi.baby.utils.GetUserSqlSessionFactory;
import com.shiyi.baby.vo.UserVo;

@Repository
public class UserDao {
	// 通过账号密码查询所有信息
	public UserVo selectOne(String name, String password) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", name);
		map.put("password", password);
		SqlSessionFactory sqlSessionFactory = GetUserSqlSessionFactory.getSqlSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		UserVo userVo = session.selectOne("userVo.selectOne", map);
		return userVo;
	}

	// 添加用户信息
	public int insertOne(UserVo userVo) {
		SqlSessionFactory sqlSessionFactory = GetUserSqlSessionFactory.getSqlSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		int i = session.insert("userVo.insertOne", userVo);
		session.commit();
		return i;
	}
}
