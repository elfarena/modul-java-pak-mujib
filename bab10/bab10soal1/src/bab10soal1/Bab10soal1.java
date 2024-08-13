/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab10soal1;

/**
 *
 * @author PC RPL - R1
 */
public class Bab10soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          aritmatika3 calc = new aritmatika3();
        
        
        int a = 10;
        int b = 5;
        
        System.out.println("Penjumlahan: " + calc.penjumlahan(a, b));
        System.out.println("Pengurangan: " + calc.pengurangan(a, b));
        System.out.println("Perkalian: " + calc.perkalian(a, b));
        System.out.println("Pembagian: " + calc.pembagian(a, b));
        System.out.println("Pangkat: " + calc.pangkat(a, b));
    }
}

     class aritmatika3 {
         
         
         public int penjumlahan(int a, int b) {
             return a + b;
         }
         
         public int pengurangan(int a, int b) {
             return a - b;
         }
         
         
         public int perkalian(int a, int b) {
             return a * b;
         } 
         
         public double pembagian(int a, int b) {
             if (b == 0) {
                 throw new ArithmeticException("Pembagi tidak boleh nol");
             }
             return (double) a / b;
         }
         
         public double pangkat (int a, int b) {
             return Math.pow(a, b);
         }
     
     
     }
    