import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        scan.close();
        System.out.println("Luas Bujur Sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
    }
}

// yang terjadi ketika kelas bujursangkar tidak membuat implementasi maka tidak akan terjadi apa apa ketika main program dieksekusi
// Karena pada kelas abstract bangun datar tidak melakukan prosedur apapun, hanya mendefinisikan variabel 
