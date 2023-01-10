package osTwo;

class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoThread tt = new TwoThread();
        tt.start();
        for ( int i = 0; i < 10; i++ ) {
            System.out.println("Main thread");
        }
	}

}
