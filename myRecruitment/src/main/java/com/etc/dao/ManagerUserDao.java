package com.etc.dao;

import org.apache.ibatis.annotations.Param;

import com.etc.entity.ManagerUser;
import com.etc.entity.User;


/**
 * 
 *管理员数据访问层接口
 *
 */
public interface ManagerUserDao {
	
		//用户登录
		public ManagerUser Managerlogin(@Param("muname")String muname,@Param("mupwd")String mupwd);
		
		//查看管理员信息
		public ManagerUser lookUpMUser(@Param("muname")String muname);
		
		//添加个人用户信息
		public void addManagerUser(ManagerUser muser);
		
		//修改管理员信息
		public void amendMUser(ManagerUser muser);
}
