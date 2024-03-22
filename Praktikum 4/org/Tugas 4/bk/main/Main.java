package bk.main;
import bk.bukufiksi.*;
import bk.bukunonfiksi.*;

public class Main {
    public static void main(String[] args){
        bukuNovel novel = new bukuNovel("Laskar Pelangi", "Andrea Hirata", "2005", "Roman", 529, 300000);
        bukuAkademik akademik = new bukuAkademik("Buku Sejarah Indonesia", "Abdurakhman", "2018", "Sejarah", 430, 150000);

        novel.view();
        akademik.view();
    }
}
