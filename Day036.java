import java.util.Scanner;

public class day36 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bilangan: ");
        int bilangan = sc.nextInt();

        if (bilangan % 2 == 0) {
          System.out.printf("Genap\n");
        } else {
          System.out.printf("Ganjil\n");
        }
        }
}
