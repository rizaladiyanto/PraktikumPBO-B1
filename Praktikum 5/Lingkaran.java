import static java.lang.Math.PI;

public class Lingkaran implements IArea {
    public double jejari;
    
    public Lingkaran(double r){
        jejari = r;
    }

    // public Lingkaran(){

    // }

    public double hitungLuas(){
        return PI * jejari * jejari;
    }
}
