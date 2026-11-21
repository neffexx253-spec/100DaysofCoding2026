import java.util.Scanner;

public class day81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahElemen = sc.nextInt();
        int[] nilai = new int[jumlahElemen];
        
        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = (i + 1) * 10;
        }

        for (int i = 0; i < nilai.length; i++) {
            System.out.println(
            "Nilai pada indeks " + i + " = " + nilai[i]);
        }

        sc.close();
    }
}
