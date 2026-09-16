import java.util.Scanner;

public class day15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Perkalian");
        System.out.print("Masukkan angka pertama: ");
        int a = sc.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = sc.nextInt();
        int kali = a * b;
        System.out.printf("Hasil: %d%n", kali);
        sc.nextLine();
        System.out.println("\nPembagian");
        System.out.print("Masukkan angka pertama: ");
        int c = sc.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int d = sc.nextInt();
        int bagi = c / d;
        System.out.printf("Hasil: %d%n", bagi);
        sc.close();
    }
}
