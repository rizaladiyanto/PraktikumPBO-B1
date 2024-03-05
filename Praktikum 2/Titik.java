public class Titik {
    // Atribut
    private double absis;
    private double ordinat;
    static int counterTitik;

    // Konstruktor
    public Titik(double x, double y){
        absis = x;
        ordinat = y;
    }

    // Method
    public void setAbsis(double x){
        absis = x;
    }
    
    public void setOrdinat(double y){
        ordinat = y;
    }
    
    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }

    public int getCounter(){
        return counterTitik;
    }

    // public void refleksiX(){
    //     ordinat = -ordinat;
    // }

    // public void refleksiY(){
    //     absis = -absis;
    // }

    // public double getJarakPusat(){
    //     return Math.pow((Math.pow(absis, 2) + Math.pow(ordinat, 2)), 0.5);
    // }

    // public double getRefleksiX(){
    //     return ordinat = -ordinat;
    // }

    // public double getRefleksiY(){
    //     return absis = -absis;
    // }
}
