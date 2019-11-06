/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPolymorphism.no1;

/**
 *
 * @author kinanpermata
 */
public class TestBayaran{
    public static void main(String[] args) {
        Pegawai m = new Manajer("Kyung", 25000000, 5000000);
        Pegawai p = new Programmer("Haru", 5000000, 300000);
        Bayaran hr = new Bayaran();
        
        System.out.println("Gaji Manajer: " +hr.hitungBayaran(m));
        System.out.println("Gaji Programmer: " +hr.hitungBayaran(p));
    }
}