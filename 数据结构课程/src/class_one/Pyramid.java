package class_one;

public class Pyramid {
	public static void structure(int i,int count){ //i��ʾҪ��ӡ������ count�����ӡ�ո���
		int in = i;
		if(in>0){
			if(in==1){
				System.out.print(in);
			}else{
				for(int ii = in-1; ii>0;ii-- ) System.out.print(" ");//��ӡ�ո�
				System.out.println("test");
				in = in-1;
				structure(in,0);
				System.out.print(in);
			}
			
			
		}
		else{
			System.out.println("��������");
		}
}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		structure(3,0);
	}

}
