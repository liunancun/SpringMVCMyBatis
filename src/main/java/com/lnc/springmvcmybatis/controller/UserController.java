package com.lnc.springmvcmybatis.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lnc.springmvcmybatis.bean.UserBean;
import com.lnc.springmvcmybatis.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {

	@Resource
	private UserService userService;

	@RequestMapping("list")
	public String list(Model model) {

		List<UserBean> users = userService.query();
		model.addAttribute("users", users);

		return "/user/list";
	}

	@RequestMapping("initAdd")
	public String initAdd() {

		return "/user/add";
	}

	@RequestMapping("add")
	public String add(Model model, UserBean user) {

		userService.save(user);

		return "redirect:list.action";
	}

	@RequestMapping("initEdit")
	public String initEdit(Model model, String id) {

		UserBean user = userService.queryById(id);
		model.addAttribute("user", user);

		return "/user/edit";
	}

	@RequestMapping("edit")
	public String edit(Model model, UserBean user) {

		userService.update(user);

		return "redirect:list.action";
	}

	@RequestMapping("delete")
	public String delete(Model model, String id) {

		userService.delete(id);

		return "redirect:list.action";
	}

}
