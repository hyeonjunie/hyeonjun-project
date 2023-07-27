package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.VO.UserVO;

import JDBCUtil.JDBCUtil;

public class UserDAO {
	
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	private final String USERGET = "select * from userss where userid=? and userpassword=?";
	
	public UserVO getUser(UserVO vo) {
		UserVO user = null;
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(USERGET);
			stmt.setString(1, vo.getUserid());
			stmt.setString(2, vo.getUserpassword());
			rs = stmt.executeQuery();
			if(rs.next()) {
				user = new UserVO();
				user.setUserid(rs.getString("USERID"));
				user.setUserpassword(rs.getString("USERPASSWORD"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(stmt, conn, rs);
		}
		return user;
	}


}
