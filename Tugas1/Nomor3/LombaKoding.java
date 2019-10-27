/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1.Nomor3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class LombaKoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tinggiBadan, beratBadan;
        
        do{
            System.out.print("Masukkan Tinggi: ");
            tinggiBadan = sc.nextInt();
            System.out.print("Masukkan Berat badan: ");
            beratBadan = sc.nextInt();
            
            if(tinggiBadan <= 0 && beratBadan <=0){
                break;
            }
            
            if(tinggiBadan <= 150){
                System.out.println("1 M");
            } else if (tinggiBadan > 170 && beratBadan >60 && beratBadan <= 80){
                System.out.println("3 XL");
            } else if (tinggiBadan > 150 && tinggiBadan <= 170 && beratBadan <= 80){
                System.out.println("2 L");
            } else if (tinggiBadan > 150 && tinggiBadan <= 170 && beratBadan >= 80){
                System.out.println("3 XL");
            } else if (tinggiBadan > 170 && beratBadan <= 60){
                System.out.println("2 L");
            } else{
                System.out.println("4 Tidak ada");
            }     
        } while (true);
    }   
}