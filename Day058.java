import java.util.Scanner;

public class day58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = sc.nextInt();
        
        System.out.print("\nAngka Ganjil : ");
        for (int i = 1; i < n; i += 2) {
            System.out.print(i + " ");
        }
        
        System.out.print("\nAngka Genap  : ");
        for (int i = 2; i < n; i += 2) {
            System.out.print(i + " ");
        }
        sc.close();
    }
    }
