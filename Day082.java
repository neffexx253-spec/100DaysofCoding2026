import java.util.Scanner;
import java.util.Arrays;

public class day82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Berapa banyak elemen array? ");
        int n = sc.nextInt();
        
        int[] angka = new int[n];
        
        System.out.println("Masukkan " + n + " angka:");
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }
        int jumlah = 0;
        for (int i = 0; i < angka.length; i++) {
            jumlah += angka[i];
        }
        System.out.println("Array        : " + Arrays.toString(angka));
        System.out.println("Jumlah elemen: " + jumlah);
    }
}
