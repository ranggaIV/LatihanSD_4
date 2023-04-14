import java.util.HashMap;
import java.util.Scanner;

import javax.naming.ldap.HasControls;

public class Latihan4{
    String nama, kelas, matkulPraktikum;
    int nim;

    public Latihan4(String nm, String kl, String mat, int ni){
        nama = nm;
        kelas = kl;
        matkulPraktikum = mat;
        nim = ni;
    
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Latihan4> mhs = new HashMap<>(); 
        String input;
        Latihan4 data;
        
        mhs.put("1",new Latihan4("Putri", "3H", "Struktru Data", 202000));
        mhs.put("2",new Latihan4("Agus", "3A", "Matematika", 2020012));
        mhs.put("3",new Latihan4("Arro", "3D", "Pemrograman", 2020017));

        System.out.print("Masukan ID: ");
        input = in.nextLine();
        data = mhs.get(input);
        if(data != null){
            System.out.println("Data Mahasiswa : " + data.nama + ", kelas : "+
            data.kelas + ", mata kuliah praktikum : " + data.matkulPraktikum +
            ", nim : " + data.nim);
        }
    }
}