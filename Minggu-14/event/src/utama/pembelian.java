package Utama;




 class pembelianLaptop <T>{

    public T pembelian_laptop;

    
  

public int pembelianlaptop(int hasil){

    if ( hasil > 5000000){
        hasil=hasil-100000;
        }
    return hasil;
}

public int metodepembayaran(int hasil){
         System.out.println("1.Tunai (pembayaran anda kurang dari 5.000.000");
        System.out.println("2.Kredit (pembayaran anda lebih dari 5.000.000");


        if(hasil < 5000000){
            System.out.println("Anda bisa melakukan pembayaran tunai, silahkan bayar di tempat");
            }
        else {
            System.out.println("anda melakukan credit");
            hasil = hasil / 6; 
            
            System.out.println("kredit anda/bulan = "+hasil);
        }
        return hasil;
}    

public T sambutan(){
    System.out.println("Anda memasuki pembayaran");    

    return pembelian_laptop;
    }
}



    
