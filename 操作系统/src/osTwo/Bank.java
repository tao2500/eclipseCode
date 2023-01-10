package osTwo;

public class Bank {
	 
    private int account = 100;

    public int getAccount() {
        return account;
    }
    public synchronized void save(int money) {
        account += money;
    }
    public void save1(int money) {
        synchronized (this) {
            account += money;
        }
    }
}
