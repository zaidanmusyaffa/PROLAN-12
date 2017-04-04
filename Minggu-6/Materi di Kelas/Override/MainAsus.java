class Laptop {

    public void operasi() {
        System.out.println("Laptop merupakan salah satu jenis perangkat komputer yang didesain lebih praktis");
    }
}

class Asus extends Laptop {

    @Override
    public void operasi() {
        System.out.println("Asus merupakan salah satu merek laptop");
        super.operasi();
    }
}
public class MainAsus {
    public static void main(String args[]) {
        Laptop asus = new Laptop();
        Asus asusRog = new Asus();
        asus.operasi();
        asusRog.operasi();
    }
}
