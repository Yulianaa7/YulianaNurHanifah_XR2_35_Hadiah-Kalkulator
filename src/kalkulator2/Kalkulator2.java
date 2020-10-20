/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator2;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class Kalkulator2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //deklarasi variabel
        int pilih, pilihan, nilai1, nilai2;
        double hasil;
        
        Scanner input=new Scanner (System.in);
        System.out.println ("KALKULATOR SEDERHANA");
        System.out.println ("Berapakah angka yang akan anda masukkan ?");
        
        System.out.println ("1. Penjumlahan");
        System.out.println ("2. Pengurangan");
        System.out.println ("3. Perkalian");
        System.out.println ("4. Pembagian");
        System.out.println ("5. Modulus");
        System.out.print("Masukkan Pilihan Anda : ");
        pilih=input.nextInt ();
        
        //input user
        System.out.print("Masukan Angka Pertama : ");
        nilai1=input.nextInt ();
        System.out.print("Masukan Angka Kedua : ");
        nilai2=input.nextInt ();
        
        //percabangan
        switch(pilih) {
            case 1:
            hasil=nilai1+nilai2;
            System.out.println ("Hasilnya Adalah = "+hasil);
            break;
            case 2:
            hasil=nilai1-nilai2;
            System.out.println ("Hasilnya adalah = "+hasil);
            break;
            case 3:
            hasil=nilai1*nilai2;
            System.out.println("Hasilnya Adalah = "+hasil);
            break;
            case 4:
            hasil=nilai1/nilai2;
            System.out.println("Hasilnya adalah = "+hasil);
            break;
            case 5:
            hasil = nilai1%nilai2;
            System.out.println("Hasilnya adalah = "+hasil);
            break;
            default:
            System.out.println("Silahkan cek lagi operator diatas");
            break;
}
}
}
    
    

