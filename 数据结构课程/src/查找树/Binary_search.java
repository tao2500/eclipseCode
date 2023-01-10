package 查找树;

public class Binary_search {
	public int srarch(int[] in,int key){
		int star = 0;
		int and = in.length;
		int search=star+and/2;
//		System.out.println(star+"//"+and+"//"+search+"//"+in[search]+"//"+key);
		for(;star<=and;){
			search=(star+and)/2;
//			System.out.println(star+"//"+and+"//"+search+"//"+in[search]+"//"+key);
			if(in[search]==key){
				return search;
			}else if(key<in[search]){
				and = search - 1;
			}else if(key>in[search]){
				star = search + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] in = {0,1,2,3,4,5,6,7,8,9};
		System.out.println("正在查找");
		Binary_search bs = new Binary_search();
		int result = bs.srarch(in,9);
		System.out.println("该数字所在数组下标为："+result);
	}
}
