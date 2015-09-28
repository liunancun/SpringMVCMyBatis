package com.lnc.springmvcmybatis.mapper;

import java.util.List;

import com.lnc.springmvcmybatis.bean.UserBean;

public interface UserMapper {

	List<UserBean> query();

	UserBean queryById(String id);

	void insert(UserBean user);

	void delete(String id);

	void update(UserBean user);

}
