import java.util.Scanner;

public class day65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tinggi: ");
        int tinggi = sc.nextInt();
        for (int i = 0; i < tinggi; i++) {
            System.out.println("|");
        }
        sc.close();
    }
}
