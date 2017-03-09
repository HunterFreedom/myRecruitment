package com.etc.service;
/**
 * 
 */
		
import org.apache.ibatis.annotations.Param;

import com.etc.entity.User;
/**
 * 
  个体用户服务层接口
 *
 */
public interface UserService {
	//游客注册
	public void register(@Param("name")String uname,@Param("pwd")String pwd);
	
	//用户登录
	public User login(@Param("uname")String uname,@Param("upwd")String upwd);
	
	//查看个人信息
		public User lookUpUser(@Param("uname")String uname);
		
	//修改个人用户信息
	public void amendUser(User user);
	
}
