package class_one;

public class ѭ�������� {
//	public static void structure(int i){ //i��ʾҪ��ӡ������
//		if(i>0){
//			if(i==1){
//				System.out.println(i);
//			}else{
//				i-=1;
//				structure(i);
//				System.out.print(i);
//			}
//			
//			
//		}
//	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		pyramid(3);   
	}
	public static void pyramid(int n){  //   n��
		int i;
		int num;
		for(i=1;i<n+1;i++){ 
			num=i;
			for(int j=0;j<n-i;j++)
				System.out.print(" ");  //������ո�
			if(num>1){         // �ڶ��п�ʼ ��ʱi=2
				for(int m=0;m<i;m++)
					num--;    //num ��2����0
				for( int m=0;m<i;m++){
					num++;     //һ������0 �ӵ�2 
					System.out.print(num);  //ִ��I��  ���12
				}     //��ʱnum=2
				for(int m=0;m<i-1;m++){ 
					--num;     //���������С
					System.out.print(num);
				}
			}
		else
			System.out.print(num);
		System.out.println();
		}
		}
	

}
