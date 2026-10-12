import java.util.Scanner;

public class day41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan suhu ruangan: ");
        double suhu = sc.nextDouble();

        if (suhu <= 20) {
            System.out.println("Dingin");
        } else if (suhu <= 30) {
            System.out.println("Normal");
        } else if (suhu <= 40) {
            System.out.println("Panas");
        } else {
            System.out.println("Sangat panas");
        }
    }
}
