import java.util.Scanner;

public class day80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] nilai = {10, 20, 30, 40, 50};
                    //. 0.  1.  2.  3.  4
        System.out.print(
        "Masukkan indeks yang ingin diakses (0-4): ");
        int indeks = sc.nextInt();
        
        if (indeks >= 0 && indeks < nilai.length) {
            System.out.println(
            "Nilai pada indeks "+indeks+" = "+nilai[indeks]);
        } else {
            System.out.println("Indeks tidak valid");
        }
    }
}
