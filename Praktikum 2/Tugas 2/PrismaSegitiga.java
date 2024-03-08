public class PrismaSegitiga {
    private Segitiga segitiga;
    private double tinggi;

    public PrismaSegitiga(Segitiga alas, double tinggi) {
        this.segitiga = alas;
        this.tinggi = tinggi;
    }

    public double getTinggiPrisma() {
        return tinggi;
    }

    public double hitungVolume(){
        return segitiga.hitungLuas() * tinggi;
    }

    public double hitungLuasPermukaan(){
        return 2*segitiga.hitungLuas() + (Math.pow((Math.pow(segitiga.getAlas(), 2) + Math.pow(segitiga.getTinggi(), 2)), 0.5) * tinggi) + (segitiga.getAlas() * tinggi) + (segitiga.getTinggi() * tinggi);
    }
}
