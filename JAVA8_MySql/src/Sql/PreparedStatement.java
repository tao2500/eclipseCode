package Sql;
import java.sql.*;
public class PreparedStatement {
	public static void main (String[] args){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/library?user=root&password=2500594037&useSSL=true";
			Connection conn = DriverManager.getConnection(url);
			String insertSql = "INSERT INTO userdatails(name,author,publisher,price,imformation)VALUES(?,?,?,?,?)";
			java.sql.PreparedStatement pstmt = conn.prepareStatement(insertSql);
			pstmt.setString(1,"java8�߼�Ӧ���뿪��");
			pstmt.setString(2,"QST����ʵѵ");
			pstmt.setString(3,"�廪��ѧ������");
			pstmt.setDouble(4,59.5);
			pstmt.setString(5,"��");
			int resule = pstmt.executeUpdate();//ִ�����
			System.out.println("����"+resule+"�У�");
			pstmt.close();
			conn.close();
		}catch(ClassNotFoundException e){ 
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}

/*	String insertSql = "INSERT INTO book(name,author,publisher,price,imformation)VALUES(?,?,?,?,?)";
			java.sql.PreparedStatement pstmt = conn.prepareStatement(insertSql);
			i=0;
			while (i<name.length){
				pstmt.setString(1,name[i]);
				pstmt.setString(2,author[i]);
				pstmt.setString(3,publisher[i]);
				pstmt.setDouble(4,price[i]);
				pstmt.setString(5,imformation[i]);
				int resule = pstmt.executeUpdate();//ִ�����
				//System.out.println("����"+resule+"�У�");
				i++;
			}
			pstmt.close();
			conn.close();*/
