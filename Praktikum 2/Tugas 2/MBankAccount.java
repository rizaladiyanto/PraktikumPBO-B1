public class MBankAccount {
    public static void main(String[] args) {
        BankAccount BA = new BankAccount(1000);

        System.out.println("Saldo sebelum transaksi: " + BA.getBalance());

        double depositAmount = 500;
        BA.deposit(depositAmount);
        System.out.println("Deposit sejumlah " + depositAmount + " berhasil. Saldo saat ini: " + BA.getBalance());

        double withdrawAmount = 200;
        BA.withdraw(withdrawAmount);
        System.out.println("Penarikan sejumlah " + withdrawAmount + " berhasil. Saldo saat ini: " + BA.getBalance());

        System.out.println("Saldo setelah transaksi: " + BA.getBalance());
    }
}
