/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restock;
import static crud.Koneksi.koneksidb;
import java.sql.PreparedStatement;

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
    
    // CRUD
    public void simpanBarang(int tempKodeBarang, String tempNamaBarang, int tempStok, int tempHarga){
        try {
            
            String sql = "insert into barang (kode_barang, nama_barang, stok, harga) value (?, ?, ?, ?)";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setInt(1, tempKodeBarang);
            perintah.setString(2, tempNamaBarang);
            perintah.setInt(3, tempStok);
            perintah.setInt(4, tempHarga);
            perintah.executeUpdate();
            System.out.println("Data Barang Berhasil Disimpan");
            
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
            
        }
    }
    
    public void ubahBarang(int tempKodeBarang, String tempNamaBarang, int tempStok, int tempHarga){
        try {
            
            String sql = "update barang set nama_barang = ?, stok = ?, harga = ? where kode_barang = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempNamaBarang);
            perintah.setInt(2, tempStok);
            perintah.setInt(3, tempHarga);
            perintah.setInt(4, tempKodeBarang);
            perintah.executeUpdate();
            System.out.println("Data Barang Berhasil Diupdate");
            
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
            
        }
    }
    
    public void hapusBarang(int tempKodeBarang){
        try {
            
            String sql = "delete from barang where kode_barang = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setInt(1, tempKodeBarang);
            perintah.executeUpdate();
            System.out.println("Data Barang Berhasil Dihapus");
            
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
            
        }
    }
    
}
