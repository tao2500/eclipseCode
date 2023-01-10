package class_one;

public class Array_1 {
	public static void print(Object[] array){          //复杂度O(1)
		for(Object obj : array){
			System.out.print(obj==null? "null" : " "+obj.toString());
		}
		System.out.println();
	}
	public static void prints(Object[] array){          //复杂度O(n)
		String value="";
		int i=1;
		String s="";
		for(Object obj : array){
			if(i==1){
				value= obj==null? value+"null" : value+" "+obj.toString();
				i=0;
			}else{
				value= obj==null? value+"null" : value+"，"+obj.toString();
			}
			
			
		}
		System.out.println(value);
	}
	public static Integer[] rendom(int n,int size){          //复杂度O(n)
		Integer[] values = new Integer[n];
		for(int i=0;i<values.length;i++){
			values[i] = new Integer((int)(Math.random()*size));
		}
		return values;
	}
	public static Integer[] rendomNotZero(int n,int size){        //复杂度O(n)
		Integer[] values = new Integer[n];
		for(int i=0;i<values.length;i++){
			Integer v = new Integer((int)(Math.random()*size));
			if(v==0){
				values[i] = rendom1(size);
			}else{
				values[i] =v;
			}
		}
		return values;
	}
	public static Integer rendom1(int size){                         //复杂度O(1)
		Integer v = new Integer((int)(Math.random()*size));
		return v;
	}
	public static Integer[] rendomNotZeroNotRepeat(int n,int size){               //复杂度O(n²)
		Integer[] values = new Integer[n];
		int q=1;
		for(int i=0;i<values.length;i++){
			Integer v = new Integer((int)(Math.random()*size));
			for(int ii=0;ii<values.length;ii++){
				if(values[ii]==v){
					v = new Integer((int)(Math.random()*size));
				}
			}
			if(v==0){
				values[i] = rendom1(size);
			}else{
				values[i] =v;
			}
		}
		return values;
	}
	public static void main(String[ ] args){                                  //复杂度O(1)
		System.out.println("生成10个随机数如下：");
		Integer array[]=rendom(10,100);
		print(array);
		System.out.println("生成10个不为零的随机数如下：");
		Integer array1[]=rendomNotZero(10,100);
		prints(array1);
		System.out.println("生成10个不为零且不重复的随机数如下：");
		Integer array2[]=rendomNotZeroNotRepeat(10,100);
		prints(array2);
	}
}

