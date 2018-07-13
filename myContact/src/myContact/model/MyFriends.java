package myContact.model;

public class MyFriends {
	private static String Name;
	private static String Age;
	private static String Tele;
	private static String Sex;
	private static String Address;
	private static String Email;
	private static String Birth;
	private static String QQ;
	private static String ID;
	public MyFriends(String name, String age, String tele, String sex, String address, String email, String birth,
			String qQ, String iD) {
		super();
		Name = name;
		Age = age;
		Tele = tele;
		Sex = sex;
		Address = address;
		Email = email;
		Birth = birth;
		QQ = qQ;
		ID = iD;
	}
    
	public MyFriends(String name, String age, String tele, String sex, String address, String email, String birth,
			String qQ) {
		super();
		Name = name;
		Age = age;
		Tele = tele;
		Sex = sex;
		Address = address;
		Email = email;
		Birth = birth;
		QQ = qQ;
	}
	public static String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public static String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public static String getTele() {
		return Tele;
	}
	public void setTele(String tele) {
		Tele = tele;
	}
	public static String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public static String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public static String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public static String getBirth() {
		return Birth;
	}
	public void setBirth(String birth) {
		Birth = birth;
	}
	public static String getQQ() {
		return QQ;
	}
	public void setQQ(String qQ) {
		QQ = qQ;
		
}
	public static String getID() {
		return ID;
	}
}
