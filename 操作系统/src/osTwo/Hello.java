package osTwo;

class Hello extends Thread {  
	 private int count = 5; 
	public void run() {  
      for (int i = 0; i < 7; i++) {  
          if (count > 0) {  
              System.out.println("count= " + count--);  
          }  
      }  
  }  
} 
