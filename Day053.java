import java.util.Scanner;

public class day53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jawaban;
        
        do {
            System.out.print("Masukkan nama: ");
            String nama = sc.nextLine();
            System.out.println("Halo " + nama);
            
            System.out.print("Masukkan nama kembali? (ya/tidak): ");
            jawaban = sc.nextLine();
        } while (jawaban.equalsIgnoreCase("ya"));
        
        System.out.println("Program selesai");
        sc.close();
    }
              }
