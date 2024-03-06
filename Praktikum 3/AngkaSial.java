public class AngkaSial{
    public void CobaAngka(int angka) throws AngkaSialException {
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial!");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.CobaAngka(10);
            as.CobaAngka(13);
            as.CobaAngka(12);
        }catch(AngkaSialException ase){
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati hati memasukkan angka!"); 
        } 
    }
}

// Ketika eksepsi terjadi, baris ke 12 tidak akan dieksekusi, karena program akan langsung keluar menuju catch
// Baris 21 dieksekusi, karena terdapat masukan angka 13