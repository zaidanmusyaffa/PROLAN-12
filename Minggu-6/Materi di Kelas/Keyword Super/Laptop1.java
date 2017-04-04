class Laptop1 {
	protected void beroperasi() {
		System.out.println("Laptop bisa beroperasi");
	}
}

class Merek1 extends Laptop1 {
	@Override 
	public void beroperasi() {
		super.beroperasi();
	}
}