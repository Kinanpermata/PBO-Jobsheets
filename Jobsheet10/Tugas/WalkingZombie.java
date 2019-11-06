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
public class WalkingZombie extends Zombie{
    public WalkingZombie(int health, int level){
        this.health = health;
        this.level = level;
    }
    
    public void heal(){
        if(level == 1){
            health += (health * 20/100);
        } else if (level == 2){
            health += (health * 30/100);
        } else if (level == 3){
            health += (health * 40/100);
        }
        return;
    }
    
    public void destroyed(){
        health -= (health * 2/100);
    }
    
    public String getZombieInfo(){
        String info = "\n Walking Zombie Data = ";
        info += super.getZombieInfo()+"\n";
        return info;
    }
}