/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan35.programtunjangan.oo;

/**
 *
 * @author Alfi Nurizkya
 * NAMA     : ALFI NURIZKYA
 * KELAS    : IF-1
 * NIM      : 10119036
 * DESKRIPSI PROGRAM : Membuat Data Program Tunjangan Berbasis Object Oriented
 */

import java.util.Scanner;
public class Tunjangan {

      public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double gaji;
        String status;
        Latihan35ProgramTunjanganOO tunjangan = new Latihan35ProgramTunjanganOO();
        System.out.println("=====Program Tunjangan====");
        System.out.print("Berapa gaji anda perbulan ? \t: Rp. ");
        gaji = scan.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) \t: ");
        status = scan.next().toUpperCase();
        tunjangan.hitung(gaji, status);
        System.out.println("(Developed by : Alfi Nurizkya)");
    }
}