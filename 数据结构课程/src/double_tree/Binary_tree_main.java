package double_tree;

public class Binary_tree_main {
	public static void main(String [] args){
		String[] str = {"A","B",null,"D",null,null,"C",null,null};
		BinaryTree bt = new BinaryTree(str);
		System.out.print("�ȸ����������� ��");
		bt.preorder();
		System.out.print("�и����������� ��");
		bt.inorder();
		System.out.print("������������� ��");
		bt.postorder();
		System.out.println("�������ĸ߶�Ϊ��"+bt.grtTreeHeight(bt.root));
		System.out.println("�������Ľڵ�����Ϊ��"+bt.getNodeNumber(bt.root));
		System.out.println("��������Ҷ�ӽ������Ϊ��"+bt.gerLeafNumber(bt.root));
	}
}
