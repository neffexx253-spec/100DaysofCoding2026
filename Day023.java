import java.util.Scanner;

public class day23 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);   
        System.out.print("Masukkan sisi: ");
        double sisi = sc.nextDouble();
        double luas = sisi * sisi;
        
        System.out.printf("Sisi  :%.1f%nLuas  :%.1f%n",sisi,luas);
   }
}
