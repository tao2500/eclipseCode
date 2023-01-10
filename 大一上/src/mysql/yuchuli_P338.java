package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class yuchuli_P338 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//加载驱动类
			String url="jdbc:mysql://localhost:3306/book?useSSL=false&serverTimezone=GMT%2B8&characterEncoding=UTF-8";
			Connection con;
			con = DriverManager.getConnection(url,"root","2500594037");
			//连接数据库，获取Connection对象
			System.out.println("数据库连接成功。");
			String sql="SELECT *FROM ? where name=? ";//使用通配符
			PreparedStatement stmt=con.prepareStatement(sql);//取PreparedStatement对象，用于对SQL语句进行预处理。
			stmt.setString(1, "biaodan");
			stmt.setString(2, "软件工程");
			System.out.print(sql);
			//stmt.executeUpdate();//让底层命令折行p339
			
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}

}
