import java.util.Scanner;

public class day40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        double angka = sc.nextDouble();

        if (angka % 1 == 0) {
            System.out.println(angka + " Bilangan bulat");
        } else {
            System.out.println(angka + " Bilangan desimal");
        }
        } 
}
