/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet7.Tugas1;

/**
 *
 * @author ASUS
 */
public class Segitiga {
    private int sudut;
    
    public int totalSudut(int sudutA){
        System.out.println("Sudut: " +sudut);
        return sudut = 180 - sudutA;
    }
    
    public int totalSudut(int sudutA, int sudutB){
        System.out.println("Sudut: " +sudut);
        return sudut = 180 - (sudutA + sudutB);
    }
    
    public int keliling(int sisiA, int sisiB, int sisiC){
        int keliling = 0;
        System.out.println("Total Keliling: " +(sisiA + sisiB + sisiC));
        return keliling;
    }
    
    public double keliling(int sisiA, int sisiB){
        double keliling;
        System.out.println("Sisi C Segitiga : " 
                + (keliling = Math.sqrt((sisiA * sisiA) + (sisiB * sisiB))));
        return keliling;
    }
    
    public static void main(String[] args) {
        Segitiga st = new Segitiga();
        
        st.totalSudut(90);
        st.totalSudut(60, 120);
        st.keliling(10, 20);
        st.keliling(12, 20, 5);
    }
}