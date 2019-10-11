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
public class Ember extends BakAir {
    public int volEmber;
    
    public void volumeEmber() {
        volEmber = volBak2;
    }
    
    public void cetakStatus() {
        System.out.println("Volume Ember: " + volEmber);
    }
}
