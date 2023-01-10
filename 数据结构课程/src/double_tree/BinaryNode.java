package double_tree;   //二叉树节点类

public class BinaryNode<T> {
	public T data;
	public BinaryNode<T> left, right;
	public BinaryNode(T data, BinaryNode<T> left, BinaryNode<T> right){
		this.data = data;
		this.left = left;
		this.right = right;
	}
	public BinaryNode(T data){
		this.data = data;
	}
	public String toString(){
		String a="";
		return a;
	}
	public boolean isLeaf(){
		return data==null;
	}
}
