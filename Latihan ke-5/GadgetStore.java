class GadgetStore extends Pembeli {
	public GadgetStore(String contact)
	{
		//super pada konstruktor
		super(contact);
	}
	//konstruktor
	public void tampildata()
	{
		System.out.println(" Nama Pembeli                : " + nama);
		System.out.println(" Status Pembeli          	 : " + status);
		System.out.println(" Jenis Kelamin          	 : " + jk);
		System.out.println(" Identitas Kontak              : " + identitas);
		System.out.println(" No.HP/Kontak Pembeli        : " + nohp);
		System.out.println(" Usia Pembeli	             : " + usia);
		System.out.println(" Merek Laptop                : " + merek);
		System.out.println(" Harga Laptop                : " + harga);
		System.out.println(" Model Laptop                : " + model);
		System.out.println(" Tahun Pembelian                : " + beli);
		System.out.println(" =================================================");
	}



	public static void main (String args[])
        {
			GadgetStore gadget = new GadgetStore("085722999612");

			System.out.println(" =================================================");
    		System.out.println("|         << Pusat Barang Elektronik >>           |");    
   			System.out.println(" =================================================");
				gadget.pembelian();
				gadget.laptop();
			System.out.println(" =================================================");
				gadget.tampildata();
				gadget.jadi();
				gadget.kontak();
        }
}