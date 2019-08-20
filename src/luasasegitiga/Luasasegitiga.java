/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luasasegitiga;

import java.util.Scanner;

/**
 *
 * @author KANG_SNAKE
 */
public class Luasasegitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi
        Double luas;
        int alas, tinggi;
        
       // membuat Scanner baru
        Scanner baca = new Scanner(System.in);
        
        // input
        System.out.println("== program hitung luas segitiga ==");
        System.out.print("input alas: ");
        alas = baca.nextInt();
        System.out.print("input tinggi: ");
        tinggi = baca.nextInt();
        
        //proses
        luas = Double.valueOf((alas * tinggi) /2 );
        
        //output
        System.out.println("luas =" + luas);
    }
    
}
