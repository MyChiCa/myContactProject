package myContact.model;

public class User{
         private  static String UserName;
         private  static String Password;
         private  static String UserID;
         
         
		 
         public User() {
			super();
			// TODO 自动生成的构造函数存根
		}

		public User(String userName, String password) {
			super();
			UserName = userName;
			Password = password;
		}

		public static String getUserName(){
        	 return UserName;
         }
         
         public void setUserName(String UserName){
        	 this.UserName = UserName;
         }
         
         public static String getPassword(){
        	 return Password;
         }
         
         public void setPassword(String Password){
        	 this.Password = Password;
         }
         
         public static String getUserID(){
        	 return UserID;
         }
         
         public void setUserID(String UserID){
        	 this.UserID = UserID;
         }
}
