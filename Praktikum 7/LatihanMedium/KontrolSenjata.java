public class KontrolSenjata{
    protected Senjata senjata;

    public KontrolSenjata (Senjata s){
        senjata = s;
    }

    public boolean isAdaPeluru(){
        return senjata.peluru != 0;
    }

    public void isiPeluru(int jumPeluru){
        senjata.setPeluru(jumPeluru);
        System.out.println("Peluru berhasil ditambah: " + jumPeluru);
    }

    public void menembak(int jumlah){
        System.out.println("Siap menembak " + jumlah + " kali");
        if(isAdaPeluru()){
            for(int i = 1; i <= jumlah; i++){
                if(isAdaPeluru()){
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(senjata.getPeluru() - 1);
                } else {
                    System.out.println("Gagal tembak, Peluru Habis");
                }
            }

            System.out.println("Peluru sisa: " + senjata.getPeluru());
        } else {
            System.out.println("Peluru Habis!");
        }
    }

    public String menusuk(){
        if (senjata.isMenusuk()){
            return "Jleb! ";
        } else {
            return "Gagal, belum pasang bayonet";
        }
    }
    
    public void pasangBayonet(){
        senjata.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
}
