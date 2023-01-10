package double_tree;

public class Binary_tree_main {
	public static void main(String [] args){
		String[] str = {"A","B",null,"D",null,null,"C",null,null};
		BinaryTree bt = new BinaryTree(str);
		System.out.print("先根遍历二叉树 ：");
		bt.preorder();
		System.out.print("中根遍历二叉树 ：");
		bt.inorder();
		System.out.print("后根遍历二叉树 ：");
		bt.postorder();
		System.out.println("二叉树的高度为："+bt.grtTreeHeight(bt.root));
		System.out.println("二叉树的节点总数为："+bt.getNodeNumber(bt.root));
		System.out.println("二叉树的叶子结点总数为："+bt.gerLeafNumber(bt.root));
	}
}
