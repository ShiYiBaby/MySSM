package com.shiyi.baby.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiyi.baby.dao.UserDao;
import com.shiyi.baby.vo.UserVo;

@Service
public class UserService {
	@Autowired
	public UserDao dao;

	// 判断用户是否登陆成功
	public boolean userLoginIsTrue(String name, String password) {
		if (name != null && password != null && !"".equals(name) && !"".equals(password)) {
			UserVo userVo = dao.selectOne(name, password);
			if (userVo != null) {
				// 登陆成功
				return true;
			} else {
				// 登陆失败
				return false;
			}
		} else {
			// 账号密码为空
			return false;
		}
	}

	// 注册功能的实现
	public boolean addUser(UserVo userVo) {
		String name = userVo.getName();
		String password = userVo.getPassword();
		String answers = userVo.getAnswers();
		String questions = userVo.getQuestions();
		if (!"".equals(name) && name != null && !"".equals(password) && password != null && !"".equals(answers)
				&& answers != null && !"".equals(questions) && questions != null) {
			// 字段都不为空可以插入
			int insertOne = dao.insertOne(userVo);
			if (insertOne == 1) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
