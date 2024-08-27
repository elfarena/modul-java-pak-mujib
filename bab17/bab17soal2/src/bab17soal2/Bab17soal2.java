/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab17soal2;

/**
 *
 * @author PC RPL - R1
 */
public class Bab17soal2 {

    /**
     * @param args the command line arguments
     */
    
        public static void main(String[] args) {
        // Membuat array multidimensi untuk menyimpan nama negara dan ibu kotanya
        String[][] negaraDanIbukota = {
            {"Indonesia", "Jakarta"},
            {"Jepang", "Tokyo"},
            {"Iran", "Teheran"},
            {"Malaysia", "Kuala Lumpur"},
            {"Thailand", "Bangkok"}
        };

        // Mengakses array dan menampilkan nama negara beserta ibukotanya
        for (String[] negaraDanIbukota1 : negaraDanIbukota) {
            System.out.println("Ibukota " + negaraDanIbukota1[0] + " adalah " + negaraDanIbukota1[1]);
        }
    }
}
    
    

