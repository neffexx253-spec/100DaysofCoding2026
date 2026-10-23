import java.util.Scanner;

public class day52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jawaban = "";
        
        while (!jawaban.equalsIgnoreCase("ya")) {
            System.out.print("Apakah kamu sudah paham? (ya/tidak): ");
             jawaban = sc.nextLine();
        }
        
        System.out.println("Program selesai");
        sc.close();
    }
}
