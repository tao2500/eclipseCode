package double_tree;   //��������

public class BinaryTree<T> {
	public BinaryNode<T> root;
	public BinaryTree(){
		this.root = null;
	}
	public boolean isEmpty(){
		return this.root==null;
	}
	public void insert(T x){
		if(x!=null)
			this.root = new BinaryNode<T>(x, this.root, null);
	}
	public BinaryNode<T> insert(BinaryNode<T> p, boolean left, T x){
		if(x==null || p==null){
			return null;
		}
		if(left){
			return p.left = new BinaryNode<T>(x, p.left ,null); 
		}
		return p.right = new BinaryNode<T>(x, null, p.right);
	}
	public BinaryTree(T[] prelist){   //�ȸ�����������
		this.root = create(prelist); 
	}
	private int i = 0;
	private BinaryNode<T> create(T[] prelist){   //�ڵ㹹��
		BinaryNode<T> p = null;
		if(i<prelist.length){
			T elem = prelist[i++];
//			System.out.println("�����ɹ�"+i);
			if(elem!=null){
				p = new BinaryNode<T>(elem);
//				if(p!=null)
//					System.out.println(p.data);
				p.left = create(prelist);
				p.right = create(prelist); 
			}
		}
		return p;
	}
	public void preorder(){  //�ȸ�����
		preorder(this.root);
		System.out.println();
	}
	public void preorder(BinaryNode<T> p){
		if(p!=null){
			System.out.print(p.data.toString()+" ");
			preorder(p.left);
			preorder(p.right);
		}
	}
	public void inorder(){  //�и�����
		inorder(this.root);
		System.out.println();
	}
	public void inorder(BinaryNode<T> p){
		if(p!=null){
			inorder(p.left);
			System.out.print(p.data.toString()+" ");
			inorder(p.right);
		}
	}
	public void postorder(){  //�������
		postorder(this.root);
		System.out.println();
	}
	public void postorder(BinaryNode<T> p){
		if(p!=null){
			postorder(p.left);
			postorder(p.right);
			System.out.print(p.data.toString()+" ");
		}
	}
	public int grtTreeHeight(BinaryNode<T> node){    //����
		int l,r;
		if(node==null)return 0;
		l = grtTreeHeight(node.left);
		r = grtTreeHeight(node.right);
		return l>r?l+1:r+1;
	}
	int number=0;
	public int getNodeNumber(BinaryNode<T> node){  //�ڵ���
		if(node==null) return 0;
		getNodeNumber(node.left);
//		System.out.println("ִ����R"+number);
		getNodeNumber(node.right);
//		System.out.println("ִ�гɹ�R"+number);
		number = number+1;    //һ���ڵ㶨�����ҽڵ㣬����һ�����ҽڵ�+1
		return number;
	}
	int num=0;
	public int gerLeafNumber(BinaryNode<T> node){   //Ҷ�ӽڵ���
		if(node==null) return 0;
		if(node.left==null&&node.right==null){
			return 1;
		}
		num = num+gerLeafNumber(node.left);
		num = num+gerLeafNumber(node.right);
		return num;
	}
}
