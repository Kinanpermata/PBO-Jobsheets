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
public abstract class Zombie implements Destroyable{
    protected int health;
    protected int level;
    
    public abstract void heal();
    public abstract void destroyed();
    
    public String getZombieInfo(){
        return "\n Health = "+health+"\n Level ="+level+"\n";
    }
}