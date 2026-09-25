import java.util.Scanner;

public class day24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Panjang: ");
        int panjang = sc.nextInt();
        System.out.print("Lebar: ");
        int lebar = sc.nextInt();
        int luas = panjang * lebar;
        System.out.printf("Luas persegi panjang: %d%n",luas);
        sc.close();
    }
}
