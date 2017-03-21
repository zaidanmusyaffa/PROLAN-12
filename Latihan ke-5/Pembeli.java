import java.util.Scanner;

public class Pembeli extends Laptop 
{
    
        Scanner input = new Scanner(System.in);
		String nama, status, identitas, nohp, contact;
		char jk;
		byte usia;

		//konstruktor
		public void pembelian()
		{
			
   			System.out.print(" Masukkan Nama Lengkap Pembeli      : ");
                    nama = input.nextLine();
			System.out.print(" Masukkan Status Pembeli 	  : ");
                    status = input.nextLine();
			System.out.print("Masukkan Jenis Kelamin (L/P): ");
					jk = input.next().charAt(0);		
			System.out.print(" Identitas Kontak \n ");
                    identitas = input.nextLine();
			System.out.print(" Masukkan No.HP Pembeli     : ");
                    nohp = input.nextLine();		
			System.out.print(" Masukkan Usia Pembeli      : ");
                    usia = input.nextByte();		
		}

		public void jadi()
		{
				System.out.print(" Apakah anda yakin ingin membeli laptop ini ? ");
					//super pada atribut
					super.membeli = input1.nextBoolean();

				if(membeli == true)
				{
					
						System.out.println("\n| Pembeli atas nama "+ nama +" telah membeli laptop"+ merek);
						//super pada method
						super.keterangan();
				
				}else
				{
					System.out.println(" Anda tidak jadi membeli laptop "+ merek);
				}	
		}

		Pembeli(String contact)
    	{
    		this.contact = contact;
    	}

    	public void kontak()
    	{
    		System.out.println(" ");
    		System.out.println("  PT. GUDANG GADGET || " +contact);
    	}

}