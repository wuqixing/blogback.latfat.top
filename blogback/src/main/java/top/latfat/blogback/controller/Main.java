package top.latfat.blogback.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import top.latfat.blogback.entity.User;
import top.latfat.blogback.service.UserService;

@Controller
public class Main {
	
	@Resource
	private UserService service;

	@RequestMapping("/hello.do")
	@ResponseBody
	public String hello(String name) {
		return "hello" + name;
	}
	
	@RequestMapping("/save.do")
	@ResponseBody
	public String save(String id, String name) {
		service.save(new User(id, name));
		return "Done";
	}
}
