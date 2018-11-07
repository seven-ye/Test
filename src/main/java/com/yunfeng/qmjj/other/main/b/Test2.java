package com.yunfeng.qmjj.other.main.b;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


/**
 * 后台用户注册信息
 * @author rengeng
 *
 */
@Entity
@Table(name = "test2")
@Getter
@Setter
public class Test2 {
	
	 
	@Id
	@Column(length = 32, nullable = false, name = "id")
	private String id;
	
	@Column(length = 32, name = "name")
	private String name;
	
	@Column(length = 32, name = "pwd")
	private String pwd;
	
}
