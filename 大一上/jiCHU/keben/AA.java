package keben;

public class AA {
 public static void main(String []args) {
  double e=Math.E;
  System.out.println(e);
  //��Math.sin(x)�������������x��˫���ȸ���������Ӧ������ֵ�����������ȡ�
  double sin=Math.sin(1.75);
  System.out.println(sin);
  //��Math.cos(x)�������������x��˫���ȸ���������Ӧ������ֵ�����������ȡ�
  double cos=Math.cos(3.14);
  System.out.println(cos);
  /*��Math.ceil(x))����,����������С��������Ϊ�������򷵻ظò�������������+1���ҽ������һλС����
  ������������С�����֣��򷵻ظ������������֣��ҽ������һλС����
  ������Ϊ�������򷵻ظò������������֡� ������������ĸ�������*/
  double ceil=Math.ceil(-1.32);
  System.out.println(ceil);
  //��Math.floor(x)����,��������˫����ֵ��ֵΪ�����Ҹ�ֵС�ڵ�������Ĳ�����������������ĸ�������
  double floor=Math.floor(-1.02);
  System.out.println(floor);
  //��Math.log(x)���������ز�������Ȼ��������eΪ�ף�������Ϊ������
  double log=Math.log(9);
  System.out.println(log);
  //��Math.sqrt(x)����,���ز�����ƽ������ֵ��������������еĵ�����
  double sqrt=Math.sqrt(9.00);
  System.out.println(sqrt);
  //��Math.round(x)����,������ĸ������������������������������������ĸ�������
  double round=Math.round(3.50);
  System.out.println(round);
  //��Math.exp(x)����,����ŷ����e�Ķ���ֵ��Ļ��������������ĸ�������
  double exp=Math.exp(485.0);
  System.out.println(exp);
 }
}