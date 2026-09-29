import java.util.Scanner;

public class day28 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int a = sc.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = sc.nextInt();
        //kalau menggunakan println perlu ()
        System.out.printf("a == b : %b%n", a == b);

        System.out.printf("a != b : %b%n", a != b);
        sc.close();
    }
}
