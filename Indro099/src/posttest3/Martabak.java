package posttest3;

import posttest2.*;

public class Martabak {
    private String nama;
    private int harga;
    
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
