import java.util.Scanner;

public class day49 {
        public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan Nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Jenis kelamin(L/P):  ");
        char jenisKelamin = sc.next().charAt(0);
        String ternary = (jenisKelamin == 'L') ? "Laki-laki":"Perempuan";
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + jenisKelamin);
        System.out.println(ternary);
    }
}
