package posttest4;

import posttest3.*;
import posttest2.*;

public class Martabak {
    protected String nama;
    protected int harga;
    
    public Martabak(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }
    public String getNama() {
        return nama;
    }
    public int getHarga() {
        return harga;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    void display(){
      System.out.println("Nama           : " + this.nama);
      System.out.println("Harga          : " + this.harga);
    }
    
    void idata(){
        System.out.println("Data Martabak berhasil ditambah");
    }
    void udata(){
        System.out.println("Data Martabak berhasil diedit");
    }
    void hdata(){
        System.out.println("Data Martabak berhasil dihapus");
    }    
}
