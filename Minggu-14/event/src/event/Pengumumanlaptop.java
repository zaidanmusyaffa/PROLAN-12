package Event;


public class Pengumumanlaptop <T> extends Sprinttask{

   
   
    public <T> void pengumumandiskon(T pengumuman){
        String diskon="Diskon Ramadhan Kolek dengan pembelian item1 , item 2 dan item3 sebesar 10%";
        System.out.println(pengumuman);    
    }  
     public <T> void pengumumanevent(T pengumuman){
        String event="EVENT double EXP akan di lanjutkan pada tanggal 15 juni 2017";
        System.out.println(pengumuman);    
    }
      public void maintenance(){
        String tenance="Maintenance di laksanakan seminggu sekali pada hari senin jam 15.30- jam 17.00";
        System.out.println(tenance);    
    }
      private static <T> Sprinttask Namalaptop(T nb){
        return (Sprinttask) nb;
    }  
}
