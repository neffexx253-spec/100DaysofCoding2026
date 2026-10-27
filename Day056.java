import java.util.Scanner;

public class day56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Masukkan nilai N: ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
