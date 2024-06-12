/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restock;
import crud.Koneksi;
import java.sql.PreparedStatement;

/**
 *
 * @author USER
 */
public class supplier {
    
    private Koneksi conn;
    
    // VARIABEL
    int kodeSup;
    String namaSup, telpon, alamat;
    
    public supplier(){
        if (Koneksi.koneksidb == null) {
            conn = new Koneksi();            
        }
    } //CONSTRUCTOR 
    
    // METHOD
    public void inputKodeSup(int kodeSup) {
        this.kodeSup = kodeSup;
    }
    public int getKodeSup() {
        return this.kodeSup;
    }
    
    public void inputNamaSup(String namaSup) {
        this.namaSup = namaSup;
    }
    public String getNamaSup() {
        return this.namaSup;
    }
    
    public void inputTelpon(String telpon) {
        this.telpon = telpon;
    }
    public String getTelpon() {
        return this.telpon;
    }
    
    public void inputAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getAlamat() {
        return this.alamat;
    }
    
    // CRUD
    public void simpanSupplier(int tempKodeSupplier, String tempNamaSupplier, String tempTelpon, String tempAlamat){
        try {
            
            String sql = "insert into supplier (kode_sup, nama_sup, telpon, alamat) value (?, ?, ?, ?)";
            PreparedStatement perintah = Koneksi.koneksidb.prepareStatement(sql);
            perintah.setInt(1, tempKodeSupplier);
            perintah.setString(2, tempNamaSupplier);
            perintah.setString(3, tempTelpon);
            perintah.setString(4, tempAlamat);
            perintah.executeUpdate();
            System.out.println("Data Supplier Berhasil Disimpan");
            
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
            
        }
    }
    
    public void ubahSupplier(int tempKodeSupplier, String tempNamaSupplier, String tempTelpon, String tempAlamat){
        try {
            
            String sql = "update supplier set nama_sup = ?, telpon = ?, alamat = ? where kode_sup = ?";
            PreparedStatement perintah = Koneksi.koneksidb.prepareStatement(sql);
            perintah.setString(1, tempNamaSupplier);
            perintah.setString(2, tempTelpon);
            perintah.setString(3, tempAlamat);
            perintah.setInt(4, tempKodeSupplier);
            perintah.executeUpdate();
            System.out.println("Data Supplier Berhasil Diupdate");
            
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
            
        }
    }
    
    public void hapusSupplier(int tempKodeSupplier){
        try {
            
            String sql = "delete from supplier where kode_sup = ?";
            PreparedStatement perintah = Koneksi.koneksidb.prepareStatement(sql);
            perintah.setInt(1, tempKodeSupplier);
            perintah.executeUpdate();
            System.out.println("Data Supplier Berhasil Dihapus");
            
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
            
        }
    }
    
}
