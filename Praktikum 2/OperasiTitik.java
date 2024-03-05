public class OperasiTitik {
    public void refleksiSumbuX(Titik titik){
        titik.setOrdinat(-titik.getOrdinat());
    }

    public void refleksiSumbuY(Titik titik){
        titik.setAbsis(-titik.getAbsis());
    }

    public Titik refleksiX(Titik titik){
        refleksiSumbuX(titik);
        return titik;
    }

    public Titik refleksiY(Titik titik){
        refleksiSumbuY(titik);
        return titik;
    }
}
