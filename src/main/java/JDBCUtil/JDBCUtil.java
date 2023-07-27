package JDBCUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUtil {
	
	public static Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection
				("jdbc:oracle:thin:@//localhost:1521/orcl","system","1234");
		return conn;
				
}

public static void close(PreparedStatement stmt, Connection conn) {
	// TODO Auto-generated method stub
	
}

public static void close(PreparedStatement stmt, Connection conn, ResultSet rs) {
	// TODO Auto-generated method stub
	
}

}


