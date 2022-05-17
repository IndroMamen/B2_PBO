/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

import posttest5.*;
import posttest4.*;

/**
 *
 * @author ACER
 */
final class Manis extends Martabak{
  private final String nama;
  private String rasa;
  private String ukuran;
  
  public Manis(String nama, int harga, String rasa, String ukuran){
      super(nama, harga);
      this.nama = nama;
      this.rasa = rasa;
      this.ukuran = ukuran;
  }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }
    
        @Override
  public void display(){
      System.out.println("Nama           : " + this.nama);
      System.out.println("Harga          : " + this.harga);
      System.out.println("Rasa           : " + this.rasa);
      System.out.println("Ukuran         : " + this.ukuran);
      pesan();
}
  
  protected void pesan(){
      System.out.println("Martabak sudah di pesan");
  }
  
  public void pembeli(){
      System.out.println("Martabak Dibeli oleh orang");
  }
  public void pembeli(String orang){
      System.out.println("Martabak Dibeli oleh   : "+orang);
  }

  
}


