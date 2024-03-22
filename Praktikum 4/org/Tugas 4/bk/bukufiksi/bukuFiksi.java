package bk.bukufiksi;
import bk.buku.Buku;

public class bukuFiksi extends Buku{
    protected String genre;
    protected int jumlahHalaman;
    protected double harga;
    
    public bukuFiksi(String judul, String penulis, String tahunTerbit, String genre, int jumlahHalaman, double harga){
        super(judul, penulis, tahunTerbit);
        this.genre = genre;
        this.jumlahHalaman = jumlahHalaman;
        this.harga = harga;
    }

    public bukuFiksi(){

    }

    public String getGenre(){
        return genre;
    }

    public int getJumlahHalaman(){
        return jumlahHalaman;
    }

    public double getHarga(){
        return harga;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void setJumlahHalaman(int jumlahHalaman){
        this.jumlahHalaman = jumlahHalaman;
    }

    public void view(){
        super.view();
        System.out.println("Genre buku\t\t: " + getGenre());
        System.out.println("Jumlah Halaman buku\t: " + getJumlahHalaman());
        System.out.println("Harga buku\t\t: Rp." + getHarga() + "\n");
    }
}
