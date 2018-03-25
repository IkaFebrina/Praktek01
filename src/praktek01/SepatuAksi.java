/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author User
 */
public class SepatuAksi {
    public static void main(String[] args) {
        Sepatu A = new Sepatu();
        Sepatu B = new Sepatu();
        Sepatu C = new Sepatu();
        
        A.Merk="Nike";
        A.Bahan_Sepatu="Suede";
        A.Ukuran="43";
        A.Jenis_Sepatu="Sport";
        A.Warna="Grey";
        
        B.Merk="Converse";
        B.Bahan_Sepatu="Canvas";
        B.Ukuran="39";
        B.Jenis_Sepatu="Sneakers";
        B.Warna="Black";
        
        C.Merk="Wakaii";
        C.Bahan_Sepatu="Canvas";
        C.Ukuran="40";
        C.Jenis_Sepatu="Slip On";
        C.Warna="Brown";
        
        A.cetakInfo();
        System.out.println();
        B.cetakInfo();
        System.out.println();
        C.cetakInfo();
    }
}
