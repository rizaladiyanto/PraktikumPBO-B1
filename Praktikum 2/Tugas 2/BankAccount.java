public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance){
        balance = initialBalance;
    }

    public void deposit (double jumlah){
        balance += jumlah;
    }

    public void withdraw (double jumlah){
        if (jumlah > balance){
            System.out.println("Saldo tidak cukup!");
            System.exit(1);
        } else {
            balance -= jumlah;
        }
    }

    public double getBalance(){
        return balance;
    }
}
