import java.util.Scanner;

public class day44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = sc.nextInt();
        
        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak valid");
        } else if (nilai >= 85) {
            System.out.println("Nilai    : " + nilai);
            System.out.println("Predikat : A");
        } else if (nilai >= 75) {
            System.out.println("Nilai    : " + nilai);
            System.out.println("Predikat : B");
        } else if (nilai >= 65) {
            System.out.println("Nilai    : " + nilai);
            System.out.println("Predikat : C");
        } else if (nilai >= 50) {
            System.out.println("Nilai    : " + nilai);
            System.out.println("Predikat : D");
        } else {
            System.out.println("Nilai    : " + nilai);
            System.out.println("Predikat : E");
        }
    }
}
