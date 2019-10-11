/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet2.Tugas2;

/**
 *
 * @author ASUS
 */
public class VideoGame {
    public int id;
    public String namaMember;
    public String namaGame;
    public int harga;
    public int lamaSewa;
    public int totalHarga;
    
    public int totalHarga(){
        totalHarga = harga * lamaSewa;
        return totalHarga;
    }
    
    public void tampilData(){
        System.out.println("ID: " +id);
        System.out.println("Nama Member: " +namaMember);
        System.out.println("Nama Game: " +namaGame);
        System.out.println("Harga Game: Rp. " +harga);
        System.out.println("Lama Sewa: " +lamaSewa);
        System.out.println("Total Harga: Rp. " +totalHarga());
    }
}