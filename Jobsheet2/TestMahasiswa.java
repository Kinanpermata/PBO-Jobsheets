/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet2;

/**
 *
 * @author ASUS
 */
public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();
        
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
        
        mhs2.nim = 102;
        mhs2.nama = "Budi";
        mhs2.alamat = "Jl. Vinolia No 2A";
        mhs2.kelas = "1A";
        mhs2.tampilBiodata();
        
        mhs3.nim = 102;
        mhs3.nama = "Agus";
        mhs3.alamat = "Jl. Vinolia No 3A";
        mhs3.kelas = "1A";
        mhs3.tampilBiodata();
    }
}