package hanno;
import java.util.Stack;
public class HanNo {
//	模拟ABC三根柱子
	Stack<Integer> columnA = new Stack<>();
	Stack<Integer> columnB = new Stack<>();
	Stack<Integer> columnC = new Stack<>();
//	汉诺塔移动次数
	private int frequency = 0;
	public Stack<Integer> getcolumnC(){
		return this.columnC;
	}
	public HanNo(){
	}
	public int createHannNo(int num){
//		初始化A柱
		for(int i = num; i > 0; i--){
			this.columnA.push(i);
		}
//		调用汉诺算法
		this.Hanno(num,this.columnA,this.columnC);
		return this.frequency;
	}
//	参数num表示汉诺塔层数/start表示移动起点(A柱)/target表示移动目标(C柱)
	public void Hanno(int num,Stack<Integer> start,Stack<Integer> target){
//		获取可暂存盘子的中介柱
		Stack<Integer> middle = selectIntermediary(start,target);
////		除目标柱中有盘子外，其他柱子盘子都为空时，移动完成
//		if(columnA.empty()&&columnB.empty())return;
//		当柱子中无需要移动的盘子时，移动完成
		if(num == 0) return;
//		将A柱中的n-1个盘移动到中介柱
		Hanno(num-1,start,middle);
//		将A柱最底下一个盘移动至目标柱
		target.push(start.pop());
//		将中介柱中中盘子移动到目标柱
		Hanno(num-1,middle,target);
		this.frequency+=1;
		return;
	};
	
////	判断ABC柱中可用作转运中介的柱
//	private Stack<Integer> selectIntermediary(){
//		Stack<Integer> Intermediary = this.columnB;
//		if(this.columnA.empty()){
//			System.out.println("此时A柱为空"+this.columnA);
//			Intermediary = this.columnA;
//		}else if(this.columnB.empty()){
//			System.out.println("此时B柱为空"+this.columnB);
//			Intermediary = this.columnB;
//		}else if(this.columnC.empty()){
//			System.out.println("此时C柱为空"+this.columnC);
//			Intermediary = this.columnC;
//		}
//		return Intermediary;
//	}
	
//	判断ABC柱中可用作转运中介的柱
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
