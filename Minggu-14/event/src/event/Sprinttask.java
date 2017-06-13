package Event;


public class Sprinttask {
    int harga1=5000000;
    int harga2=5000000;
    int harga3=5000000;
    String MerekLaptop;

    public <T> void merek1(T merek1){
        
        harga1/=5;
        System.out.println(merek1);
        
    }  
    public <T> void merek2 (T merek2){
       
        harga2/=5;
        System.out.println(merek2);
    }  
    public <T> void merek3(T merek3){
       
        harga3/=5;
        System.out.println(merek3);
    }   
      
    public static <T,N> void Sprinttask(T item1,T item2,T item3,N hasil){
        System.out.println(hasil);
    }
   public void setMerekLaptop(String mereklaptop){
       this.MerekLaptop = mereklaptop;
   }
}
