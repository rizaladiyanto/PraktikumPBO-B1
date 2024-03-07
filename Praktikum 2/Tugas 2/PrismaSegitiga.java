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
        return hitungLuasPermukaan() * tinggi;
    }

    public double hitungLuasPermukaan(){
        return segitiga.hitungLuas();
    }
}
