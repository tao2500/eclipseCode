package ����n�ʺ�;
import java.util.*;

public class Queen {
//	ÿ��������ܵĽ�ľ��巽��solution[2]=1����ʾ���ڶ�λ�ʺ���ڵ�һ��
	private int[] solution = null;
//	���������
	private int solutionNum = 0;
//	����ʱ��
	private double time = 0;
//	���Խ������
	private int count = 0;
//	�����ģ
	private int n;
	
	Queen(int n){
		this.solution = new int[n + 1];
		this.n = n;
		time = System.currentTimeMillis();

//		��ʼ�ڷŻʺ�,λ�ô�1��ʼ
		solution(1);
		
		time = System.currentTimeMillis() - time;
		System.out.println("�����"+solutionNum+"���");
		if(this.n > 11){
			System.out.println();
			System.out.println("��������ʱ:"+time+"����");
			System.out.println("������������"+count);
		}
	}
	// �ڷŵ�n���ʺ�
	private void solution(int n){
		if(n > this.n)
			return;
//		���Խ���n���ʺ���ڵ�i��
		for(int i = 1; i <= this.n; i++){
			// ���Խ������+1
			count += 1;
			this.solution[n] = i;
//			���ڷŵ�n���ʺ�Ϸ�ʱ
			if(check(n)){
//				System.out.println("��"+n+"���ʺ�ڷųɹ���λ����"+this.solution[n]);
				// �����ĸ��ʺ��Ѱڷţ��ҵ�һ��⣩
				if(n == this.n){
					this.solutionNum += 1;
					if(this.n <= 5){
						System.out.print("�����ĵ�"+this.solutionNum+"���Ϊ��");
						for(int ii = 1; ii <= this.n; ii++){
							System.out.print(this.solution[ii]);
						}
						System.out.println();
					}
					continue;
				}
//				��ʼ�ڷ���һ���ʺ�n+1
				n += 1;
//				System.out.println("��ʼ�ڷŵ�"+n+"���ʺ�");
				solution(n);
				// ���ݵ���һ���ʺ�n-1
				n -= 1;
				// ���ûʺ�ڷŵ���һ��
//				System.out.println("���°ڷŵ�"+n+"���ʺ�λ�ã�����ڵ���="+(i+1)+"��");
			}else{
//				System.out.println("��"+n+"���ʺ��ܰ��ڵ�"+i+"λ");
				continue;
			}
		}
	}
	// ����h���ʺ��λ���Ƿ�Ϸ�
	private boolean check(int h){
		int i;
		for(i = 1; i < h; i++){
			// �ʺ�h��λ����ͬһ�л�ͬһб��ʱ
			if(this.solution[i] == this.solution[h] || Math.abs(i - h) == Math.abs(this.solution[i] - this.solution[h])){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc = new Scanner(System.in);
		System.out.println("������N�ʺ�����Ĺ�ģ");
		int input = sc.nextInt();
		new Queen(input);
	}
}