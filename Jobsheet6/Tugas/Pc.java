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
public class Pc extends Komputer{
    public int ukuranMonitor;
    
    public Pc(){
        
    }
    
    public Pc(String merk, int kecProcessor, int sizeMemory, 
            String jnsProcessor, int ukuranMonitor){
        super(merk, kecProcessor, sizeMemory, jnsProcessor);
        this.ukuranMonitor = ukuranMonitor;
    }
    
    public void tampilPc(){
        super.tampilData();
        System.out.println("Ukuran Monitor: " +ukuranMonitor);
    }
}