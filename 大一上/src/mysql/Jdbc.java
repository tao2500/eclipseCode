package mysql;
import java.sql.*;

public class Jdbc {

	public static void main(String[] args) {
		/*MySQL(http://www.mysql.com) mysql-connector-java-2.0.14-bin.jar ;
			  Class.forName( "org.gjt.mm.mysql.Driver" );
			  cn = DriverManager.getConnection( "jdbc:mysql://MyDbComputerNameOrIP:3306/myDatabaseName", sUsr, sPwd );
			*/
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//加载驱动类
			String url="jdbc:mysql://localhost:3306/book?useSSL=false&serverTimezone=GMT%2B8&characterEncoding=UTF-8";
			Connection con;
			con = DriverManager.getConnection(url,"root","2500594037");
			//连接数据库，获取Connection对象
			System.out.println("数据库连接成功。");
			Statement stmt=con.createStatement();//获取Statement对象，用于执行SQL语句
			Statement cha=con.createStatement();//创建sql语句对象；
			ResultSet rs=cha.executeQuery("SELECT * FROM biaodan ");
			System.out.println(rs==null);
			//rs.next();//查询下一个数据行。第一行为表单名，故应先执行next，否则报开始结果集之前.
			while(rs.next()){
				String s1=rs.getString(1);//数字代表一行中的第几个数据。
				String s2=rs.getString(2);
				String s3=rs.getString(3);
				String s4=rs.getString(4);
				System.out.println("运行成功。"+s1+" "+s2+" "+s3+" "+s4);//p332顺序查询	
			}
			ResultSet rss;
			rss=stmt.executeQuery("SELECT *FROM biaodan");//执行查询语句、null中输入sql语句
			rss.next();
			String ss=rss.getString("id");
			System.out.println("运行完毕。"+" "+ss);
			//stmt.executeLargeUpdate("inset into biaodan (id,name,author,public) values('a12345678912','java2实用教程','耿祥义','清华大学出版社')");//用sql实现增删改。
			System.out.println("添加数据成功。");
			con.close();	
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}


	}

}
