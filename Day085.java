import java.util.Scanner;

public class day85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Berapa jumlah angka? ");
        int n = sc.nextInt();
        
        int[] angka = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Angka ke"+(i + 1)+ ": ");
            angka[i] = sc.nextInt();
        }
        int min = angka[0];
        for (int i = 1; i < angka.length; i++) {
            if (angka[i] < min) {
                min = angka[i];
            }
        }
        
        System.out.println("Nilai minimal: " +min);
    }
}
