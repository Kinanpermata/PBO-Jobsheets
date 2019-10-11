/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet2.Tugas3;

/**
 *
 * @author ASUS
 */
public class Lingkaran {
    public double phi = 3.14;
    public double r;
    public double luas;
    public double keliling;
    
    public double hitungLuas(){
        luas = phi * r * r;
        return luas;
    }
    
    public double hitungKeliling(){
        keliling = phi * 2 *r;
        return keliling;
    }
    
    public void tampilLingkaran(){
        System.out.println("Jari-Jari: " +r+ "cm");
        System.out.println("Luas: " +hitungLuas()+ "cm");
        System.out.println("Keliling: " +hitungKeliling()+ "cm");
    }
}