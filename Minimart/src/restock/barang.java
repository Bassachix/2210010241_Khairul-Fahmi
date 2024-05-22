/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restock;

/**
 *
 * @author USER
 */
public class barang extends supplier{
    
    //VARIABEL
    int kodeBarang, harga;
    String namaBarang;
    
    public barang(){}   //CONSTRUCTOR 
    
    // METHOD
    public void inputKodeBarang(int kodeBarang) {
        this.kodeBarang = kodeBarang;
    }
    public int getKodeBarang() {
        return this.kodeBarang;
    }
    
    public void inputNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
    public String getNamaBarang() {
        return this.namaBarang;
    }
    
    public void inputHarga(int harga) {
        this.harga = harga;
    }
    public int getHarga() {
        return this.harga;
    }
    
}
