import java.util.Scanner;
public class Laptop {
        Scanner input1 = new Scanner(System.in);
		String merek, harga, model; 
        short beli;

        boolean membeli;

    	//konstruktor
    	public void laptop()
    	{
    		System.out.print(" Masukkan Merek Laptop          : ");
		        merek = input1.nextLine();
		    System.out.print(" Masukkan Harga Laptop         : ");
		        harga = input1.nextLine();
		    System.out.print(" Masukkan Model Laptop     : ");
		        model = input1.nextLine();
		    System.out.print(" Masukkan Tahun Pembelian       : ");
		        beli = input1.nextShort();
    	}

    	//konstruktor
    	public void keterangan()
    	{
    		System.out.println("| Semoga bermanfaat dan menggunakannya dengan baik dan benar ");
    		System.out.println("| Terima Kasih ");
    	}

    	
	}    