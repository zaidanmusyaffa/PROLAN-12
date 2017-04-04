class Laptop {
	public Laptop(String beroperasi) {
		this.beroperasi = beroperasi;
	}
}

class Merek extends Laptop {
	public Merek(String beroperasi) {
		super(beroperasi);
		System.out.println(beroperasi);
	}
}