package keben;
import java.util.Random;
import java.util.Scanner;
public class L {
	public static void main(String[] args) {
		System.out.println("������һ���������س���ȷ��");
		Scanner a=new Scanner(System.in);
		int b=a.nextInt();
		Random s=new Random();
		int [][]c=new int[b][b];
		int d,e,j,k;
		for(d=0;d<c.length;d++){
			for(e=0;e<c[0].length;e++){
				c[d][e]=s.nextInt(20); ;
				continue;
			}
		}
		for(d=0;d<c.length;d++){
			System.out.println();
			for(e=0;e<c[0].length;e++){
				System.out.print(c[d][e]+"     ");
			}
		}
		System.out.println();
		System.out.println("�þ����ת�þ���Ϊ:");
		for(j=0;j<c.length;j++){
			System.out.println();
			for(k=0;k<c[0].length;k++){
				System.out.print(c[k][j]+"     ");
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("                               �������Ϊ�ڶ�С��");
		int [][]cc=new int[b][b];
		int n,m;
		for(n=0;n<c.length;n++){
			for(m=0;m<c.length;m++){
				cc[n][m]=s.nextInt(10); ;
				continue;
			}
		}
		for(n=0;n<cc.length;n++){
			System.out.println();
			for(m=0;m<c.length;m++){
				System.out.print(cc[n][m]+"     ");
			}
		}
		System.out.println();
		System.out.println("������'1'�������������ĺͣ���'2'�������������Ĳ���ûس���ȷ��");
		//System.out.println("���Ϊ��");
		int o=a.nextInt(),p,q;
		if(o==1){
			System.out.println("��������ĺ�Ϊ��");
			for(d=0,q=0;d<c.length&&q<cc.length;d++,q++){
				System.out.println();
				for(e=0,p=0;e<c.length&&p<cc.length;e++,p++){
					System.out.print(c[d][e]+cc[q][p]+"    ");
				}
			}
		}
		else if(o==2){
			System.out.println("��������Ĳ�Ϊ��");
			for(d=0,q=0;d<c.length&&q<cc.length;d++,q++){
				System.out.println();
				for(e=0,p=0;e<c.length&&p<cc.length;e++,p++){
					System.out.print(c[d][e]-cc[q][p]+"    ");
				}
			}
		}
		else System.out.println("�������,���������У�");
	}
}
