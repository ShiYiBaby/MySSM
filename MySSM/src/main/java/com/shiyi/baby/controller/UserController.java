package com.shiyi.baby.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shiyi.baby.service.StudentService;
import com.shiyi.baby.service.UserService;
import com.shiyi.baby.utils.JumpWhere;
import com.shiyi.baby.vo.StudentVo;
import com.shiyi.baby.vo.UserVo;

@Controller
public class UserController {
	@Autowired
	public UserService service;
	@Autowired
	public StudentService studentService;

	// 登陆操作
	@RequestMapping("login")
	public String userLogin(String name, String password,HttpSession session) {
		boolean isTrue = service.userLoginIsTrue(name, password);
		session.setAttribute("user", name);
		if(isTrue){
			return "forward:select.do";
		}else{
			return "false";
		}
	}

	// 注册操作
	@RequestMapping("addUser.do")
	public ModelAndView addUser(UserVo userVo) {
		ModelAndView modelAndView = new ModelAndView();
		boolean addUser = service.addUser(userVo);
		modelAndView = JumpWhere.jump(addUser, modelAndView);
		return modelAndView;
	}
	
	@RequestMapping("select.do")
	public ModelAndView selectStudentAll(HttpSession session){
		ModelAndView modelAndView = new ModelAndView();
		List<StudentVo> list = studentService.getStudentAll();
		session.setAttribute("list", list);
		//modelAndView.addObject("list", list);
		modelAndView.setViewName("selectAll");
		return modelAndView;
	}
}
