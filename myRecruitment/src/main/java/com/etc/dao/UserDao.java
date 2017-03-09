package com.etc.dao;

import org.apache.ibatis.annotations.Param;

import com.etc.entity.User;
/**
 个体用户数据访问层接口
 */
public interface UserDao {
	
	//用户登录
	public User login(@Param("uname")String uame,@Param("upwd")String upwd);
	
	//查看个人信息
	public User lookUpUser(@Param("uname")String uname);
	
	//添加个人用户信息
	public void addUser(User user);
	
	//修改个人用户信息
	public void amendUser(User user);
	
	
}
