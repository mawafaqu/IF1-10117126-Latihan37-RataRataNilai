/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117126.latihan37.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author MAWA
 */
public class IF110117126Latihan37RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int jmlMhs;
        Scanner scanner = new Scanner(System.in);
        ratanilai rata2 = new ratanilai();
        
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        jmlMhs = scanner.nextInt();
        
        rata2.hitungNilai(jmlMhs);
        double jmlNilai;
        System.out.println("\n" + "Rata Rata Nilainya adalah : " + 
                rata2.hitungratanilai(rata2.jmlNilai,jmlMhs));
        System.out.println("Developed By Mawa Faqu Rochman");
    }
    
}
