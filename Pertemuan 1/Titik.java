class Titik{
    // deklarasi atribut
    double absis;
    double ordinat;
    static int counterTitik;

    // deklarasi konstruktor
    Titik(){
         absis = 0;
         ordinat = 0;
         counterTitik++;
    }

    Titik(double a, double o){
        absis = a;
        ordinat = o;
        counterTitik++;
   }

    // deklarasi metode 
    void setAbsis(double a){
        absis = a;
    }

    void setOrdinat(double o){
        ordinat = o;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    int getCounter(){
        return counterTitik;
    }
}
