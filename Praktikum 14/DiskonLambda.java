interface IDiskon {
    public double hitungDiskon(int harga);
}

public class DiskonLambda{
    public static void main(String[] args) {
        IDiskon diskonMerdeka = new IDiskon(){
            public double hitungDiskon(int harga){
                return harga - (harga * 0.3);
            }
        };

        //dengan lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
        // dengan lambda dengan blok statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));

        // perbedaan implementasi diskonLebaran dan diskonBiasa
        // terletak pada cara penulisannya, diskonLebaran dituliskan tanpa blok statement{}
        // sehingga tidak memerlukan return
        // sedangkan diskonBiasa diimplementasikan menggunakan blok statement
        // sehingga diperlukan return
    }
}
