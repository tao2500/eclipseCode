package intelligentExpressCabinet;
import java.sql.*;
public class Dbutil {
	static ResultSet rs;
	
	public Statement link(){
		Connection con;
		// TODO �Զ����ɵķ������
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/kuaidigui?user=root&password=2500594037&useSSL=true";
		try {
			con = DriverManager.getConnection(url);
			Statement stmt=con.createStatement();
			return stmt;
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	
	public static int lookupOnPickUpCode(String PickUpCode){//��ѯδȡ���
		int taken = 0;//δȡ�������
		try {
			Dbutil db = new Dbutil();
			Statement stmt = db.link();
			String sql1 = "SELECT Telephone FROM no1 where PickUpCode = "+PickUpCode;
			String telephone = null;
			rs = stmt.executeQuery(sql1);
			if(rs.next()){
				telephone = rs.getString(1);
			}
			String sql2 = "SELECT * FROM no1 where Telephone = "+telephone;
			rs = stmt.executeQuery(sql2);
			while(rs.next()){
				taken+=1;
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		return taken;
	}
	
	public static void UpDataSql(String s){
		try {
			Dbutil db = new Dbutil();
			Statement stmt = db.link();
			stmt.execute(s);
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	
	public static Boolean querySql(String PickUpCode){//��ѯ����ȡ�����Ƿ��ظ�
		try {
			Dbutil db = new Dbutil();
			Statement stmt = db.link();
			String s = "SELECT * FROM no1 where PickUpCode = "+PickUpCode;
			ResultSet b = stmt.executeQuery(s);
			if(b.next()&&b.getString(1)!=null){
				return true;
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		return false;
	}
	
public static NoDe exportData(){//��ȡ���������ͷָ��
		NoDe head = new NoDe();
		NoDe index = head;
		try {
			Dbutil db = new Dbutil();
			Statement stmt = db.link();
			rs=stmt.executeQuery("SELECT * FROM no1;");
			while(rs.next()){
				NoDe nd = new NoDe();
				nd.setName(rs.getString(1));
				nd.setTelephone(rs.getString(2));
				nd.setEntrytime(rs.getString(3));
				nd.setPickupcode(rs.getString(4));
				nd.setSize(rs.getString(5));
				nd.next = new NoDe();
				index.next = nd;
				index = nd;
				
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		return head;
	}
	
	public void clear(){  //������б�������
		Dbutil db = new Dbutil();
		String s = "DELETE FROM 'kuaidigui'.'no1'";
		db.UpDataSql(s);
		}
	
	public void delateOnPickUpCode(NoDe n){
		Dbutil db = new Dbutil();
		String s = "DELETE FROM no1 where PickUpCode = "+n.getPickupcode();
		db.UpDataSql(s);
	}
	
	public void delateOnTelephone(NoDe n){
		Dbutil db = new Dbutil();
		String s = "DELETE FROM no1 where Telephone = "+n.getTelephone();
		db.UpDataSql(s);
	}
	
	public void add(NoDe n){
		Dbutil db = new Dbutil();
		String str = "INSERT INTO no1 (`name`, `Telephone`, `EntryTime`, `PickUpCode`, `size`) VALUES ('"+n.getName()+"', '"+n.getTelephone()+"', '"+n.getEntrytime()+"', '"+n.getPickupcode()+"', '"+n.getSize()+"');";
		db.UpDataSql(str);
	}
}
