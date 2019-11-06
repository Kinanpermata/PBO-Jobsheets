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
public class JumpingZombie extends Zombie{
    public JumpingZombie(int health, int level){
        this.health = health;
        this.level = level;
    }
    
    public void heal(){
        if(level == 1){
            health += (health * 30/100);
        } else if (level == 2){
            health += (health * 40/100);
        } else if (level == 3){
            health += (health * 50/100);
        }
        return;
    }
    
    public void destroyed(){
        health -= (health * 1/100);
    }
    
    public String getZombieInfo(){
        String info = "\n Walking Zombie Data = ";
        info += super.getZombieInfo()+"\n";
        return info;
    }
}