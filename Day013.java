import java.util.Scanner;

public class DataMahasiswa {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);
        
        // Meminta dan membaca input Nama
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        
        // Meminta dan membaca input NIM
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        
        // Meminta dan membaca input Tinggi Badan
        System.out.print("Masukkan Tinggi Badan (cm): ");
        int tinggiBadan = input.nextInt();
        
        // Meminta dan membaca input Berat Badan
        System.out.print("Masukkan Berat Badan (kg): ");
        double beratBadan = input.nextDouble();
        
        // Meminta dan membaca input Status Mahasiswa
        System.out.print("Masukkan Status Mahasiswa (true/false): ");
        boolean statusMahasiswa = input.nextBoolean();
        
        // Menampilkan data menggunakan printf dan escape sequence
        System.out.printf("\n===== DATA MAHASISWA =====\n");
        System.out.printf("Nama\t\t: %s\n", nama);
        System.out.printf("NIM\t\t: %s\n", nim);
        System.out.printf("Tinggi Badan\t: %d cm\n", tinggiBadan);
        System.out.printf("Berat Badan\t: %.2f kg\n", beratBadan);
        System.out.printf("Status Mahasiswa: %b\n", statusMahasiswa);
        
        // Menutup Scanner
        input.close();
    }
}
