/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet4.Percobaan1;

/**
 *
 * @author ASUS
 */
public class Laptop {
    private String merk;
    private Processor proc;
    
    Laptop(){
        
    }
    
    Laptop(String merk, Processor proc){
        this.merk = merk;
        this.proc = proc;
    }
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    public void setProcessor(Processor proc){
        this.proc = proc;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public Processor getProcessor(){
        return proc;
    }
    
    public void info(){
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }
}
