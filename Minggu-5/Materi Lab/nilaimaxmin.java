import java.util.Scanner;

public class nilaimaxmin{
	
	int[] data;
	
	void pilihanA(int i){
		int min=1000;
		if(data[i]<min){
		min=data[i];
		}
	
	
		
		System.out.println("Nilai min adalah = "+min);
		}
	void pilihanB(int i){
		int max =0;
		if(data[i]>max){
		max=data[i];
        }
    
		
		System.out.println("Nilai max adalah = "+max);
		}

	public static void main(String[] args){
		int min=1000;
			nilaimaxmin pilih = new nilaimaxmin();
			Scanner input = new Scanner (System.in);
			System.out.print("Masukkan jumlah data : ");
			int n = input.nextInt();
			System.out.print("Masukkan pilihan : ");
			char pilihan = input.next().charAt(0);
			int[] data = new int[n];
	
			for (int i=0;i<n;i++){
			data[i]=input.nextInt();
			if(pilihan == 'A'){
			pilih.pilihanA(i);
			}
			
			if(pilihan == 'B'){
			pilih.pilihanB(i);
			}
		}
	}
}
