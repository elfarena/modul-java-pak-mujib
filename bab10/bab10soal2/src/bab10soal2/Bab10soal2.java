/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab10soal2;

/**
 *
 * @author PC RPL - R1
 */
public class Bab10soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         class Aritmatika1 {
        public int pengurangan(int bilangan1, int bilangan2) {
            return bilangan1 - bilangan2;
        }

        public int perkalian(int bilangan1, int bilangan2) {
            return bilangan1 * bilangan2;
        }

        public double pembagian(int bilangan1, int bilangan2) {
            if (bilangan2 != 0) {
                return (double) bilangan1 / bilangan2;
            } else {
                System.out.println("Error: Pembagian dengan nol!");
                return 0;
            }
        }

        public double pangkat(int bilangan1, int bilangan2) {
            return Math.pow(bilangan1, bilangan2);
        }
    }

        Bab10soal2 outer = new Bab10soal2();
        Aritmatika1 aritmatika = new Aritmatika1();

        int bilangan1 = 5;
        int bilangan2 = 3;

        int hasilPengurangan = aritmatika.pengurangan(bilangan1, bilangan2);
        System.out.println("Hasil Pengurangan: " + bilangan1 + " - " + bilangan2 + " = " + hasilPengurangan);

        int hasilPerkalian = aritmatika.perkalian(bilangan1, bilangan2);
        System.out.println("Hasil Perkalian: " + bilangan1 + " * " + bilangan2 + " = " + hasilPerkalian);

        double hasilPembagian = aritmatika.pembagian(bilangan1, bilangan2);
        System.out.println("Hasil Pembagian: " + bilangan1 + " / " + bilangan2 + " = " + hasilPembagian);

        double hasilPangkat = aritmatika.pangkat(bilangan1, bilangan2);
        System.out.println("Hasil Pangkat: " + bilangan1 + " ^ " + bilangan2 + " = " + hasilPangkat);
    }
}

