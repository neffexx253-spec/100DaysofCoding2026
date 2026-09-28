import java.util.Scanner;

public class day27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Angka Pertama : ");
        int A = sc.nextInt();
        System.out.print("Masukkan Angka Kedua :");
        int B = sc.nextInt();
        
        int C = ++A;
        int D = --B;
        
        System.out.printf("%n===Incerment===%n");
        System.out.printf("Nilai Pertama : %d%n", C);
        System.out.printf("%n===Decrement===%n");
        System.out.printf("Nilai Kedua   : %d%n", D);
    }
}
