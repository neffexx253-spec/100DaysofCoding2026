import java.util.Scanner;

public class day51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Batas perulangan: ");
        int batas = sc.nextInt();
        System.out.print("Mulai dari: ");
        int mulai = sc.nextInt();
        
        if (batas >= mulai) {
            for (int i = mulai; i <= batas; i++) {
                System.out.printf("Angka ke-%d%n", i);
            }
        } else {
            System.out.println(
            "Angka mulai tidak boleh lebih dari batas perulangan");
        }
        
        sc.close();
    }
}
