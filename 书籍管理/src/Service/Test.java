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
		jl1=new JLabel("�������û�����");
		jl2=new JLabel("�������û����룺");
		jl3=new JLabel("��ѡ���Ա�");
		jl4=new JLabel("��ѡ���½���");
		anniu=new JButton("�ύ");
		xuan1=new JRadioButton("��");
		xuan2=new JRadioButton("Ů");
		xiala=new JComboBox();
		xiala.addItem("ѧ��");
		xiala.addItem("��ʦ");
		xiala.addItem("����Ա");
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
	
 