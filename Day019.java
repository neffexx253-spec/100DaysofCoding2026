import java.util.Scanner;

public class day19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Konversi manual/paksa dari tipe data besar ke kecil
        System.out.printf("Masukkan nilai Long: ");
        long Long = sc.nextLong();

        int   Int = (int) Long;
        short Short = (short) Int;
        byte  Byte = (byte) Short;

        System.out.printf("%-19s: %d%n", "Long", Long);
        System.out.printf("%-19s: %d%n", "Long ke int", Int);
        System.out.printf("%-19s: %d%n", "Int ke short", Short);
        System.out.printf("%-19s: %d%n", "Short ke byte", Byte);
        sc.close();
    }
}
