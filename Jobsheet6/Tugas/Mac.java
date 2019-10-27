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
public class Mac extends Laptop{
    public String security;
    
    public Mac(){
        
    }
    
    public Mac(String merk, int kecProcessor, int sizeMemory, 
            String jnsProcessor, String jnsBaterai, String security){
        super(merk, kecProcessor, sizeMemory, jnsProcessor, jnsBaterai);
        this.security = security;
    }
    
    public void tampilMac(){
        super.tampilLaptop();
        System.out.println("Security: " +security);
    }
}