/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet10.Tugas;

/**
 *
 * @author kinanpermata
 */
public class Barrier implements Destroyable {
    private int strength;
    
    public Barrier(int strength) {
        this.strength = strength;
    }
    
    public void setStrength(int strength) {
        this.strength = strength;
    }
    
    public int getStrength() {
        return strength;
    }
    
    public void destroy() {
        strength -= (strength * 1/100);
    }
    
    @Override
    public void destroyed() {
        destroy();
    }
    
    public Barrier() {
    
    }
    
    public String getBarrierInfo(){
        return "\n Barrier Strenght = " +strength+"\n";
    }
}