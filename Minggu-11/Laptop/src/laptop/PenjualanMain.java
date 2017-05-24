package laptop;

import java.util.Scanner;
public class PenjualanMain {
     public static void main(String[] args) {
        Laptop lap = new Laptop();
        Scanner input = new Scanner(System.in);
        int n;
        
        int beli;
        int harga;
        do{
        System.out.println("DAFTAR HARGA LAPTOP GAMING TERBAIK TAHUN INI : \n");
        System.out.println("1. ASUS ROG GX700");
        System.out.println("2. ACER PREDATOR 21X");
        System.out.println("3. MSI GT83VR TITAN SLI"); 
        System.out.println("4. DELL ALIENWARE");
        System.out.println("5. DISKON BULAN INI");
        System.out.println("6. PEMBELIAN");
        System.out.println("7. KELUAR");
        System.out.print("Masukkan Pilihan Anda : ");
         n = input.nextInt();
        if(n == 1){
            System.out.println(lap.getMerek1());
            
        }
        if(n == 2){
            System.out.println(lap.getMerek2());
           
        }
        if(n == 3){
            System.out.println(lap.getMerek3());
           
        }
        if(n == 4){
            System.out.println(lap.getMerek4());
            
        }
        if(n == 5){
            System.out.println(lap.Diskon());
            
        }
         if(n == 6){
            
            System.out.print("MEREK LAPTOP GAMING YANG DI BELI : ");
            beli=input.nextInt();
            System.out.print("UANG YANG DI BAYARKAN : ");
            harga=input.nextInt();
            System.out.println("DATA PEMBELI");
            System.out.println("BARANG YANG DI BELI : "+beli);
            if ( beli == 1){
                harga=harga-79999000;
            }
            if ( beli == 2){
                harga=harga-121000000;
            }
            if ( beli == 3){
                harga=harga-75000000;
            }
            if ( beli == 4){
                harga=harga-30000000;
            }
            System.out.println("TOTAL BAYAR : "+harga);
        }
        
        }while(n!=7);
     }
}
    

