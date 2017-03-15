import java.util.Scanner;
public class IPMahasiswa {
	
	public static void main(String[] args) {
		IPMahasiswa ipmhs = new IPMahasiswa();
	
		Scanner input = new Scanner (System.in);
		float ip;
		int jmlMhs = 0, jmlMhsLls = 0;
		System.out.println("Masukkan IP : ");
		ip = input.nextFloat();
		while (ip != -999) {
			if (ipmhs.isWithinRange(ip, 0, 4) == 1) {
				jmlMhs++;
			}
			if (ip >= 2.75) {
				jmlMhsLls++;
			}
			System.out.print("Masukkan IP: ");
			ip = input.nextFloat();
		}
		
		
		System.out.println("Jumlah Mahasiswa adalah : " + jmlMhs);
		System.out.println("Jumlah Mahasiswa Lulus adalah : " + jmlMhsLls);
	}
		
		int isWithinRange(float X, int min, int max){
			if (X >= min && X <= max) {
				return 1;
			} else {
				return 0;
			}
		}
}
