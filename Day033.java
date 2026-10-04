import java.util.Scanner;

public class day33 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan tahun sekarang dalam huruf: ");
    String duaenam = sc.nextLine();
  
    
    if (duaenam.equals("dua ribu dua puluh enam")) {
      System.out.println("Jawaban kamu benar");
    } else {
      System.out.println("Jawaban kamu salah");
    }
  
    }
}
