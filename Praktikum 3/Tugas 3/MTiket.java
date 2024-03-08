import java.util.Scanner;

public class MTiket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Jumlah tiket yang ingin dipesan: ");
        int jumlahTiket = scan.nextInt();
        Tiket.pesanJumlahTiket(jumlahTiket);

        System.out.println("Pilih e-wallet yang akan digunakan:");
        System.out.println("1. OVO");
        System.out.println("2. GoPay");
        System.out.println("3. DANA");
        System.out.println("4. LinkAja");
        System.out.print("Pilih e-wallet (1-4): ");
        int EWallet = scan.nextInt();
        Tiket.isEWallet(EWallet);
        scan.close();
    }
}
