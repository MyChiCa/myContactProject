package Contact.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;


import myContact.model.User;

public class UserDao {
	/*
	 * ÓÃ»§µÇÂ¼
	 */
	public User login(Connection con,User user) throws Exception{
		User resultUser = null;
		String sql = "select * from Users where UserName = ? and Password = ?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, user.getUserName());
		pstmt.setString(2, user.getPassword());	
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()){
			resultUser = new User();	
			resultUser.setUserName(rs.getString("UserName"));
			resultUser.setPassword(rs.getString("Password"));
			resultUser.setUserID(rs.getString("UserID"));
		}
		
		return resultUser;
	}
	
}
