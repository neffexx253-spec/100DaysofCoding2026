import java.util.Scanner;

public class day73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println(
"\n===== MENU UTAMA =====\n1. Unduh\n2. Unggah\n3. Hapus\n4. Keluar");
            pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println(
                    ">> Mengunduh data...");
                    break;
                case 2:
                    System.out.println(
                    ">> Mengunggah data...");
                    break;
                case 3:
                    System.out.println(
                    ">> Menghapus data...");
                    break;
                case 4:
                    System.out.println(
                    ">> KELUAR <<\nProgram selesai.");
                    break;
                default:
                    System.out.println(
                    ">> Pilihan tidak valid");
            }
         } while (pilihan != 4);
    }
}
