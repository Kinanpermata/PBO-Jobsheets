/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet3.Tugas4;

/**
 *
 * @author ASUS
 */
public class Anggota {
    public String nama;
    public String ktp;
    public int jumlahPinjaman;
    public int limitPinjaman;
    
    Anggota(String nama, String ktp, int limitPinjaman){
        this.nama = nama;
        this.ktp = ktp;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman=0;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
     public String getNama(){
        return nama;
    }
    
    public void pinjam(int pinjam){
        if (pinjam > limitPinjaman){
            System.out.println("Anda telah mencapai limit Pinjaman");
        } else{
            jumlahPinjaman += pinjam;
        }
    }
    
    public void angsur(int angsur){
        float minBunga = 0.1f * jumlahPinjaman;
        if(angsur < minBunga){
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        } else{
            jumlahPinjaman -= angsur;
        }
    }
    
    public int getJumlahPinjaman(){
        return jumlahPinjaman;
    }
    
    public int getLimitPinjaman(){
        return limitPinjaman;
    }
}