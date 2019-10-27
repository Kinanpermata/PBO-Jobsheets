/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet6.Percobaan1;

/**
 *
 * @author ASUS
 */
public class ClassB extends ClassA{
    public int z;
    
    public void getNilaiZ(){
        System.out.println("nilai z: " +z);
    }
    
    public void getJumlah(){
        System.out.println("jumlah: " +(x+y+z));
    }
}