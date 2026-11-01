import java.util.Scanner;

public class day61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = sc.nextInt();
        long c = 1;
        for (int i = 1; i <= n; i++) 
        c *= i;
        System.out.printf(
        "Hasil 1 sampai %d = %d%n"
        ,n,c);
    }
}
