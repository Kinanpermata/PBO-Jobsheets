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
public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
    public float hargaJual;
    
    public float hitungHargaJual(){
        hargaJual = hargaDasar - ((diskon/100) * hargaDasar);
        return hargaJual;
    }
    
    public void tampilData(){
        System.out.println("Kode: " +kode);
        System.out.println("Nama Barang: " +namaBarang);
        System.out.println("Harga Dasar: RP. " +hargaDasar);
        System.out.println("Diskon: " +diskon+ "%");
        System.out.println("Harga Jual: RP. " +hitungHargaJual());
    }
}