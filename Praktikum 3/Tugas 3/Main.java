import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MenuTidakTersediaException, JumlahPesananMelebihiStokException {

        // Inisiasi Menu
        Menu menu1 = new Menu("Nasi Goreng", 25000, 10);
        Menu menu2 = new Menu("Mie Ayam", 20000, 15);

        Scanner scan = new Scanner(System.in);

        // Interaksi Pengguna
        System.out.println("Menu: ");
        System.out.println("menu1: Nasi Goreng - Rp25.000,-");
        System.out.println("menu2: Mie Ayam - Rp20.000,-");

        try{
            // Meminta Input Pengguna
            System.out.print("Pilih Menu (1/2): ");
            int pilihanMenu = scan.nextInt();

            System.out.print("Jumlah Pesanan: ");
            int jumlahPesanan = scan.nextInt();

            // Menu dipilih
            Menu menu = null;
            if (pilihanMenu == 1){
                menu = menu1;
            } else if (pilihanMenu == 2){
                menu = menu2;
            } else {
                System.out.println("Pilihan menu tidak valid!");
            }

            if (menu == null){
                throw new MenuTidakTersediaException("Menu yang dipilih tidak tersedia!");
            }

            if (jumlahPesanan > menu.getStok()){
                throw new JumlahPesananMelebihiStokException("Jumlah pesanan melebihi Stok!");
            }

            // Pemesanan
            Pesanan pesanan = new Pesanan(menu, jumlahPesanan);
            menu.kurangiStok(jumlahPesanan);

            System.out.println("Pesanan berhasil dilakukan");
            System.out.println("Total harga: Rp" + pesanan.getTotal());

        } catch (MenuTidakTersediaException | JumlahPesananMelebihiStokException e){
            System.out.println(e.getMessage());
        } finally {
            scan.close();
        }
    }
}
