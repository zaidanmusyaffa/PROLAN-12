
package laptop;
import java.util.Scanner;
public class PenjualanMain {
    
     public static void main(String[] args) {
        Laptop enk = new Laptop();
        Scanner input = new Scanner(System.in);
        System.out.println("Merek yang tersedia");
        System.out.println("1. ASUS");
        System.out.println("2. ACER");
        System.out.println("3. HP"); 
        System.out.println("4. DELL");
        System.out.print("masukkan Pilihan Anda : ");
        int n = input.nextInt();
        if(n == 1){
            enk.getASUS();
        }
        if(n == 2){
            enk.getACER();
        }
        if(n == 3){
            enk.getHP();
        }
        if(n == 4){
            enk.getDELL();
        }
    }
}








