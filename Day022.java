import java.util.Scanner;

public class day22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama: ");
        int a = sc.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = sc.nextInt();
        
        System.out.printf("Sebelum ditukar: a = %d, b = %d%n", a, b);
        
        a = a + b;  
        b = a - b;  
        a = a - b;
        
        System.out.printf("Setelah ditukar: a = %d, b = %d%n", a, b);
        
        sc.close();
    }
}
