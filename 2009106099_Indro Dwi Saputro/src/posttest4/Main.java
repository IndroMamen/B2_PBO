package posttest4;
import posttest3.*;
import posttest2.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 

public class Main{
    static ArrayList<Martabak> martabak = new ArrayList<Martabak>();
    static ArrayList<Asin> asin = new ArrayList<>();
    static ArrayList<Manis> manis = new ArrayList<>();
    
    public static void main(String[] args)throws Exception {
        
      while(true){
          menu();
      }
    }  
   public static void menu() throws IOException{
       InputStreamReader home = new InputStreamReader(System.in);
       BufferedReader input = new BufferedReader(home);
            System.out.println("");
            System.out.println("========Data Menu Martabak========");
            System.out.println("----------------------------------------------------");
            System.out.println("1. Masukkan Data Martabak");
            System.out.println("2. Lihat Data Martabak"); 
            System.out.println("3. Ubah Data Martabak");
            System.out.println("4. Hapus Data Martabak");
            System.out.println("5. EXIT");
            System.out.println("----------------------------------------------------");
            System.out.println("Pilih[1-5] = ");
        int pilih = Integer.valueOf(input.readLine());
            switch (pilih){
            case 1:
                    idata();
                    break;
            case 2:
                    ldaftar();
                    break;
            case 3:
                    udata();
                    break;
            case 4:
                    hdata();
                    break;
            case 5:
                    backmenu();
                    break;
            default:
                menu(); 
            } 
        }

public static void idata() throws IOException{
            InputStreamReader tambah = new InputStreamReader(System.in);
            BufferedReader input = new BufferedReader(tambah);
            
            String nama;
            int harga;
            int pilihan;
            
    System.out.println("1. Asin");
    System.out.println("2. Manis");
    System.out.println("Masukan pilihan : ");
    pilihan = Integer.parseInt(input.readLine());
    if (pilihan == 1) {
        System.out.println("Masukan nama : ");
        nama = input.readLine();
        System.out.println("Masukan Harga : ");
        harga = Integer.parseInt(input.readLine());
        System.out.println("Masukan Rasa : ");
        String rasa = input.readLine();
        System.out.println("Masukan Ukuran : ");
        String ukuran = input.readLine();
        asin.add(new Asin(nama, harga, rasa, ukuran));
        } else {
        if (pilihan == 1) {
        System.out.println("Masukan nama : ");
        nama = input.readLine();
        System.out.println("Masukan Harga : ");
        harga = Integer.parseInt(input.readLine());
        System.out.println("Masukan Rasa : ");
        String rasa = input.readLine();
        System.out.println("Masukan Ukuran : ");
        String ukuran = input.readLine();
        manis.add(new Manis(nama, harga, rasa, ukuran));
        }
        /*itempick.setNamaItem(nama_item);
        itempick.setRarityItem(rarity_item);
        itempick.amount_item = amount_item;
        itempick.level_item = level_item;*/

}           
}

public static void ldaftar()throws IOException{    
    InputStreamReader tambah = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(tambah);
    int pilihan;
    System.out.println("1. Martabak Asin");
    System.out.println("2. Martabak Manis");
    System.out.println("Masukan pilihan : ");
    pilihan = Integer.parseInt(input.readLine());
    if (pilihan == 1) {
                        for (int i = 0; i < asin.size(); i++) {
                            System.out.println("Martabak Asin ke - " + (i + 1));
                            asin.get(i).display();
                        }
                    } else {
                        for (int i = 0; i < manis.size(); i++) {
                            System.out.println("Martabak Manis ke - " + (i + 1));
                            manis.get(i).display();
                        }
                    }

            }

public static void udata()throws IOException{
    InputStreamReader tambah = new InputStreamReader (System.in);
    BufferedReader input = new BufferedReader (tambah);
    int pilihan;
    String nama;
    int harga;
    String rasa;
    String ukuran;
    ldaftar();
    System.out.println("1. Martabak Asin");
    System.out.println("2. Martabak Manis");
    System.out.println("Masukan pilihan : ");
    pilihan = Integer.parseInt(input.readLine());
    System.out.println("Ubah Data Martabak");
    if (pilihan == 1) {
                        System.out.println("Masukan nama martabak : ");
                        nama = input.readLine();
                        for (Asin i : asin) {
                            if (i.getNama().equals(nama)) {
                                System.out.println("Masukan nama baru : ");
                                i.setNama(input.readLine());
                                System.out.println("Masukan harga baru : ");
                                i.setHarga(Integer.parseInt(input.readLine()));
                                System.out.println("Masukan rasa baru : ");
                                i.setRasa(input.readLine());
                                System.out.println("Masukan ukuran baru : ");
                                i.setUkuran(input.readLine());
                            }
                        }
                    } else {
                        System.out.println("Masukan nama Martabak : ");
                        nama = input.readLine();
                        for (Manis i : manis) {
                            if (i.getNama().equals(nama)) {
                                System.out.println("Masukan nama baru : ");
                                i.setNama(input.readLine());
                                System.out.println("Masukan harga baru : ");
                                i.setHarga(Integer.parseInt(input.readLine()));
                                System.out.println("Masukan rasa baru : ");
                                i.setRasa(input.readLine());
                                System.out.println("Masukan ukuran baru : ");
                                i.setUkuran(input.readLine());
                            }
                        }
                    }
}

public static void hdata() throws IOException{
    ldaftar();
    InputStreamReader tambah = new InputStreamReader (System.in);
    BufferedReader input = new BufferedReader (tambah);
    int pilihan;
    int t;
    System.out.println("1. Martabak Asin");
    System.out.println("2. Martabak Manis");
    System.out.println("Masukan pilihan : ");
    pilihan = Integer.parseInt(input.readLine());
    if (pilihan == 1) {
        System.out.println("input Slot index = ");
        t = Integer.parseInt(input.readLine());
        t--;
    
        asin.get(t).hdata();
        asin.remove(t);
    } else {
    System.out.println("input Slot index = ");
    t = Integer.parseInt(input.readLine());
    t--;
    
    manis.get(t).hdata();
    manis.remove(t);

    }
}

public static void backmenu() throws IOException{
    InputStreamReader tambah = new InputStreamReader (System.in);
    BufferedReader input = new BufferedReader(tambah);
    
    int a;
    System.out.println("Terimakasih");
    System.out.println("Tekan 1 lalu Tekan ENTER untuk melanjutkan");
    a = Integer.parseInt(input.readLine());
    menu();
    }



} 