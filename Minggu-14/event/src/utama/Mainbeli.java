package Utama;

import Event.Pengumumanlaptop;

import java.util.Scanner;
public class Mainbeli{

    public static void main(String[] args){
		
        pembelianLaptop <Integer> beli = new pembelianLaptop <>();
	Pengumumanlaptop <String> event = new Pengumumanlaptop<>();
        Scanner input = new Scanner (System.in);
        System.out.println("MENU PEMBAYARAN");
        System.out.print("Masukkan jumlah pembayaran : ");
        int hasil = input.nextInt();
        beli.pembelianlaptop(hasil);
        beli.metodepembayaran(hasil);
        event.maintenance();
    }

    
}

