package keben;

public class AA {
 public static void main(String []args) {
  double e=Math.E;
  System.out.println(e);
  //用Math.sin(x)方法，求出输入x（双精度浮点数）对应的正弦值，参数代表弧度。
  double sin=Math.sin(1.75);
  System.out.println(sin);
  //用Math.cos(x)方法，求出输入x（双精度浮点数）对应的余弦值。参数代表弧度。
  double cos=Math.cos(3.14);
  System.out.println(cos);
  /*用Math.ceil(x))方法,若参数存在小数部分且为正数，则返回该参数的整数部分+1，且结果保留一位小数；
  若参数不存在小数部分，则返回该数的整数部分，且结果保留一位小数。
  若参数为负数，则返回该参数的整数部分。 参数代表输入的浮点数。*/
  double ceil=Math.ceil(-1.32);
  System.out.println(ceil);
  //用Math.floor(x)方法,返回最大的双精度值该值为整数且该值小于等于输入的参数。参数代表输入的浮点数。
  double floor=Math.floor(-1.02);
  System.out.println(floor);
  //用Math.log(x)方法，返回参数的自然对数（以e为底），参数为对数。
  double log=Math.log(9);
  System.out.println(log);
  //用Math.sqrt(x)方法,返回参数开平方根的值，参数代表根号中的底数。
  double sqrt=Math.sqrt(9.00);
  System.out.println(sqrt);
  //用Math.round(x)方法,对输入的浮点数进行四舍五入再输出。参数代表输入的浮点数。
  double round=Math.round(3.50);
  System.out.println(round);
  //用Math.exp(x)方法,返回欧拉数e的二重值的幕。参数代表输入的浮点数。
  double exp=Math.exp(485.0);
  System.out.println(exp);
 }
}