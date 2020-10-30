/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan21.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Target Saldo Tabungan
 */
public class IF110119005Latihan21RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print ("Masukkan Banyaknya Mahasiswa : ");
        Scanner scanner = new Scanner(System.in);
        int jum = scanner.nextInt();
        
        double nilai[] = new double [jum];
        double total = 0;
        
        for(int i=0; i<nilai.length; i++){
            System.out.print("Nilai Mahasiswa ke - " +(i+1)+" : ");
            nilai[i] = scanner.nextDouble();
        }
        for(int i=0; i<nilai.length; i++) {
            total = total + nilai [i];
        }
        double Hasil = total/nilai.length;
        System.out.println("");
        System.out.println("Maka, rata-rata nilainya adalah " +Hasil);
        System.out.println("Developed by : Hayin Ananta");
    }
    
}
