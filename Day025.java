import java.util.Scanner;

public class day25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan angka Jari Jari =");
        int R = sc.nextInt();

        double L = 3.14 * (R * R);
        int H = (int) L ;

        System.out.printf("Luas Lingkaran =  %d " , H , " Cm²%n");

    }
}
