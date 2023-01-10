 package Service;
import java.awt.*;
import javax.swing.*;

public class Test extends JFrame {
	JPanel jp1,jp2,jp3,jp4;
	JLabel jl1,jl2,jl3,jl4;
	JTextField wen1;
	JPasswordField pass;
	JComboBox xiala;
	JButton anniu;
	JRadioButton xuan1,xuan2;
	ButtonGroup group;
	public Test(){
		init();
		setVisible(true);
		setSize(1500, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void init(){
		Container container=this.getContentPane();
		container.setLayout(new GridLayout(4,1));
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		jp4=new JPanel();
		wen1=new JTextField(15);
		pass=new JPasswordField(15);
		jl1=new JLabel("请输入用户名：");
		jl2=new JLabel("请输入用户密码：");
		jl3=new JLabel("请选择性别");
		jl4=new JLabel("请选择登陆身份");
		anniu=new JButton("提交");
		xuan1=new JRadioButton("男");
		xuan2=new JRadioButton("女");
		xiala=new JComboBox();
		xiala.addItem("学生");
		xiala.addItem("教师");
		xiala.addItem("管理员");
		group=new ButtonGroup();
		group.add(xuan1);
		group.add(xuan2);
		jp1.add(jl1);
		jp1.add(wen1);
		container.add(jp1);
		jp2.add(jl2);
		jp2.add(pass);
		container.add(jp2);
		jp3.add(jl3);
		jp3.add(xuan1);
		jp3.add(xuan2);
		jp3.add(jl4);
		jp3.add(xiala);
		container.add(jp3);
		jp4.add(anniu);
		container.add(jp4);
	}
	public static void main(String[] args) {
		new Test();
		

	}

}
	
 