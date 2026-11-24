import java.util.Scanner;

public class day84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Masukkan " + n + " nilai:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            a[i] = scanner.nextInt();
        }
        int b = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > b) {
                b = a[i];
            }
        }

        System.out.println("Nilai Max: " + b);
    }
}
