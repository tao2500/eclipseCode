package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class yuchuli_P338 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//����������
			String url="jdbc:mysql://localhost:3306/book?useSSL=false&serverTimezone=GMT%2B8&characterEncoding=UTF-8";
			Connection con;
			con = DriverManager.getConnection(url,"root","2500594037");
			//�������ݿ⣬��ȡConnection����
			System.out.println("���ݿ����ӳɹ���");
			String sql="SELECT *FROM ? where name=? ";//ʹ��ͨ���
			PreparedStatement stmt=con.prepareStatement(sql);//ȡPreparedStatement�������ڶ�SQL������Ԥ����
			stmt.setString(1, "biaodan");
			stmt.setString(2, "�������");
			System.out.print(sql);
			//stmt.executeUpdate();//�õײ���������p339
			
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}

	}

}
