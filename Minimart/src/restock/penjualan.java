/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restock;

import static crud.Koneksi.koneksidb;
import java.sql.Date;
import java.sql.PreparedStatement;

/**
 *
 * @author USER
 */
public class penjualan {

    public penjualan(){}
    
    public void simpanPenjualan(int tempNoKeluar, String tempTglKeluarStr, int tempJumlah, int tempTotal, int tempKodeBar, int tempKodePelanggan){
        try {
            
            Date tempTglKeluar = Date.valueOf(tempTglKeluarStr);
            String sql = "insert into penjualan (no_keluar, tgl_keluar, jumlah, total, kode_barang, kode_pelanggan) value (?, ?, ?, ?, ?, ?)";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setInt(1, tempNoKeluar);
            perintah.setDate(2, tempTglKeluar);
            perintah.setInt(3, tempJumlah);
            perintah.setInt(4, tempTotal);
            perintah.setInt(5, tempKodeBar);
            perintah.setInt(6, tempKodePelanggan);
            perintah.executeUpdate();
            System.out.println("Data Penjualan Berhasil Disimpan");
            
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
            
        }
    }
    
   public void ubahPenjualan(int tempNoKeluar, String tempTglKeluarStr, int tempJumlah, int tempTotal, int tempKodeBar, int tempKodePelanggan){
        try {
            
            Date tempTglKeluar = Date.valueOf(tempTglKeluarStr);
            String sql = "update penjualan set tgl_keluar = ?, jumlah = ?, total = ?, kode_barang = ?, kode_pelanggan = ? where no_keluar = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setDate(1, tempTglKeluar);
            perintah.setInt(2, tempJumlah);
            perintah.setInt(3, tempTotal);
            perintah.setInt(4, tempKodeBar);
            perintah.setInt(5, tempKodePelanggan);
            perintah.setInt(6, tempNoKeluar);
            perintah.executeUpdate();
            System.out.println("Data Penjualan Berhasil Diupdate");
            
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
            
        }
    }
    
    public void hapusPenjualan(int tempNoKeluar){
        try {
            
            String sql = "delete from penjualan where no_keluar = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setInt(1, tempNoKeluar);
            perintah.executeUpdate();
            System.out.println("Data Penjualan Berhasil Dihapus");
            
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
            
        }
    }
    
}
