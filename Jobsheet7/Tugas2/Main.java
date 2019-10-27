/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet7.Tugas2;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Manusia mn = new Manusia();
        Dosen ds = new Dosen();
        Mahasiswa mh = new Mahasiswa();
        
        System.out.println("==Manusia==");
        mn.bernafas();
        mn.makan();
        
        System.out.println("==Dosen==");
        ds.makan();
        ds.lembur();
        
        System.out.println("==Mahasiswa==");
        mh.makan();
        mh.tidur();
    }   
}