package com.etc.service;

import org.apache.ibatis.annotations.Param;

import com.etc.entity.CompanyUser;
/**
 * 
  企业用户服务层接口
 *
 */
public interface CompanyUserService {
	       
			//公司用户登录
			public CompanyUser login(@Param("cuname")String cuname,@Param("cupwd")String cupwd);
			
			//查看个人信息
			public CompanyUser lookUpCUser(@Param("cuname")String cuname);
			
			//添加，修改个人用户信息
			public void amendCUser(CompanyUser cuser);
}
