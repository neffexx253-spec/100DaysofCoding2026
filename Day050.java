import java.util.Scanner;

public class day50 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Masukkan angka: ");
		double angka = sc.nextDouble();
		
		String ternary = (angka % 2 == 0) ? "Genap":"Ganjil";
		        System.out.print(ternary);
    }
  }
