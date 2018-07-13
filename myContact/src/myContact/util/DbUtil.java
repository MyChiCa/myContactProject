package myContact.util;

import java.sql.Connection;

import java.sql.SQLException;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import java.sql.DriverManager;

public class DbUtil {
	  static String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";

	  static String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=Contacts";

	  static String UserName="sa";

	  static String Password="jiayi19";
	  
public static Connection getCon() throws Exception {
	Class.forName(driverName);
	Connection con = DriverManager.getConnection(dbURL, UserName, Password);
	return con;
}

public void closeCon(Connection con) throws Exception{
	if(con!=null)
	con.close();
}



public static void main(String[] args){
	DbUtil dbUtil = new DbUtil();
	try{
		dbUtil.getCon();		
		System.out.println("数据库连接成功");
	}catch (Exception e){
		e.printStackTrace();
	}
}
}