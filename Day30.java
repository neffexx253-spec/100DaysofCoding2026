import java.util.Scanner;

public class day30 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int A = sc.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int B = sc.nextInt();
System.out.printf(
    "%d >= %d = %b%n%d <= %d = %b%n",
    A, B, (A >= B),
    A, B, (A <= B));//(true/false)
        
    }
}
