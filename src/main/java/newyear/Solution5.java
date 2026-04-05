package newyear;

public class Solution5 {
    public static void main(String[] args) {
        BankAccount alex = new BankAccount("Alex", 1000.00);
        alex.deposit(500.0);
        alex.withdraw(200.0);
        alex.withdraw(2000.0);
        System.out.println("Итоговый баланс: "+alex.getBalance());


    }
}


class BankAccount {
    private String ownerName;
    private double balance;

    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Операция пополнения не может быть отрицательной");
        } else {
            this.balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }

}