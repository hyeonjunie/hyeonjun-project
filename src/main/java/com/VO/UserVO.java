package com.VO;

public class UserVO {
	

	private String userid;
	private String userpassword;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	@Override
	public String toString() {
		return "UserVO [userid=" + userid + ", userpassword=" + userpassword + "]";
	}
	

}
