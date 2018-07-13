package Contact.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class GroupDao {
       public static ResultSet GroupList(Connection con) throws Exception{
    	   String sql = "select * from Group ";
    	   PreparedStatement pstmt = con.prepareStatement(sql);
    	   return pstmt.executeQuery();
}
}
