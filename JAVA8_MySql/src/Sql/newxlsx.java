package Sql;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;

import com.mysql.cj.result.Row;

public class newxlsx {
	static String name[]=new String[20];     //�洢���ݿ��л�õ�����
	static String author[]=new String[20];
	static String publisher[]=new String[20];
	static double price[]=new double[20];
	static String imformation[]=new String[20];
	static int frequency=0;
	public static void main(String[] args) throws IOException {//���ｫ�쳣���׷����Ķ������
		Workbook wb;// ����������
		org.apache.poi.ss.usermodel.Sheet sheet;// ���������
		org.apache.poi.ss.usermodel.Row  row;// �ж���

		System.out.println("��ѡ����Ҫ���еĲ�����");
		System.out.println("��1����ʾ�����ݿ������ͬ����xlsx���");
		System.out.println("��0����ʾ��xlsx������ͬ�������ݿ�");
		Scanner input =new Scanner(System.in);
		int inpu=input.nextInt();
		if(inpu==0){
			InputStream is = new FileInputStream("D:\\Javacopytese\\�α���Ϣ.xlsx");
			wb = new HSSFWorkbook(is);
			//��ȡ��ͷ
			
			if(wb == null){
				try {
					throw new Exception("����������Ϊ��");
				} catch (Exception e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
				sheet = wb.getSheetAt(0); // ��ȡ��һ�ţ�����Ϊ�㣩���
				row = sheet.getRow(0);// ��ȡ��һ�ű��ĵ�һ��
				// ��ȡ����������
				int colNum = row.getPhysicalNumberOfCells();
				System.out.println("colNum:" + colNum);
				
				// ����ͷ�ֶ�װ������
				// �õ�������
				int rowNum = sheet.getLastRowNum()+1;
				String[][] title = new String[rowNum][colNum];// ��������Ϊ����Ԫ�ظ�����������
				int ii=0;
				int a=0;
				while(rowNum!=0){   //��xlsx�����ݵ��������飻
					//System.out.println(colNum);
					for (int i = 0; i < colNum; i++) {
						 //title[i] = getStringCellValue(row.getCell((short) i));
						//System.out.println("a,i:"+a + i);
						//if(i==3) title[a][i] = row.getCell(i).toString();//text[a][]�洢���е�a�е�����
						title[a][i] = row.getCell(i).toString();//text[a][]�洢���е�a�е�����
						//System.out.println("a,b="+a+","+i+",,,,"+title[a][i]);
					}
					a+=1;
					++ii;
					row = sheet.getRow(ii);
					rowNum--;
				}
				rowNum = sheet.getLastRowNum()+1;
				try {//�������ݿ� �������е�����д��
					Class.forName("com.mysql.cj.jdbc.Driver");
					String url="jdbc:mysql://localhost:3306/library?user=root&password=2500594037&useSSL=true";
					Connection conn = DriverManager.getConnection(url);
					//conn.prepareStatement("use library;");
					//conn.prepareStatement("drop table if exists book;");
					String insertSql = "INSERT INTO book(name,author,publisher,price,imformation)VALUES(?,?,?,?,?)";
					String delete = "delete from book where price='59.5'";
					java.sql.PreparedStatement pstmt = conn.prepareStatement(insertSql);
					java.sql.PreparedStatement ps = conn.prepareStatement(delete);
					ps.executeUpdate();//ִ��ɾ�����
					System.out.println("���ԭ���ݳɹ���");
//					pstmt.setString(1, title[0][0]);//��ʼ����ͷֵ
//					pstmt.setString(2, title[0][1]);
//					pstmt.setString(3, title[0][2]);
//					pstmt.setFloat(4,  title[0][3]));
//					pstmt.setString(5, title[0][4]);
					a=1;
					int resu=0;
//					resu = pstmt.executeUpdate();//ִ�����
					int i=0;
					int resule=0;
					for(;a<rowNum;a++){
						i=0;
						for(;i<colNum;i++){   //д��insertsql�����
							pstmt.setString(i+1,title[a][i]);
							System.out.print("a,b="+a+","+i+",,,,"+title[a][i]);
						}
						//if(a==1)pstmt.setFloat(4, Float.parseFloat(title[a][3]));
					//pstmt.setFloat(4, Float.parseFloat(title[a][3]));;
					resu = pstmt.executeUpdate();//ִ�����
					resule = resule+resu;
					System.out.println("resule:" + resule);
					System.out.println("����"+resule+"�У�");
					}
					pstmt.close();
					conn.close();
				} catch (ClassNotFoundException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}catch(SQLException e){
					e.printStackTrace();
				}
				
		}
		
		else if(inpu==1){
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/library?user=root&password=2500594037&useSSL=true";
				Connection conn = DriverManager.getConnection(url);
				String selectSql = "SELECT * FROM book";
				conn.prepareStatement("use library");
				java.sql.PreparedStatement ps = conn.prepareStatement(selectSql);
				ResultSet rs = ps.executeQuery();//ִ�в�ѯ���
				int i=0;
				while (rs.next()){ //�����������ѯ���
					name[i]=rs.getString("name");
					author[i]=rs.getString("author");
					publisher[i]=rs.getString("publisher");
					price[i]=Double.parseDouble(rs.getString("price"));
					imformation[i]=rs.getString("imformation");
					i++;
					frequency++;
				}
				
				/**              ������ͷ����
				 * ��̬ʵ��
				 * HSSFWorkbook  �Ƕ���xls���в���
				 */
				wb=new HSSFWorkbook();//�½�һ��������
				/**
				 * ���������õ������
			      *����Ϊ����ĵ�ַ
				 */
				FileOutputStream fout=new FileOutputStream("D:\\Javacopytese\\�α���Ϣ.xlsx");
				sheet = wb.createSheet("ͼ����Ϣ��");//����һ��sheetҳ
				row = sheet.createRow(0); // ����һ���� ��һ��
				Cell cell=row.createCell(0); // ����һ����Ԫ��  ��1��
				/**
				 * ����Ԫ������ֵ
				 *ֵ���Ϳ���Ϊint  double  String boolean  
				 *����Date��
				 */
				cell.setCellValue("name");
				row.createCell(1).setCellValue("author");//������һ�еڶ�����Ԫ��
				row.createCell(2).setCellValue("publisher");//������һ�е�������Ԫ��
				row.createCell(3).setCellValue("price");//������һ�е��ĸ���Ԫ��
				/**
				 * HSSFCellһЩ��̬����
				 * short���ͺ�int����
				 */
				//row.createCell(4).setCellValue(HSSFCell.ENCODING_COMPRESSED_UNICODE);
				row.createCell(4).setCellValue("imformation");
				//wb.write(fout);//Workbook�ṩ��write�ķ���
				
				/**
				 * �ڶ�����  ÿһ����Ҫһ���ж���
				 * ������Ҫ����һ���ж���
				 */
				i=0;
				while (i<frequency){
					org.apache.poi.ss.usermodel.Row row1 = sheet.createRow(i+1);
					row1.createCell(0).setCellValue(name[i]);
					row1.createCell(1).setCellValue(author[i]);
					row1.createCell(2).setCellValue(publisher[i]);
					row1.createCell(3).setCellValue(price[i]);
					row1.createCell(4).setCellValue(imformation[i]);
					i++;
				}
				wb.write(fout);//Workbook�ṩ��write�ķ���
				System.out.println("SQL���ݵ���xlsx�ļ��ɹ���");
				fout.flush();
				fout.close();//��������ر�
				
			}catch(ClassNotFoundException e){ 
				e.printStackTrace();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		else{
			System.out.println("������������������");	
		}
		}
	}
		
		
		
			
			//https://blog.csdn.net/yjt520557/article/details/82763785?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522163281854216780357255945%2522%252C%2522scm%2522%253A%252220140713.130102334.pc%255Fall.%2522%257D&request_id=163281854216780357255945&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~first_rank_ecpm_v1~rank_v31_ecpm-1-82763785.pc_search_result_cache&utm_term=java+poi&spm=1018.2226.3001.4187