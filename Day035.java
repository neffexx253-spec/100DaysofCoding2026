import java.util.Scanner;

public class day35 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nilai = sc.nextInt();

        if (nilai >= 60) {
            System.out.println("Anda LULUS");
             if (nilai >= 90) {
                System.out.println("Nilai: A");
            } else if (nilai >= 80) {
                System.out.println("Nilai: B");
            } else if (nilai >= 70) {
                System.out.println("Nilai: C");
            } else {
                System.out.println("Nilai: D");
            }
        } else {
            System.out.println("Anda TIDAK LULUS");
        }
    }
}
