/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restock;

/**
 *
 * @author USER
 */
public class supplier {
    
    //VARIABEL
    int kodeSup;
    String namaSup, telpon, alamat;
    
    public supplier(){} //CONSTRUCTOR 
    
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
    
}
