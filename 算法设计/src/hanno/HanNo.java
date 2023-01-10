package hanno;
import java.util.Stack;
public class HanNo {
//	ģ��ABC��������
	Stack<Integer> columnA = new Stack<>();
	Stack<Integer> columnB = new Stack<>();
	Stack<Integer> columnC = new Stack<>();
//	��ŵ���ƶ�����
	private int frequency = 0;
	public Stack<Integer> getcolumnC(){
		return this.columnC;
	}
	public HanNo(){
	}
	public int createHannNo(int num){
//		��ʼ��A��
		for(int i = num; i > 0; i--){
			this.columnA.push(i);
		}
//		���ú�ŵ�㷨
		this.Hanno(num,this.columnA,this.columnC);
		return this.frequency;
	}
//	����num��ʾ��ŵ������/start��ʾ�ƶ����(A��)/target��ʾ�ƶ�Ŀ��(C��)
	public void Hanno(int num,Stack<Integer> start,Stack<Integer> target){
//		��ȡ���ݴ����ӵ��н���
		Stack<Integer> middle = selectIntermediary(start,target);
////		��Ŀ�������������⣬�����������Ӷ�Ϊ��ʱ���ƶ����
//		if(columnA.empty()&&columnB.empty())return;
//		������������Ҫ�ƶ�������ʱ���ƶ����
		if(num == 0) return;
//		��A���е�n-1�����ƶ����н���
		Hanno(num-1,start,middle);
//		��A�������һ�����ƶ���Ŀ����
		target.push(start.pop());
//		���н������������ƶ���Ŀ����
		Hanno(num-1,middle,target);
		this.frequency+=1;
		return;
	};
	
////	�ж�ABC���п�����ת���н����
//	private Stack<Integer> selectIntermediary(){
//		Stack<Integer> Intermediary = this.columnB;
//		if(this.columnA.empty()){
//			System.out.println("��ʱA��Ϊ��"+this.columnA);
//			Intermediary = this.columnA;
//		}else if(this.columnB.empty()){
//			System.out.println("��ʱB��Ϊ��"+this.columnB);
//			Intermediary = this.columnB;
//		}else if(this.columnC.empty()){
//			System.out.println("��ʱC��Ϊ��"+this.columnC);
//			Intermediary = this.columnC;
//		}
//		return Intermediary;
//	}
	
//	�ж�ABC���п�����ת���н����
	private Stack<Integer> selectIntermediary(Stack<Integer> start,Stack<Integer> target){
		Stack<Integer> Intermediary = this.columnB;
		if((start == this.columnA || target == this.columnA) && (start == this.columnB || target == this.columnB)){
			Intermediary = this.columnC;
		}else if((start == this.columnC || target == this.columnC) && (start == this.columnB || target == this.columnB)){
			Intermediary = this.columnA;
		}else if((start == this.columnA || target == this.columnA) && (start == this.columnC || target == this.columnC)){
			Intermediary = this.columnB;
		}
		return Intermediary;
	}

}
