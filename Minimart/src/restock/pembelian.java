/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restock;

import static crud.Koneksi.koneksidb;
import java.sql.PreparedStatement;
import java.sql.Date;

/**
 *
 * @author USER
 */
public class pembelian {
    
    public pembelian(){} //CONSTRUCTOR 
    
    public void simpanPembelian(int tempNoMasuk, String tempTglMasukStr, int tempKodeSup, int tempKodeBar, int tempJumlah, int tempTotal){
        try {
            
            Date tempTglMasuk = Date.valueOf(tempTglMasukStr);
            String sql = "insert into pembelian (no_masuk, tgl_masuk, kode_sup, kode_barang, jumlah, total) value (?, ?, ?, ?, ?, ?)";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setInt(1, tempNoMasuk);
            perintah.setDate(2, tempTglMasuk);
            perintah.setInt(3, tempKodeSup);
            perintah.setInt(4, tempKodeBar);
            perintah.setInt(5, tempJumlah);
            perintah.setInt(6, tempTotal);
            perintah.executeUpdate();
            System.out.println("Data Pembelian Berhasil Disimpan");
            
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
            
        }
    }
    
    public void ubahPembelian(int tempNoMasuk, String tempTglMasukStr, int tempKodeSup, int tempKodeBar, int tempJumlah, int tempTotal){
        try {
            
            Date tempTglMasuk = Date.valueOf(tempTglMasukStr);
            String sql = "update pembelian set tgl_masuk = ?, kode_sup = ?, kode_barang = ?, jumlah = ?, total = ? where no_masuk = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setDate(1, tempTglMasuk);
            perintah.setInt(2, tempKodeSup);
            perintah.setInt(3, tempKodeBar);
            perintah.setInt(4, tempJumlah);
            perintah.setInt(5, tempTotal);
            perintah.setInt(6, tempNoMasuk);
            perintah.executeUpdate();
            System.out.println("Data Pembelian Berhasil Diupdate");
            
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
            
        }
    }
    
    public void hapusPembelian(int tempNoMasuk){
        try {
            
            String sql = "delete from pembelian where no_masuk = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setInt(1, tempNoMasuk);
            perintah.executeUpdate();
            System.out.println("Data Pembelian Berhasil Dihapus");
            
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
            
        }
    }
    
}
