public class Komputer{
	public static void main(String[] args){
		Komputer method = new Komputer();
		method.fungsi("Komputer");
		method.fungsi("Komputer","Mengoperasikan Program");
	}
	
	private void fungsi(String nama){
		System.out.println(nama);
	}
	
	private void fungsi(String nama1, String nama2){
		System.out.println(nama1+nama2);
	}
}