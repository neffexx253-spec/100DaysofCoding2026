import java.util.Scanner;

public class day83  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan 5 angka: ");
        int[] angka = {
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt()
        };

        int jumlah = 0;
        for (int i: angka) {
            jumlah += i;
        }

        System.out.println("Jumlah elemen array: " + jumlah);
    }
}
