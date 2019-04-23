package com.shiyi.baby.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.shiyi.baby.utils.GetUserSqlSessionFactory;
import com.shiyi.baby.vo.StudentVo;

@Repository
public class StudentDao {
	// 查询全部学生信息
	public List<StudentVo> selectStudentAll() {
		SqlSessionFactory sqlSessionFactory = GetUserSqlSessionFactory.getSqlSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		List<StudentVo> list = session.selectList("StudentVo.selectAll");
		return list;
	}
}
