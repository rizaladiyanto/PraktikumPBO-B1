package bk.bukunonfiksi;
import bk.buku.Buku;

public class bukuNonFiksi extends Buku {
    protected String subjek;
    protected int jumlahHalaman;
    protected double harga;

    public bukuNonFiksi(String judul, String penulis, String tahunTerbit, String subjek, int jumlahHalaman, double harga){
        super(judul, penulis, tahunTerbit);
        this.subjek = subjek;
        this.jumlahHalaman = jumlahHalaman;
        this.harga = harga;
    }

    public bukuNonFiksi(){

    }

    public String getSubjek(){
        return subjek;
    }

    public int getJumlahHalaman(){
        return jumlahHalaman;
    }

    public double getHarga(){
        return harga;
    }

    public void setSubjek(String subjek){
        this.subjek = subjek;
    }

    public void setJumlahHalaman(int jumlahHalaman){
        this.jumlahHalaman = jumlahHalaman;
    }

    public void view(){
        super.view();
        System.out.println("Subjek buku\t\t: " + getSubjek());
        System.out.println("Jumlah Halaman buku\t: " + getJumlahHalaman());
        System.out.println("Harga buku\t\t: Rp." + getHarga());
    }
}
