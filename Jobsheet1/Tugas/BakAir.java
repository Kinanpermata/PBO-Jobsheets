/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet1.Tugas;

/**
 *
 * @author ASUS
 */
public class BakAir {
    private int pBak;
    private int lBak;
    private int tBak;
    public int volBak, volBak2;
        
    public void setPanjangBak(int newValue){
        pBak = newValue;
    }
    
    public void setLebarBak(int newValue){
        lBak = newValue;
    }
    
    public void setTinggiBak(int newValue){
        tBak = newValue;
    }
    
    public void volumeBak(){
        volBak = pBak * lBak * tBak;
    }
    
    public void airTumpah (int decrement) {
       volBak2 = volBak - decrement;
    }
    
    public void cetakStatus(){
        System.out.println("Panjang Bak Air Balok = " +pBak);
        System.out.println("Lebar Bak Air Balok = " +lBak);
        System.out.println("Tinggi Bak Air Balok = " +tBak);
        System.out.println("Volume Bak Air Balok = " +volBak);
        System.out.println("Volume Bak Air Setelah Tumpah = " +volBak2);
    }
}