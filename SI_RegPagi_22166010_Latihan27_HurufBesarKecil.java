/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166010_latihan27_hurufbesarkecil;
import java.util.Scanner;
/**
 *
 * @author ACER
 * NAMA : Mufida Anggradita
 * KELAS : PBO27
 * NIM : 22166010
 * DESKRIPSI PROGRAM : Huruf Besar dan Kecil
 */
public class SI_RegPagi_22166010_Latihan27_HurufBesarKecil {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();
        System.out.println();
        
        System.out.println("============Hasil Formatting===========");
        System.out.println("Huruf besar: " + kalimat.toUpperCase());
        System.out.println("Huruf kecil: " + kalimat.toLowerCase());
    }
}
