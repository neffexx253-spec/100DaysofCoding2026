import java.util.Scanner;

public class day29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int a = sc.nextInt();
        
        System.out.print("Masukkan angka kedua: ");
        int b = sc.nextInt();
        
        System.out.printf("=== Hasil Perbandingan ===%n");
        System.out.printf("%d > %d : %b%n", a, b, a > b);
        System.out.printf("%d < %d : %b%n", a, b, a < b);
        sc.close();
    }
}
