package laptop;

public class Laptop implements listMerek {
    int hasil;
    int merek1;
    int merek2;
    int merek3;
    int merek4;
     @Override
    public int getMerek1() {
        merek1=79999000;
        System.out.println(merek1);
        return 0;
    }
     @Override
    public int getMerek2() {
        merek2=121000000;
        System.out.println(merek2);
       return 0;
    }
     @Override
    public int getMerek3() {
        merek3=75000000;
        System.out.println(merek3);
        return 0;
    }
    @Override 
    public int getMerek4() {
        merek4=30000000;
        System.out.println(merek4);
        return 0;
    }
    @Override
    public int Diskon(){
         hasil=100000+100000;
        System.out.print("DISKON BULAN INI SEBESAR ..... : "+hasil);
       
         return 0;
    }
}

    
   

