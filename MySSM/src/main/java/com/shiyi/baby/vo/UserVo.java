package com.shiyi.baby.vo;

public class UserVo {
	private String name;
	private String password;
	private String questions;
	private String answers;

	public UserVo() {
		super();
	}

	public UserVo(String name, String password, String questions, String answers) {
		super();
		this.name = name;
		this.password = password;
		this.questions = questions;
		this.answers = answers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getQuestions() {
		return questions;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
	}

	public String getAnswers() {
		return answers;
	}

	public void setAnswers(String answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "UserVo [name=" + name + ", password=" + password + ", questions=" + questions + ", answers=" + answers
				+ "]";
	}

}
