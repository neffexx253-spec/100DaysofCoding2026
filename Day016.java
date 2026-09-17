import java.util.Scanner;
public class day16 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a ;
        int b ;
        
        System.out.print("masukkan nilai pertama :");
        a = Sc.nextInt();
        System.out.print("masukkan nilai keduan  :");
        b = Sc.nextInt();
        
        int modulus = a % b;
        int hasilBagi = a / b;
        int sisaBagi = a - (hasilBagi * b);
        
        System.out.println(a + " / " + b + " = " + hasilBagi);
        System.out.println("Sisa bagi: " + sisaBagi);
        
    }
}
