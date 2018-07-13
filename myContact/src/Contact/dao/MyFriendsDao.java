package Contact.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import myContact.model.Group;
import myContact.model.MyFriends;
import myContact.model.User;
import myContact.view.AddView;
import myContact.view.ManagerView;
import myContact.view.Login;
public class MyFriendsDao {
       public static ResultSet myFriendsList(Connection con) throws Exception{
    	   String a = Login.textField.getText();
    	   String sql = "select Name,MyFriends.Tele,QQ,Email,Address,Age,Birth,Sex,GroupName,ID from MyFriends,[Group],Users where Users.UserID = [Group].UserID and [Group].Tele = MyFriends.Tele and UserName = '"+a+"'order by Age";
    	   PreparedStatement pstmt = con.prepareStatement(sql);
    	   return pstmt.executeQuery();
}
       
       public static int AddMyFriendsDao(Connection con,MyFriends myFriends) throws Exception{
    	        String a = User.getUserID();
    	        String b = AddView.GroupTextField.getText();;
    	        String c = MyFriends.getTele();
    	        String d = MyFriends.getName();
    	        String e = MyFriends.getAge();;
    	        String f = MyFriends.getTele();
    	        String g = MyFriends.getSex();
    	        String h = MyFriends.getAddress();
    	        String i = MyFriends.getEmail();
    	        String j = MyFriends.getBirth();
    	        String k = MyFriends.getQQ();
    			String sql = "Exec insert_pro '"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"'";
    			PreparedStatement pstmt = con.prepareStatement(sql);   			   			
    			return pstmt.executeUpdate();
       }		
       
       public int DeleteMyFriends(Connection con,String Tele)throws Exception{
    	   String sql = "delete from MyFriends where Tele = ?";
    	   PreparedStatement pstmt = con.prepareStatement(sql);
    	   pstmt.setString(1, Tele);
    	   return pstmt.executeUpdate();
       }
       
       public static ResultSet QueryMyFriendsDao(Connection con) throws Exception{
    	   String a = Login.textField.getText();
    	   String b = ManagerView.QueryTextField.getText();
    	   String sql = "select Name,MyFriends.Tele,QQ,Email,Address,Age,Birth,Sex,GroupName,ID from MyFriends,[Group],Users where Users.UserID = [Group].UserID and [Group].Tele = MyFriends.Tele and UserName = '"+a+"' and Name like '%"+b+"%'order by Age";
    	   PreparedStatement pstmt = con.prepareStatement(sql);
    	   return pstmt.executeQuery();
       }
       public static ResultSet QueryMyFriendsDao1(Connection con) throws Exception{
    	   String a = Login.textField.getText();
    	   String b = ManagerView.QueryTextField.getText();
    	   String sql = "select Name,MyFriends.Tele,QQ,Email,Address,Age,Birth,Sex,GroupName,ID from MyFriends,[Group],Users where Users.UserID = [Group].UserID and [Group].Tele = MyFriends.Tele and UserName = '"+a+"' and MyFriends.Tele like '%"+b+"%'order by Age";
    	   PreparedStatement pstmt = con.prepareStatement(sql);
    	   return pstmt.executeQuery();
       }
       public static ResultSet QueryMyFriendsDao2(Connection con) throws Exception{
    	   String a = Login.textField.getText();
    	   String b = ManagerView.QueryTextField.getText();
    	   String sql = "select Name,MyFriends.Tele,QQ,Email,Address,Age,Birth,Sex,GroupName,ID from MyFriends,[Group],Users where Users.UserID = [Group].UserID and [Group].Tele = MyFriends.Tele and UserName = '"+a+"' and GroupName like '%"+b+"%'order by Age";
    	   PreparedStatement pstmt = con.prepareStatement(sql);
    	   return pstmt.executeQuery();
       }
       
       public static int UpdateMyFriendsDao(Connection con,MyFriends myFriends,Group group)throws Exception{        
	        String a = MyFriends.getName();
	        String b = MyFriends.getAge();
	        String c = MyFriends.getTele();
	        String d = MyFriends.getSex();
	        String e = MyFriends.getAddress();
	        String f = MyFriends.getEmail();
	        String g = MyFriends.getBirth();
	        String h = MyFriends.getQQ();
	        String k = MyFriends.getID();
	        String i = ManagerView.GroupNameTextField.getText();
	        String j = User.getUserID();
    	    String sql = "exec update_pro '"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+k+"','"+i+"','"+j+"' ";
    	    PreparedStatement pstmt = con.prepareStatement(sql);
    	    return pstmt.executeUpdate();
       }
       
}


