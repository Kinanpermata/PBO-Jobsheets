/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1.Nomor2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Trapesium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float t, s1, s2;
        double luas;
        
        System.out.print("Masukkan Tinggi: ");
        t = sc.nextInt();
        System.out.print("Masukkan Panjang Sisi Sejajar 1: ");
        s1 = sc.nextInt();
        System.out.print("Masukkan Panjang Sisi Sejajar 2: ");
        s2 = sc.nextInt();
        luas = 0.5 * t * (s1+s2);
        System.out.print("Luas Trapesium: " + luas);
    }    
}