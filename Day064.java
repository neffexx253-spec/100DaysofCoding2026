import java.util.Scanner;

public class day64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(
        "Masukkan angka faktorial: ");
        int a = sc.nextInt();
        int b = 1;
        for (int i = 2; i <= a; i++) {
            b *= i;
        }
        System.out.printf(
        "%d = %d",a,b); 
        sc.close();
    }
}
