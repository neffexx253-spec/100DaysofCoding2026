import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = sc.nextInt();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = sc.nextInt();

        switch (operator) {
            case '+':
                System.out.println("Hasil: " + (bilangan1 + bilangan2));
                break;
            case '-':
                System.out.println("Hasil: " + (bilangan1 - bilangan2));
                break;
            case '*':
                System.out.println("Hasil: " + (bilangan1 * bilangan2));
                break;
            case '/':
                if (bilangan2 != 0) {
                    if (bilangan1 % bilangan2 == 0) {
                        System.out.println("Hasil: " + (bilangan1 / bilangan2));
                    } else {
                        double hasil = (double) bilangan1 / bilangan2;
                        System.out.printf("Hasil: %.2f%n", hasil);
                    }
                } else {
                    System.out.println("Error, pembagian dengan nol tidak diperbolehkan");
                }
                break;
            default:
                System.out.println("Input tidak sesuai");
        }

        sc.close();
    }
}
