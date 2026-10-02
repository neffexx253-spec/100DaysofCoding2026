import java.util.Scanner;

public class day31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            //hanya menerima (true/false)
        System.out.print("Masukkan nilai a: ");
        boolean a = sc.nextBoolean();

        System.out.print("Masukkan nilai b: ");
        boolean b = sc.nextBoolean();

        System.out.printf("a && b = %b%n", a && b);
        System.out.printf("a || b = %b%n", a || b);
        System.out.printf("!a     = %b%n", !a);
        System.out.printf("!b     = %b%n", !b);
        sc.close();
    }
}
