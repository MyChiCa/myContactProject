package myContact.model;

public class Group {
         private static String UserID;
         private static String Tele;
         private static String GroupName;
         
		
		public Group(String tele2, String groupName2) {
			Tele = tele2;
			GroupName = groupName2;
		}
		public static String getUserID() {
			return UserID;
		}
		public void setUserID(String userID) {
			UserID = userID;
		}
		public static String getTele() {
			return Tele;
		}
		public void setTele(String tele) {
			Tele = tele;
		}
		public static String getGroupName() {
			return GroupName;
		}
		public void setGroupName(String groupName) {
			GroupName = groupName;
		}        
}
