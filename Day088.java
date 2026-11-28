import java.util.Scanner;

public class day88 {
    static void luas(int p, int l){ System.out.println(
    "Luas: "+ (p * l)); }
    static void keliling(int p, int l){ System.out.println(
    "Keliling: "+ (2* (p+l))); }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Panjang: "); int p = sc.nextInt();
        System.out.print("Lebar: "); int l = sc.nextInt();
        luas(p, l);
        keliling(p, l);
    }
}
