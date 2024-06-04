import java.util.*;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("40120", "Fikri");
        mahasiswaMap.put("40156", "Rijal");
        mahasiswaMap.put("30064", "Jeki");
        mahasiswaMap.put("30052", "Roy");

        mahasiswaMap.forEach( (nim, nama) -> System.out.println("NIM : " + nim + " Nama: " + nama) );
    }
}
