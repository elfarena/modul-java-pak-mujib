/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab8soal2;
import java.util.Scanner;
/**
 *
 * @author PC RPL - R1
 */
public class Bab8soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Input Tahun Akhir
        System.out.print("Tahun Akhir ? : ");
        int tahunAkhir = scanner.nextInt();

        // Input Tahun Awal
        System.out.print("Tahun Awal ? : ");
        int tahunAwal = scanner.nextInt();

        // Menampilkan hasil
        System.out.println("Hasilnya : ");
        for (int i = tahunAkhir; i >= tahunAwal; i--) {
            System.out.println(i);
        }
    }

    
}
    
    

