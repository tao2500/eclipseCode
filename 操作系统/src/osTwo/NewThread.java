package osTwo;

public class NewThread implements Runnable {
    private Bank bank;

    public NewThread(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
        	bank.save(10); //»òÊ¹ÓÃ bank.savel(10);
        	int b= bank.getAccount();
        	System.out.println(i + "acccc" +b);
        }
    }

}
