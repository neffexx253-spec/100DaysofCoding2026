import java.util.Scanner;

public class day45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan hari (1-7): ");
        int harike = sc.nextInt();
        String namaHari;
        switch (harike) {
            case 1:
                namaHari = "Senin";
                break;
            case 2:
                namaHari = "Selasa";                             
                break;
            case 3:
                namaHari = "Rabu";
                break;
            case 4:
                namaHari = "Kamis";
                break;
            case 5:
                namaHari = "Jumat";
                break;
            case 6:
                namaHari = "Sabtu";
                break;
            case 7:
                namaHari = "Minggu";
                break;
            default:
                namaHari = "Hari tidak valid";
        }
            System.out.printf(
            "Hari ke %d Adalah hari %s%n"
            ,harike,namaHari);
    }
}
