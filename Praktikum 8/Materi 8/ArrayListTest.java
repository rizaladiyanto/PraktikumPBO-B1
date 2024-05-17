import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args){
        // Inisiasi ArrayList yang hanya dapat berisi objek String
        ArrayList<String> strings = new ArrayList<String>();
        // Menambah elemen
        strings.add("Prakikum");
        strings.add("collection");
        strings.add("dan generics");
        // Menghapus elemen
        strings.remove("Praktikum");
        // Iterasi pada keseluruhan ArrayList
        for(String s : strings){
            System.out.println(s + " ");
        }
    }
}
