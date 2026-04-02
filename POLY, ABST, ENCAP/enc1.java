class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        if (balance >= 0)
            this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
        else
            System.out.println("Invalid withdrawal");
    }

    public double getBalance() {
        return balance;
    }

    public void display() {
        System.out.println(accountHolder + " Balance: " + balance);
    }
}

public class enc1 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Ravi", 1000);
        acc.deposit(500);
        acc.withdraw(300);
        acc.display();
    }
}