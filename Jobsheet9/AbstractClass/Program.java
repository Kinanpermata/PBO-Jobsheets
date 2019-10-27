/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet9.AbstractClass;

/**
 *
 * @author ASUS
 */
public class Program{
    public static void main(String[] args){
        Kucing kucingKampung = new Kucing();
        Ikan lumbalumba = new Ikan();
        
        Orang ani = new Orang("Ani");
        Orang budi = new Orang("Budi");
        
        ani.peliharaanHewan(kucingKampung);
        budi.peliharaanHewan(lumbalumba);
        
        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
}