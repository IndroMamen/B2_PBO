/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

/**
 *
 * @author ASUS
 */
public class Proses implements Pemesanan{
    
    @Override
    public void pesankan(){
        System.out.println("Martabak sedang di proses");
    }
    
    public void batal() {
        System.out.println("Pesanan dibatalkan");
    }
}
