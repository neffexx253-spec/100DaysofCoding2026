import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU WARUNG MAKANAN SEDERHANA");
        System.out.println("=============================");
        System.out.println("1 Nasi goreng Rp 15.000");
        System.out.println("2 Bakso Rp 15.000");
        System.out.println("3 Mie ayam pangsit Rp 13.000");
        System.out.println("4 Keluar dari menu");
        System.out.println("=============================");

        System.out.print("Masukkan pesanan anda: ");
        int menu = sc.nextInt();

        if (menu == 1) {
            System.out.println("Kamu pesan Nasi goreng");
            System.out.println("Harga 15k");
        } else if (menu == 2) {
            System.out.println("Kamu pesan Bakso");
            System.out.println("Harga 15k");
        } else if (menu == 3) {
            System.out.println("Kamu pesan Mie ayam pangsit");
            System.out.println("Harga 13k");
        } else if (menu == 4) {
            System.out.println("Keluar dari menu");
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        sc.close();
    }
}
