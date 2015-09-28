package com.lnc.springmvcmybatis.service.impl;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import com.lnc.springmvcmybatis.bean.UserBean;
import com.lnc.springmvcmybatis.mapper.UserMapper;
import com.lnc.springmvcmybatis.service.UserService;

public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;

	@Override
	public List<UserBean> query() {

		List<UserBean> users = userMapper.query();

		return users;
	}

	@Override
	public UserBean queryById(String id) {

		UserBean user = userMapper.queryById(id);

		return user;
	}

	@Override
	public void save(UserBean user) {

		String id = UUID.randomUUID().toString();
		id = id.replaceAll("-", "");
		user.setId(id);

		userMapper.insert(user);
	}

	@Override
	public void delete(String id) {
		userMapper.delete(id);
	}

	@Override
	public void update(UserBean user) {
		userMapper.update(user);
	}

}
