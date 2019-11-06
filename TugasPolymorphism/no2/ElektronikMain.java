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
public class ElektronikMain {
    public static void main(String[] args) {
        Elektronik tvj = new TelevisiJadul();
        Elektronik tvm = new TelevisiModern();
        Manusia m = new Manusia();
        
        System.out.println("Televisi Jadul: ");
        m.nyalakanPerangkat(tvj);
        System.out.println("Televisi Modern: ");
        m.nyalakanPerangkat(tvm);
    }
}