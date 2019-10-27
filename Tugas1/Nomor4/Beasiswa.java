/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1.Nomor4;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Beasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ip;
        int pot;
        
        do{
            System.out.print("Masukkan IP Mahasiswa: ");
            ip = sc.nextDouble();
            System.out.print("Masukkan Pendapatan Orang Tua: ");
            pot = sc.nextInt();
            
            if(ip <= 0 && pot <=0){
                break;
            }
            
            if(ip >= 3.5){
                System.out.println("4. Anda berhak atas Beasiswa Peningkatan Prestasi 2");
            } else if (ip < 3.5 && pot < 1000000){
                System.out.println("1. Anda berhak atas Beasiswa Tidak Mampu");
            } else if (ip < 3.5 && pot >= 1000000 && pot <5000000){
                System.out.println("3. Anda berhak atas Beasiswa Peningkatan Prestasi 1");
            } else if (ip >= 2.0){
                System.out.println("3. Anda berhak atas Beasiswa Peningkatan Prestasi 1");
            } else if (ip < 2.0){
                System.out.println("2. Anda berhak atas Beasiswa Pendidikan");
            } else {
                System.out.println("0. Tidak masuk kategori manapun");
            }
        } while (true);
    }
}