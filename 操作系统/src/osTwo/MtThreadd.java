package osTwo;

class MyThreadd implements Runnable{  
    private int ticket = 5;  //5��Ʊ  
    public void run() {  
        for (int i=0; i<=20; i++) {  
            if (this.ticket > 0) {  
                System.out.println(Thread.currentThread().getName()+ "������Ʊ"+this.ticket--);  
            }  
        }  
    }  
}
