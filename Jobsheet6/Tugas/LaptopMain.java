/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet6.Tugas;

/**
 *
 * @author ASUS
 */
public class LaptopMain {
    public static void main(String[] args) {
        
        //Mac
        Mac MC = new Mac("Macbook Pro 2018", 64, 1000, "Intel 6", "Lithium", "Avast");
        MC.tampilMac();
        
        //Windows
        Windows WD = new Windows("Windows 10", 64, 1000, "Intel i5", "Lithium", "Super Battery");
        WD.tampilWindows();
                
        //Pc
        Pc PC = new Pc("Logitech", 64, 1000, "Intel i5", 24);
        PC.tampilPc();
    }
}