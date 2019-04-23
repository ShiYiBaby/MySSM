package com.shiyi.baby.utils;

import org.springframework.web.servlet.ModelAndView;

public class JumpWhere {
	//根据返回值和对象来决定跳到成功界面还是失败界面
	public static ModelAndView jump(boolean flag,ModelAndView modelAndView){
		if(flag){
			//如果成功
			modelAndView.setViewName("true");
		}else{
			//如果失败
			modelAndView.setViewName("false");
		}
		return modelAndView;
	}
}
