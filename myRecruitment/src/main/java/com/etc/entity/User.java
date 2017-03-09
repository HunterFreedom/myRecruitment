package com.etc.entity;

import java.util.List;

/**
 *个人用户 
 *
 */
public class User {
	private int uid;
	private String uname;
	private String upwd;
	private String usex;
	private String uphone;
	private String umail;
	private String hometown;
	private String remark;
	private List<Resume> resume;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(int uid, String uname, String upwd, String usex, String uphone,
			String umail, String hometown, String remark, List<Resume> resume) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upwd = upwd;
		this.usex = usex;
		this.uphone = uphone;
		this.umail = umail;
		this.hometown = hometown;
		this.remark = remark;
		this.resume = resume;
	}
	
	
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getUsex() {
		return usex;
	}
	public void setUsex(String usex) {
		this.usex = usex;
	}
	public String getUphone() {
		return uphone;
	}
	public void setUphone(String uphone) {
		this.uphone = uphone;
	}
	public String getUmail() {
		return umail;
	}
	public void setUmail(String umail) {
		this.umail = umail;
	}
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<Resume> getResume() {
		return resume;
	}

	public void setResume(List<Resume> resume) {
		this.resume = resume;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd
				+ ", usex=" + usex + ", uphone=" + uphone + ", umail=" + umail
				+ ", hometown=" + hometown + ", remark=" + remark + ", resume="
				+ resume + "]";
	}
	
	

	
}
