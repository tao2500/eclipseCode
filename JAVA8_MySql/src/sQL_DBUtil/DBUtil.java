package sQL_DBUtil;
import java.sql.*;
public class DBUtil {
	static ResultSet rs;
	
	public static void ShowData(String s){
		
		Connection con;
		// TODO 自动生成的方法存根
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/library?user=root&password=2500594037&useSSL=true";
		try {
			con = DriverManager.getConnection(url);
			Statement stmt=con.createStatement();
			rs=stmt.executeQuery(s);
			while(rs.next()){
				String s1=rs.getString(1);
				String s2=rs.getString(2);
				String s3=rs.getString(3);
				String s4=rs.getString(4);
				String s5=rs.getString(5);
				System.out.println("  "+s1+" "+s2+" "+s3+" "+s4+" "+s5);
			}
			con.close();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
	
	public static void UpDataSql(String s){
		
		Connection con;
		// TODO 自动生成的方法存根
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/library?user=root&password=2500594037&useSSL=true";
		try {
			con = DriverManager.getConnection(url);
			Statement stmt=con.createStatement();
			stmt.execute(s);
			System.out.println("执行成功！");
			con.close();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		ShowData("SELECT * FROM book;");
	
	

	}
}
