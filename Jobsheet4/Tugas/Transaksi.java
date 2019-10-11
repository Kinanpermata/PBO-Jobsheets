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
public class Transaksi {
    private Kasir kasir;
    private Customer nama;
    private Customer uang;
    private Handphone hp;
    private Handphone hargaHp;

    public Kasir getKasir() {
        return kasir;
    }

    public void setKasir(Kasir kasir) {
        this.kasir = kasir;
    }

    public Customer getNama() {
        return nama;
    }

    public void setNama(Customer nama) {
        this.nama = nama;
    }

    public Customer getUang() {
        return uang;
    }

    public void setUang(Customer uang) {
        this.uang = uang;
    }

    public Handphone getHp() {
        return hp;
    }

    public void setHp(Handphone hp) {
        this.hp = hp;
    }

    public Handphone getHargaHp() {
        return hargaHp;
    }

    public void setHargaHp(Handphone hargaHp) {
        this.hargaHp = hargaHp;
    }
   
    public int hitungKembalian(){
        return uang.getUangCust() - hargaHp.getHargaHp();
    }
    
    public void infoTransaksi(){
        System.out.println("Nama Kasir: " +kasir.getNamaKasir());
        System.out.println("Nama Customer: " +nama.getNamaCust());
        System.out.println("Merk HP: " + hp.getMerkHp());
        System.out.println("Harga HP: " +hargaHp.getHargaHp());
        System.out.println("Uang Customer: " +uang.getUangCust());
        System.out.println("Kembalian: " +hitungKembalian());
    }
}