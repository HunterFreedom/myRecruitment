package com.etc.dao;

import org.apache.ibatis.annotations.Param;

import com.etc.entity.CompanyUser;
import com.etc.entity.User;

/**
 * 
 * 公司用户数据访问层接口
 *
 */
public interface CompanyUserDao {
	 
		//公司用户登录
		public CompanyUser login(@Param("cuname")String cuname,@Param("cupwd")String cupwd);
		
		//查看个人信息
		public CompanyUser lookUpCUser(@Param("cuname")String cuame);
		
		//添加公司用户信息
		public void addCUser(CompanyUser cuser);
		
		//修改公司用户信息
		public void amendCUser(CompanyUser cuser);
		
}
