import java.util.Scanner;

public class day74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kata: ");
        String kata = sc.nextLine();
        System.out.println(kata.length());
        System.out.println(kata.toUpperCase());
        System.out.println(kata.toLowerCase());
    }
}
