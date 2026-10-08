import java.util.Scanner;

public class day37 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bilangan: ");
        int bilangan = sc.nextInt();

        if (bilangan > 0) {
          System.out.printf("Bilangan positif\n");
        } else if (bilangan < 0){
          System.out.printf("Bilangan negatif\n");
        } else {
         System.out.println("Bilangan nol");
        }
        }
}
