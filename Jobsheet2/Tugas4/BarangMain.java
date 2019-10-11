/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet2.Tugas4;

/**
 *
 * @author ASUS
 */
public class BarangMain {
    public static void main(String[] args) {
        Barang br1 = new Barang();
        br1.kode = "AB001";
        br1.namaBarang = "Cereal";
        br1.hargaDasar = 18000;
        br1.diskon = 10f;
        br1.tampilData();
    } 
}