class Lingkaran {
    private double jarijari;

    public Lingkaran(double jarijari){
        this.jarijari = jarijari;
    }

    public double hitungKeliling(){
        double keliling = 2*Math.PI*jarijari;
        return keliling;
    }
}
    
public class Asersi2 {
    public static void main(String[] args){
        double jarijari = -7;

        assert(jarijari>0): "Jari jari tidak boleh nol!";
        Lingkaran l = new Lingkaran(jarijari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran : " + kelilingLingkaran);
    }
}

// Kesalahan terletak pada program yang tetap berjalan ketika masukan jari jari <0.
// serta ketika masukan jari jari adalah bilangan negatif, pesan tetap memunculkan kata "Jari jari tidak boleh Nol!" padahal bilangannya adalah negatif