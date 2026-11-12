import java.util.Scanner;

public class day72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int n;
        do {
            n = sc.nextInt();
            if (n >= 0) {
            a += n;
            }
        } while (n > 0);
        System.out.print(a);
    }
}
