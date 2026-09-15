import java.util.Scanner;

public class day14 {     
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Penjumlahan \nMasukkan angka pertama: ");
        int a = sc.nextInt();
        System.out.println("Masukkan angka kedua: ");
        int b = sc.nextInt();
        int tambah = a + b;
        System.out.printf("Hasil:%d ", tambah);  
        System.out.print("\n");
        System.out.println("Pengurangan \nMasukkan angka pertama: ");
        int c = sc.nextInt();
        System.out.println("Masukkan angka kedua: ");
        int d = sc.nextInt();
        int kurang = c - d;
        System.out.printf("Hasil:%d ", kurang);
        sc.close();
    }
}



          
