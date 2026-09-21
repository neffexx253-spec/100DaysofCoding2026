import java.util.Scanner;

public class day20 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int angka = sc.nextInt();
        double desimal = sc.nextDouble();

        String strAngka   = String.valueOf(angka);
        String strDesimal = String.valueOf(desimal);

        System.out.printf("%s%n",strAngka);
        System.out.printf("%s",strDesimal);
    }
}
