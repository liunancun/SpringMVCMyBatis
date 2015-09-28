package com.lnc.springmvcmybatis.bean;

public class UserBean {

	private String id;

	private String name;

	private String sex;

	private Integer age;

	private String desc;

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "UserBean [id=" + id + ", name=" + name + ", sex=" + sex
				+ ", age=" + age + ", desc=" + desc + "]";
	}

}
