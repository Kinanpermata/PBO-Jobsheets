/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet1.SepedaDemo;

/**
 *
 * @author ASUS
 */
public class SepedaDemo {
    public static void main(String[] args) {
        //Buat dua objek sepeda
        Sepeda spd1 = new Sepeda();
        Sepeda spd2 = new Sepeda();
        SepedaGunung spd3 = new SepedaGunung();
        
        //Panggil menthod didalam objek sepeda
        spd1.setMerek("Polygone");
        spd1.setWarna("Hitam");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.cetakStatus();
        
        spd2.setMerek("Wim Cycle");
        spd2.setWarna("Putih");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.cetakStatus();
        
        spd3.setMerek("Klinee");
        spd3.tambahKecepatan(5);
        spd3.gantiGear(7);
        spd3.setTipeSupensi("Gas suspension");
        spd3.cetakStatus();
    }
}