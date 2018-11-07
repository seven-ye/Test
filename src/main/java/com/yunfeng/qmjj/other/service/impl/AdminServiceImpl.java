package com.yunfeng.qmjj.other.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yunfeng.qmjj.other.dao.a.TestDao;
import com.yunfeng.qmjj.other.dao.b.Test2Dao;
import com.yunfeng.qmjj.other.main.a.Test;
import com.yunfeng.qmjj.other.main.b.Test2;
import com.yunfeng.qmjj.other.service.AdminService;

@Service
@Transactional
public class AdminServiceImpl implements AdminService{

	@Autowired
	private TestDao testDao;
	
	@Autowired
	private Test2Dao test2Dao;
	
	
	
	@Override
	public void updatePasswordById(String pwd, String id) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public Test findTest1ByNameAndPwd(String name, String age) {
		return testDao.findByNameAndage(name, age);
	}



	@Override
	public Test2 findTest2ByNameAndPwd(String name, String pwd) {
		return test2Dao.findByNameAndPwd(name, pwd);
	}

}
