package com.shiyi.baby.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiyi.baby.dao.StudentDao;
import com.shiyi.baby.vo.StudentVo;

@Service
public class StudentService {
	// 注入dao对象
	@Autowired
	public StudentDao dao;

	// 获取所有学生信息
	public List<StudentVo> getStudentAll() {
		return dao.selectStudentAll();
	}
}
