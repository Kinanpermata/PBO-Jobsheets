/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet4.Tugas;

/**
 *
 * @author ASUS
 */
public class MainHP {
    public static void main(String[] args) {
        
        Handphone h = new Handphone();
        h.setMerkHp("Samsung Galaxy Note 10");
        h.setHargaHp(17000000);
        Customer c = new Customer();
        c.setNamaCust("Kinanti Permata");
        c.setUangCust(20000000);
        Kasir k = new Kasir();
        k.setNamaKasir("Budi");
        
        Transaksi t = new Transaksi();
        t.setKasir(k);
        t.setNama(c);
        t.setHp(h);
        t.setHargaHp(h);
        t.setUang(c);
        t.infoTransaksi();
    }
}