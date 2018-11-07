package com.yunfeng.qmjj.other.service;

import com.yunfeng.qmjj.other.main.a.Test;
import com.yunfeng.qmjj.other.main.b.Test2;

public interface AdminService {

	void updatePasswordById(String pwd, String id);
	
	Test findTest1ByNameAndPwd(String name , String pwd);
	
	Test2 findTest2ByNameAndPwd(String name , String pwd);
}
