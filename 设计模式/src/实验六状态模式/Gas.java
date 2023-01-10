package 实验六状态模式;

public class Gas extends Statc{
	int i;
	Gas(int i){
		this.i = i;
	}

	@Override
	public void now() {
		// TODO 自动生成的方法存根
		System.out.println("当前温度"+i+"当前为气体");
	}

}
