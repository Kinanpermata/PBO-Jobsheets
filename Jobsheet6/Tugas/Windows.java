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
public class Windows extends Laptop{
    public String fitur;
    
    public Windows(){
        
    }
    
    public Windows(String merk, int kecProcessor, int sizeMemory, 
            String jnsProcessor, String jnsBaterai, String fitur){
        super(merk, kecProcessor, sizeMemory, jnsProcessor, jnsBaterai);
        this.fitur = fitur;
    }
    
    public void tampilWindows(){
        super.tampilLaptop();
        System.out.println("Fitur: " +fitur);
    }
}