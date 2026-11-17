import java.util.Scanner;

public class day77 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String teks = scanner.nextLine();
        if (teks == null) {
            teks = "";
        }

        System.out.println("Teks: " + teks);
        System.out.println("Panjang: " + teks.length() + ", kosong: " + teks.isEmpty());
        System.out.println("Huruf besar: " + teks.toUpperCase());
        System.out.println("Trim: [" + teks.trim() + "]");
        System.out.println("Mengandung 5: " + teks.contains("5"));
        System.out.println("Ganti 5: " + teks.replace("5", "X"));
        System.out.println("Sama dengan 10: " + teks.equals("10"));
    }
}
