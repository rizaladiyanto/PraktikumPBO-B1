public class MOperasiTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(3, 4);
        OperasiTitik OP = new OperasiTitik();

        System.out.println("titik (" + T1.getAbsis() + ", " + T1.getOrdinat() + ")");
        // OP.refleksiSumbuX(T1);
        // OP.refleksiSumbuY(T1);
        // System.out.println("titik (" + T1.getAbsis() + ", " + T1.getOrdinat() + ")");
        // System.out.println("titik (" + T1.getAbsis(refleksiY()) + ", " + T1.getOrdinat(refleksiX()) + ")");
        OP.refleksiX(T1);
        OP.refleksiY(T1);
        System.out.println("titik setelah refleksi (" + T1.getAbsis() + ", " + T1.getOrdinat() + ")");

    }
}
