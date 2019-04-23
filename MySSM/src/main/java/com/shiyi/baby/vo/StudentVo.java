package com.shiyi.baby.vo;

public class StudentVo {
	private int id;
	private String name;
	private String sex;
	private int age;
	private int sourcesum;

	public StudentVo() {
		super();
	}

	public StudentVo(int id, String name, String sex, int age, int sourcesum) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.sourcesum = sourcesum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSourcesum() {
		return sourcesum;
	}

	public void setSourcesum(int sourcesum) {
		this.sourcesum = sourcesum;
	}

	@Override
	public String toString() {
		return "StudentVo [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", sourcesum=" + sourcesum
				+ "]";
	}

}
