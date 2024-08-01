public class Account {
    private int accountNo;
    private String name;
    private float balance;
    public Account(int acc, String name, float bal) {
        this.accountNo = acc;
        this.name = name;
        this.balance = bal;
    }

    public float getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }
    public int getAccount() {
        return accountNo;
    }

    public void deposit(float amount) {
        balance += amount;
        System.out.println("New Balance : " + balance);
    }

    public float checkBalance() {
        return balance;
    }

    public void withdraw(float amount) {
        if(balance >= amount) {
            balance-=amount;
            System.out.println("Withdrawn : " + amount);
        } else {
            System.out.println("Insuffiecient balance!");
        }
    }



}