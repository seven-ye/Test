package com.yunfeng.qmjj.other.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yunfeng.qmjj.other.dao.a.TestDao;
import com.yunfeng.qmjj.other.dao.b.Test2Dao;
import com.yunfeng.qmjj.other.main.a.Test;
import com.yunfeng.qmjj.other.main.b.Test2;
import com.yunfeng.qmjj.other.service.AdminService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 用户基础信息服务
 * @author rengeng
 *
 */
@Api(tags="用户基础信息服务")
@RestController
@RequestMapping("/Test")
public class TestController {
	
	@Autowired
	TestDao testDao;
	
	@Autowired
	Test2Dao test2Dao;
	
	@Autowired
	AdminService adminService;
	

	
	/**
	 *  tets用户列表
	 * @param req
	 * @return
	 */
	@PostMapping("/1")
	@ApiOperation("1")
	public Object test(){
		String name = "小培";
		String pwd = "55";
		Test t1 = adminService.findTest1ByNameAndPwd(name, pwd);
		Test2 t2 = adminService.findTest2ByNameAndPwd(name, pwd);
		System.out.println(t1.getId()+"-------------"+t2.getId());
		return null;
	}
	
	
	@PostMapping("/2")
	@ApiOperation("2")
	public Object test2(){
		return test2Dao.findAll();
	}
}


	

