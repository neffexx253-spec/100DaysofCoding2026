import java.util.Scanner;

public class day17 {                                                                          
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai awal: ");
        int x = input.nextInt();

        System.out.printf("Nilai awal x = %d%n", x);

        System.out.print("Masukkan nilai kedua (+=): ");
        int tambah = input.nextInt();
        x += tambah;
        System.out.printf("Setelah x += %d -> x = %d%n", tambah, x);

        System.out.print("Masukkan nilai ketiga (-=): ");
        int kurang = input.nextInt();
        x -= kurang;
        System.out.printf("Setelah x -= %d -> x = %d%n", kurang, x);

        System.out.print("Masukkan nilai keempat (*=): ");
        int kali = input.nextInt();
        x *= kali;
        System.out.printf("Setelah x *= %d -> x = %d%n", kali, x);

        System.out.print("Masukkan nilai kelima (/=): ");
        int bagi = input.nextInt();
        x /= bagi;
        System.out.printf("Setelah x /= %d -> x = %d%n", bagi, x);

        input.close();
    }
}
