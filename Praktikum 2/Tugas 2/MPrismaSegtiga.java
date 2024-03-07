public class MPrismaSegtiga {
    public static void main(String[] args) {
        Segitiga S = new Segitiga(3, 4);
        PrismaSegitiga PS = new PrismaSegitiga(S, 5);

        System.out.println("Alas: " + S.getAlas() + " Tinggi Segitiga: " + S.getTinggi() + " Tinggi Prisma: " + PS.getTinggiPrisma());
        System.out.println("Luas Permukaan Prisma Segitiga: " + PS.hitungLuasPermukaan());
        System.out.println("Volume Prisma Segitiga: " + PS.hitungVolume());
    }
}