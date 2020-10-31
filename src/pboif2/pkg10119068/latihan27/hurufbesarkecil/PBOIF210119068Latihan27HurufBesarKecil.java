/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119068.latihan27.hurufbesarkecil;

import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan Huruf besar dan kecil
 */
public class PBOIF210119068Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String huruf;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukan Kalimat : ");
        huruf = keyboard.nextLine();
        String hurufBesar = huruf.toUpperCase();
        String hurufKecil = huruf.toLowerCase();
        String outputText =  
            "----------Hasil Formatting----------" + "\n" +
            "Huruf Besar\t :" + hurufBesar + "\n" +
            "Huruf Kecil\t :" + hurufKecil + "\n" +
            "------------------------------------" + "\n" +
            "DIBUAT OLEH TATANG SULAEMAN";

        System.out.println(outputText);
    }
    
}
