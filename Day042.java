import java.util.Scanner;

public class day42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan gaji pokok: ");
        double pokok = sc.nextDouble();

        System.out.print("Masukkan tunjangan: ");
        double tunjangan = sc.nextDouble();

        System.out.print("Masukkan potongan: ");
        double potongan = sc.nextDouble();

        double bersih = pokok + tunjangan - potongan;
        System.out.printf(
        "Gaji bersih: Rp %.0f",bersih);
    } 
}
