package osTwo;

class T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5; i++)
			new Thread(new MyThread(i+1)).start();
			
	}

}
