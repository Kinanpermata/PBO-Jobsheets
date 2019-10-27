/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1.Nomor1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Lingkaran {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float r;
        double luas;
        
        do {
            System.out.print("Masukkan Jari-jari: ");
            r = sc.nextFloat();
            luas = 3.14 * r * r;
            System.out.println("Luas Lingkaran: " + luas);
            if(r<0){
                break;
            }
        } while (r>0);
        
    }
}