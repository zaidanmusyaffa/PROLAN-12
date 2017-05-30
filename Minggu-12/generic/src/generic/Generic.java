package generic;


class Pengelola<T>{
    private T nik;

    public Pengelola(T nik) {

        this.nik = nik;

    }

    public void setNik(T nik) {
        this.nik = nik;
    }

    public T getNik() {
        return nik;
    }

    public void getType() {
        System.out.println("T" + nik.getClass().getName());
    }
}
public class Generic {

    public static void main(String[] args) {
        

        Pengelola<Integer> p = new Pengelola<Integer>(1011555);
        int y = p.getNik();
        System.out.println("Nama Pengelola Gaming Laptop : ");
        
        System.out.println("");
        System.out.println("-----------------------------------------");
        System.out.println("");
        
        Pengelola<String> p2 = new Pengelola<String>("1011556");
        String z = p2.getNik();
        System.out.println("NIK Pengelola : ");
        
        System.out.println("");
        System.out.println("##########################################");
        System.out.println("");
        

        Pengelola p3 = new Pengelola<String>("10115225");
        String d = (String) p3.getNik();
        System.out.println("IDENTITAS PENGELOLA");
        
    }    
}
