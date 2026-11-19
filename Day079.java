import java.util.Scanner;

public class day79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ukuran = sc.nextInt();

        int[] angka = new int[ukuran];
        for (int i = 0; i < angka.length; i++) {
            angka[i] = i + 1;
        }

        for (int nilai : angka) {
            System.out.print(nilai + " ");
        }
    }
}
