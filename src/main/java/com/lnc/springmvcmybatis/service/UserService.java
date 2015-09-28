package com.lnc.springmvcmybatis.service;

import java.util.List;

import com.lnc.springmvcmybatis.bean.UserBean;

public interface UserService {

	List<UserBean> query();

	UserBean queryById(String id);

	void save(UserBean user);

	void delete(String id);

	void update(UserBean user);

}
