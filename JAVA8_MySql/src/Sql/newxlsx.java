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
	static String name[]=new String[20];     //存储数据库中获得的数据
	static String author[]=new String[20];
	static String publisher[]=new String[20];
	static double price[]=new double[20];
	static String imformation[]=new String[20];
	static int frequency=0;
	public static void main(String[] args) throws IOException {//这里将异常上抛方便阅读和理解
		Workbook wb;// 工作簿对象
		org.apache.poi.ss.usermodel.Sheet sheet;// 工作表对象
		org.apache.poi.ss.usermodel.Row  row;// 行对象

		System.out.println("请选择你要进行的操作！");
		System.out.println("“1”表示将数据库的内容同步到xlsx表格");
		System.out.println("“0”表示将xlsx的内容同步到数据库");
		Scanner input =new Scanner(System.in);
		int inpu=input.nextInt();
		if(inpu==0){
			InputStream is = new FileInputStream("D:\\Javacopytese\\课本信息.xlsx");
			wb = new HSSFWorkbook(is);
			//读取表头
			
			if(wb == null){
				try {
					throw new Exception("工作簿对象为空");
				} catch (Exception e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
				sheet = wb.getSheetAt(0); // 读取第一张（索引为零）表格
				row = sheet.getRow(0);// 获取第一张表格的第一行
				// 获取标题总列数
				int colNum = row.getPhysicalNumberOfCells();
				System.out.println("colNum:" + colNum);
				
				// 将表头字段装进数组
				// 得到总行数
				int rowNum = sheet.getLastRowNum()+1;
				String[][] title = new String[rowNum][colNum];// 以列数作为数组元素个数创建数组
				int ii=0;
				int a=0;
				while(rowNum!=0){   //将xlsx表单数据导出到数组；
					//System.out.println(colNum);
					for (int i = 0; i < colNum; i++) {
						 //title[i] = getStringCellValue(row.getCell((short) i));
						//System.out.println("a,i:"+a + i);
						//if(i==3) title[a][i] = row.getCell(i).toString();//text[a][]存储表中第a行的数据
						title[a][i] = row.getCell(i).toString();//text[a][]存储表中第a行的数据
						//System.out.println("a,b="+a+","+i+",,,,"+title[a][i]);
					}
					a+=1;
					++ii;
					row = sheet.getRow(ii);
					rowNum--;
				}
				rowNum = sheet.getLastRowNum()+1;
				try {//链接数据库 将数组中的数据写入
					Class.forName("com.mysql.cj.jdbc.Driver");
					String url="jdbc:mysql://localhost:3306/library?user=root&password=2500594037&useSSL=true";
					Connection conn = DriverManager.getConnection(url);
					//conn.prepareStatement("use library;");
					//conn.prepareStatement("drop table if exists book;");
					String insertSql = "INSERT INTO book(name,author,publisher,price,imformation)VALUES(?,?,?,?,?)";
					String delete = "delete from book where price='59.5'";
					java.sql.PreparedStatement pstmt = conn.prepareStatement(insertSql);
					java.sql.PreparedStatement ps = conn.prepareStatement(delete);
					ps.executeUpdate();//执行删除语句
					System.out.println("清除原数据成功！");
//					pstmt.setString(1, title[0][0]);//初始化表头值
//					pstmt.setString(2, title[0][1]);
//					pstmt.setString(3, title[0][2]);
//					pstmt.setFloat(4,  title[0][3]));
//					pstmt.setString(5, title[0][4]);
					a=1;
					int resu=0;
//					resu = pstmt.executeUpdate();//执行语句
					int i=0;
					int resule=0;
					for(;a<rowNum;a++){
						i=0;
						for(;i<colNum;i++){   //写入insertsql语句中
							pstmt.setString(i+1,title[a][i]);
							System.out.print("a,b="+a+","+i+",,,,"+title[a][i]);
						}
						//if(a==1)pstmt.setFloat(4, Float.parseFloat(title[a][3]));
					//pstmt.setFloat(4, Float.parseFloat(title[a][3]));;
					resu = pstmt.executeUpdate();//执行语句
					resule = resule+resu;
					System.out.println("resule:" + resule);
					System.out.println("插入"+resule+"行！");
					}
					pstmt.close();
					conn.close();
				} catch (ClassNotFoundException e) {
					// TODO 自动生成的 catch 块
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
				ResultSet rs = ps.executeQuery();//执行查询语句
				int i=0;
				while (rs.next()){ //遍历并保存查询结果
					name[i]=rs.getString("name");
					author[i]=rs.getString("author");
					publisher[i]=rs.getString("publisher");
					price[i]=Double.parseDouble(rs.getString("price"));
					imformation[i]=rs.getString("imformation");
					i++;
					frequency++;
				}
				
				/**              创建表头数据
				 * 多态实现
				 * HSSFWorkbook  是对于xls进行操作
				 */
				wb=new HSSFWorkbook();//新建一个工作簿
				/**
				 * 导出所以用到输出流
			      *参数为输出的地址
				 */
				FileOutputStream fout=new FileOutputStream("D:\\Javacopytese\\课本信息.xlsx");
				sheet = wb.createSheet("图书信息表");//创建一个sheet页
				row = sheet.createRow(0); // 创建一个行 第一行
				Cell cell=row.createCell(0); // 创建一个单元格  第1列
				/**
				 * 给单元格设置值
				 *值类型可以为int  double  String boolean  
				 *还有Date等
				 */
				cell.setCellValue("name");
				row.createCell(1).setCellValue("author");//创建第一行第二个单元格
				row.createCell(2).setCellValue("publisher");//创建第一行第三个单元格
				row.createCell(3).setCellValue("price");//创建第一行第四个单元格
				/**
				 * HSSFCell一些静态常量
				 * short类型和int类型
				 */
				//row.createCell(4).setCellValue(HSSFCell.ENCODING_COMPRESSED_UNICODE);
				row.createCell(4).setCellValue("imformation");
				//wb.write(fout);//Workbook提供了write的方法
				
				/**
				 * 第二个行  每一行需要一个行对象
				 * 所以需要保存一个行对象
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
				wb.write(fout);//Workbook提供了write的方法
				System.out.println("SQL数据导入xlsx文件成功！");
				fout.flush();
				fout.close();//将输出流关闭
				
			}catch(ClassNotFoundException e){ 
				e.printStackTrace();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		else{
			System.out.println("输入有误，请重新输入");	
		}
		}
	}
		
		
		
			
			//https://blog.csdn.net/yjt520557/article/details/82763785?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522163281854216780357255945%2522%252C%2522scm%2522%253A%252220140713.130102334.pc%255Fall.%2522%257D&request_id=163281854216780357255945&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~first_rank_ecpm_v1~rank_v31_ecpm-1-82763785.pc_search_result_cache&utm_term=java+poi&spm=1018.2226.3001.4187