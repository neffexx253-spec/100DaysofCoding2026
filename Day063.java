import java.util.Scanner;

public class day63 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int a = sc.nextInt();
        System.out.print("Masukkan pangkat: ");
        int b = sc.nextInt();
        int c = 1;
        for (int i = 0; i < b; i++) {
            c *= a;
        }
            System.out.println(c);
     }
}
