import java.util.Scanner;

public class day34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka umur anda : ");
        int A = sc.nextInt();
        boolean B = A < 13;
        boolean C = A < 18;
        boolean D = A >= 17;

        if (B) {
            System.out.printf("Anak-Anak%n");
        } else if (C) {
            System.out.printf("Remaja%n");
        } else if (D) {
            System.out.printf("Dewasa%n");
        }

        sc.close();
    }
}
