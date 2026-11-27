import java.util.Scanner;
import java.util.Arrays;

public class day87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Mau berapa data? ");
        int n = sc.nextInt();
        int[] data = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Data ke-" + (i+1) + ": ");
            data[i] = sc.nextInt();
        }
        
        System.out.println("Isi array: " + Arrays.toString(data));
        
        int total = 0;
        int max = data[0];
        int min = data[0];
        
        for (int angka : data) {
            total += angka;
            if (angka > max) max = angka;
            if (angka < min) min = angka;
        }
        
        double rataRata = (double) total / n;
        
        System.out.println("Total: " + total);
        System.out.println("Rata-rata: " + rataRata);
        System.out.println("Nilai terbesar: " + max);
        System.out.println("Nilai terkecil: " + min);
        
        System.out.print("Mau cari angka berapa? ");
        int cari = sc.nextInt();
        boolean ketemu = false;
        for (int i = 0; i < n; i++) {
            if (data[i] == cari) {
                System.out.println(
                "Angka " + cari + " ketemu di index " + i);
                ketemu = true;
            }
        }
        if (!ketemu) {
            System.out.println(
            "Angka tidak ditemukan");
        }
        
        Arrays.sort(data);
        System.out.println(
        "Setelah diurutkan: " + Arrays.toString(data));
    }
  }
