package intelligentExpressCabinet;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Courier {
	public Courier(){
		
	};
	public Courier(int[][] lattice){
		System.out.println("��ѡ����Ҫʹ�õĹ���");
		System.out.println("��1�����Ϳ��  ��2����ѯ���ʣ��״��  ��3���˳���¼  ��4����ѯ�����ȡ���  ��5��ȡ�����");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		switch (i){
			case 1:
				this.one(lattice);
				break;
			case 2:
				this.two(lattice);
				break;
			case 3:
				System.out.println("�ڴ������ٴ�ʹ�ã�");
				new ExpressCabinet();
				break;
			case 4:
				this.four(lattice);
				break;
			case 5:
				this.five(lattice);
				break;
			default:
				System.out.println("�����������������룡");
				new Courier(lattice);
		}
	}
	
	public void one(int[][] lattice){
		String name;
		String telephone;
		String entrytime;
		String pickupcode;
		String size="";
		LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        entrytime = localDateTime.format(dtf);
        pickupcode = this.GenerateCode();
        Boolean bool = new Dbutil().querySql(pickupcode);//��֤ȡ�����Ƿ��ظ�
        while(bool){
        	 pickupcode = this.GenerateCode();
        	 bool = new Dbutil().querySql(pickupcode);
        }
		System.out.print("��ѡ���ݸ��� ��1����� ��2���и� ��3��С��");
		Scanner sc = new Scanner(System.in);
		int siz = sc.nextInt();
		lattice = this.updata(lattice);
		if(siz == 1&&(lattice[0][0]-lattice[1][0])>0){
			size = "���";
		}else if(siz == 2&&(lattice[0][1]-lattice[1][1])>0){
			size = "�и�";
		}else if(siz == 3&&(lattice[0][2]-lattice[1][2])>0){
			size = "С��";
		}else{
			System.out.println("ȱ�ٵ�ǰ��ѡ���ӹ��������һ��ݹ�Ͷ�ݡ�");
			new Courier(lattice);
		}
		System.out.println("��¼������Ϣ");
		System.out.print("�ջ��ˣ�");
		name = sc.next();
		System.out.print("�ջ��˵绰��");
		telephone = sc.next();
		NoDe<String> no = new NoDe<String>(name,telephone,entrytime,pickupcode,size,null);
		new Write(no);
		System.out.println("�Ƿ�����ɼ��� ��1����  ����������");
		int operation = sc.nextInt();
		switch(operation){
		case 1:
			this.one(lattice);
			break;
		default:
			new Courier(lattice);
		}
	}
	
	public int[][] two(int[][] lattice){
		System.out.println("��ǰ��ݹ�ʹ��������£�");
		System.out.println("��ݹ���"+lattice[0][0]+"�����"+lattice[0][1]+"���и�"+lattice[0][2]+"��С��");
		lattice = new Read().Readlattice(lattice);
		System.out.println("����ʹ�ã�"+(lattice[0][0]-lattice[1][0])+"�����"+(lattice[0][1]-lattice[1][1])+" ���и�"+(lattice[0][2]-lattice[1][2])+"��С��");
		new Courier(lattice);
		return lattice;
	}
	
	public void four(int[][] lattice){
		int sign = 0;//�����������
		SinglyList sl = new SinglyList();
		NoDe[] retention = new NoDe[sl.size()]; //�����������
		NoDe<String> head = sl.head;
		LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        for(;head.getEntrytime()!=null;head = head.next){
        	 LocalDateTime dt = LocalDateTime.parse(head.getEntrytime(),dtf);
             Duration d = Duration.between(dt, localDateTime);//���ʱ��
             long time = d.toHours();
             if(time>=24){
            	 retention[sign] = head;
            	 if(sign == 0){
            		 System.out.println("���������Ϣ���£�");
            	 }
            	 System.out.println("�ջ��ˣ�"+head.getName()+",  ��ϵ�绰"+head.getTelephone()+",  ���ʱ��"+head.getEntrytime());
            	 sign+=1;
             }
//             System.out.println("���ʱ��"+d.toHours());
        }
        if(sign != 0){
        	System.out.println("��ѡ����Ҫ���еĲ���  ��1������Ͷ�������������   ��2��ȡ�������������    ������������" );
        	Scanner sc = new Scanner(System.in);
        	int i = sc.nextInt();
        	Delate dela = new Delate();
        	if(i == 1){
        		String time;
        		for(int ii = 0;ii<sign;ii++){
        			dela.delateOnTelephone(retention[ii]);
        			time = localDateTime.format(dtf);
        			retention[ii].setEntrytime(time);
        			new Write(retention[ii]);
        		}
        		System.out.println("���������Ͷ�ţ�");
        		new Courier(lattice);
        	}else if(i == 2){
        		for(int ii = 0;ii<sign;ii++){
        			dela.delateOnTelephone(retention[ii]);
        		}
        		System.out.println("����������������Ѵ򿪣�");
        		new Courier(lattice);
        	}else{
        		new Courier(lattice);
        	}
        }
        if(sign == 0){
        	System.out.println("δ��ѯ�����������");
        	new Courier(lattice);
        }
	}
	
	public void five(int [][] lattice){
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫȡ����ݵ��ֻ�����");
		String st = sc.next();
		Boolean b = this.verification(st);
		if(b){
			System.out.println("ȡ���ɹ���");
		}else{
			System.out.println("ȡ��ʧ�ܣ�δ��ѯ���ú������µĿ��");
		}
		System.out.println("�Ƿ����ȡ��  ��1����   ���������� ");
		int in = sc.nextInt();
		switch(in){
			case 1 :
				this.five(lattice);
				break;
			default:
				new Courier(lattice);
		}
	}
	
	public Boolean verification(String telephone){  //��֤����
		SinglyList<String> sl = new SinglyList<String>();
		int star = sl.size();
		new Delate().delateOnTelephone(new NoDe(null,telephone,null,null,null,null));
		sl = new SinglyList<String>();
		int end = sl.size();
		if(star == end){
			return false;
		}
		return true;
	}
	
	public String GenerateCode(){   //����ȡ����
		 Random r = new Random();
	        String str = "";
	        for(int ii = 0;ii<8;ii++){
	        	str+=r.nextInt(9);
	        }
	       return str;
	}
	
	
	public int[][] updata(int[][] lattice){  //���¿�ݹ�״̬
		lattice = new Read().Readlattice(lattice);
		return lattice;
	}
}
