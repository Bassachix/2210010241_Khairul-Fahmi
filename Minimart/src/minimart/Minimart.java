/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minimart;
import restock.*;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Minimart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        barang saya = new barang();
        Scanner input = new Scanner(System.in);
        
        System.out.println("SILAHKAN INPUT DATA UNTUK DIPROSES");
        System.out.print("Masukkan Kode Supplier : ");
        saya.inputKodeSup(input.nextInt());
        input.nextLine();
        System.out.print("Masukkan Nama Supplier : ");
        saya.inputNamaSup(input.nextLine());
        System.out.print("Masukkan Telpon        : ");
        saya.inputTelpon(input.nextLine());
        System.out.print("Masukkan Alamat        : ");
        saya.inputAlamat(input.nextLine());
        
        System.out.print("Masukkan Kode Barang   : ");
        saya.inputKodeBarang(input.nextInt());
        input.nextLine();
        System.out.print("Masukkan Nama Barang   : ");
        saya.inputNamaBarang(input.nextLine());
        System.out.print("Masukkan Harga         : ");
        saya.inputHarga(input.nextInt());
     
        System.out.println("============================");
        System.out.println("DATA SUDAH TERBACA");
        System.out.println("Kode Supplier : "+saya.getKodeSup());
        System.out.println("Nama Supplier : "+saya.getNamaSup());
        System.out.println("Telpon        : "+saya.getTelpon());
        System.out.println("Alamat        : "+saya.getAlamat());
        
        System.out.println("Kode Barang   : "+saya.getKodeBarang());
        System.out.println("Nama Barang   : "+saya.getNamaBarang());
        System.out.println("Harga         : "+saya.getHarga());
        
    }
    
}
