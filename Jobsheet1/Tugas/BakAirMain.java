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
public class BakAirMain {
    public static void main(String[] args) {
        BakAir bk1 = new BakAir();
        Ember bk2 = new Ember();
        
        System.out.println("Bak Air Balok");
        bk1.setPanjangBak(10);
        bk1.setLebarBak(5);
        bk1.setTinggiBak(7);
        bk1.volumeBak();
        bk1.airTumpah(15);
        bk1.cetakStatus();
        
        System.out.println(".");
        
        System.out.println("Ember");
        bk2.setPanjangBak(10);
        bk2.setLebarBak(5);
        bk2.setTinggiBak(7);
        bk2.volumeBak();
        bk2.airTumpah(15);
        bk2.volumeEmber();
        bk2.cetakStatus();
    }   
}