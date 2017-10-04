package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	static String driver = "com.mysql.jdbc.Driver";
    //URL指向要访问的数据库名test
	static String url = "jdbc:mysql://localhost:3306/test";
    //MySQL配置时的用户名
	static String user = "root";
    //MySQL配置时的密码
	static String password = "root";
	
	public static Connection getConnection() throws Exception{
		Class.forName(driver);
		Connection conn  = DriverManager.getConnection(url, user, password);
		return conn;
	}
}
