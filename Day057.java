import java.util.Scanner;

public class day57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai N: ");
        int N = sc.nextInt();
        
        System.out.println("\nGenap");
        for (int a = 1; a <= N; a++) {
            if (a % 2 == 0)
            System.out.print(a+" ");
        }
        System.out.println("\n\nGanjil");
        for (int a = 1; a <= N; a++) {
            if (a % 2 != 0)
            System.out.print(a+" ");
        }
        sc.close();
    }
}
