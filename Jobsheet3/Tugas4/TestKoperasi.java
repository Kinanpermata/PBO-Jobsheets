/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet3.Tugas4;

import Jobsheet3.Tugas4.Anggota;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class TestKoperasi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Maksimal Pinjaman: " + donny.getLimitPinjaman());
        System.out.println("Masukkan Pinjaman: ");
        int pinjaman = sc.nextInt();
        donny.pinjam(pinjaman);
        System.out.println("Pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("Bayar angsuran: ");
        int angsuran = sc.nextInt();
        donny.angsur(angsuran);
        System.out.println("Pinjaman saat ini: " + donny.getJumlahPinjaman());
    }
}