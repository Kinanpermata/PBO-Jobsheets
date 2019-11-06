/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPolymorphism.no2;

/**
 *
 * @author kinanpermata
 */
public class Manusia{
    public void nyalakanPerangkat(Elektronik perangkat){
        if (perangkat instanceof TelevisiJadul){
            System.out.println("Televisi menyala dengan kualitas kurang baik");
        } else if(perangkat instanceof TelevisiModern){
            System.out.println("Televisi menyala dengan kualitas sangat baik");
        } else{
            System.out.println("Tidak ada TV");
        }
    }
}