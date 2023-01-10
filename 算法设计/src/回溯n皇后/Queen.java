package 回溯n皇后;
import java.util.*;

public class Queen {
//	每种问题可能的解的具体方案solution[2]=1，表示将第二位皇后放在第一列
	private int[] solution = null;
//	解决方案数
	private int solutionNum = 0;
//	解题时间
	private double time = 0;
//	尝试解题次数
	private int count = 0;
//	问题规模
	private int n;
	
	Queen(int n){
		this.solution = new int[n + 1];
		this.n = n;
		time = System.currentTimeMillis();

//		开始摆放皇后,位置从1开始
		solution(1);
		
		time = System.currentTimeMillis() - time;
		System.out.println("共求得"+solutionNum+"组解");
		if(this.n > 11){
			System.out.println();
			System.out.println("计算总用时:"+time+"毫秒");
			System.out.println("总搜索次数："+count);
		}
	}
	// 摆放第n个皇后
	private void solution(int n){
		if(n > this.n)
			return;
//		尝试将第n个皇后放在第i列
		for(int i = 1; i <= this.n; i++){
			// 尝试解题次数+1
			count += 1;
			this.solution[n] = i;
//			当摆放第n个皇后合法时
			if(check(n)){
//				System.out.println("第"+n+"个皇后摆放成功，位置在"+this.solution[n]);
				// 当第四个皇后已摆放（找到一组解）
				if(n == this.n){
					this.solutionNum += 1;
					if(this.n <= 5){
						System.out.print("方案的第"+this.solutionNum+"组解为：");
						for(int ii = 1; ii <= this.n; ii++){
							System.out.print(this.solution[ii]);
						}
						System.out.println();
					}
					continue;
				}
//				开始摆放下一个皇后n+1
				n += 1;
//				System.out.println("开始摆放第"+n+"个皇后");
				solution(n);
				// 回溯到上一个皇后n-1
				n -= 1;
				// 将该皇后摆放到下一列
//				System.out.println("重新摆放第"+n+"个皇后位置，将其摆到第="+(i+1)+"列");
			}else{
//				System.out.println("第"+n+"个皇后不能摆在第"+i+"位");
				continue;
			}
		}
	}
	// 检查第h个皇后的位置是否合法
	private boolean check(int h){
		int i;
		for(i = 1; i < h; i++){
			// 皇后h的位置在同一列或同一斜线时
			if(this.solution[i] == this.solution[h] || Math.abs(i - h) == Math.abs(this.solution[i] - this.solution[h])){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入N皇后问题的规模");
		int input = sc.nextInt();
		new Queen(input);
	}
}