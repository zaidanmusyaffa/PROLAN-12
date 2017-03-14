public class Merek {
	public static void main(String[] args) {
		Merek method = new Merek();
		method.merekTerkenal();
		System.out.println(method.merekLaptop());
	}
	
	private void merekTerkenal() {
		System.out.println("Acer,Asus,Samsung");
		}
	private int merekLaptop() {
		return 1;
		}
}