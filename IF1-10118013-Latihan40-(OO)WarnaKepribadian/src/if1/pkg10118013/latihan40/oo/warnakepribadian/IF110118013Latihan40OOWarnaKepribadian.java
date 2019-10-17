/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan40.oo.warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author Rifian
 * Nama : Rifian Joe Premilenio
 * Nim : 10118013
 * Kelas : IF-01
 * Deskripsi Program : Menampilkan Warna Kepribadian
 */
public class IF110118013Latihan40OOWarnaKepribadian {
    public static final String reset = "\u001B[0m";
    public static final String merah = "\u001B[31m";
    public static final String hijau = "\u001B[32m";
    public static final String kuning = "\u001B[33m";
    public static final String biru = "\u001B[34m";
    public static final String ungu = "\u001B[35m";
    public static final String biruMuda = "\u001B[36m";
    public static final String putih = "\u001B[37m";
    public static final String latarMerah = "\u001B[41m";
    public static final String latarHijau = "\u001B[42m";
    public static final String latarKuning = "\u001B[43m";
    public static final String latarBiru = "\u001B[44m";
    public static final String latarUngu = "\u001B[45m";
        
    public static String nama;
    public static String warna;
    public static String warnaCek;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(merah + " YUK " + hijau + "CEK " + kuning + "KEPRIBADIANMU" +biruMuda +
                " DARI " + ungu + "WARNA " + biru + "FAVORITMU\n\n");
       
        System.out.println(latarMerah + putih+ "\t  MERAH\t\t"  );
        System.out.println(latarHijau + putih+ "\t  HIJAU\t\t"  );
        System.out.println(latarKuning + putih+ "\t  KUNING\t"  );
        System.out.println(latarBiru + putih+ "\t  BIRU\t\t"  );
        System.out.println(latarUngu + putih+ "\t  UNGU\t\t\n"  );
        
        System.out.print(reset + "PILIH WARNA FAVORITMU : ");
        Scanner tempWarna = new Scanner(System.in);
        warna = tempWarna.nextLine();
        warnaCek = warna.toUpperCase();
        
        System.out.print("NAMA KAMU : ");
        Scanner tempNama = new Scanner(System.in);
        nama = tempNama.nextLine();
        
        System.out.println("\n===HASIL TEST KEPRIBADIAN " + nama + "===");
        switch(warnaCek){
           case "MERAH" :
                System.out.println(reset + "Warna Favoritmu adalah " + merah + warnaCek); 
                Merah red = new Merah();
                Merah.warnaMerah();
                break;
           case "HIJAU" :
                System.out.println(reset + "Warna Favoritmu adalah " + hijau + warnaCek); 
                Hijau green = new Hijau();  
                Hijau.warnaHijau();
                break;
           case "KUNING" :
                System.out.println(reset + "Warna Favoritmu adalah " + kuning + warnaCek); 
                Kuning yellow = new Kuning();
                Kuning.warnaKuning();
                break;
           case "BIRU" :
                System.out.println(reset + "Warna Favoritmu adalah " + biru + warnaCek); 
                Biru blue = new Biru();
                Biru.warnaBiru();
                break;
           case "UNGU" :
                System.out.println(reset + "Warna Favoritmu adalah " + ungu + warnaCek); 
                Ungu purple = new Ungu();
                Ungu.warnaUngu();
                break;
           default :
                System.out.println("Oopss.. Belum terindentifikasi");
                break;
        }
        System.out.println("(Developed by : Rifian Joe Premilenio)");
    }
    
}
