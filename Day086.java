import java.util.Scanner;

public class day86 {
    public static int cari (int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(
        "Masukkan jumlah elemen array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println(
        "Masukkan " + n + " elemen:");
        for (int i = 0; i < n; i++) {
            System.out.print(
            "Elemen ke-" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print(
        "Masukkan elemen yang ingin dicari: ");
        int target = sc.nextInt();
        
        int hasil = cari(arr, target);

        if (hasil != -1) {
            System.out.println(
            "Elemen " + target+ " ditemukan pada indeks "+hasil);
        } else {
            System.out.println(
            "Elemen " + target+ " tidak ditemukan");
        }
    }
}
