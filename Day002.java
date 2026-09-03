public class BiodataDiri {
    public static void main(String[] args) {
        String nama = "MUH SHAQR DZAKY";
        String jenisKelamin = "Laki laki";
        String kampus = "Unsulbar";
        String jurusan = "Informatika";
        String alamat = "Saleppa";
        double tinggiBadan = 165.0;
        int umur = 20;
        String asalSekolah = "SMKN 1 MAJENE";
        
        System.out.print("=== BIODATA DIRI ===\n");
        System.out.print("Nama: ");
        System.out.print(nama + "\n");
        
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Kampus: " + kampus);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Alamat: " + alamat);
        System.out.println("Asal Sekolah: " + asalSekolah);
        
        System.out.printf("Tinggi Badan: %.1f cm\n", tinggiBadan);
        System.out.printf("Umur: %d tahun\n", umur);
        
        System.out.printf("\n--- Ringkasan ---\n");
        System.out.printf("%-15s: %s\n", "Nama", nama);
        System.out.printf("%-15s: %s\n", "Jenis Kelamin", jenisKelamin);
        System.out.printf("%-15s: %s\n", "Kampus", kampus);
        System.out.printf("%-15s: %s\n", "Jurusan", jurusan);
        System.out.printf("%-15s: %s\n", "Alamat", alamat);
        System.out.printf("%-15s: %s\n", "Asal Sekolah", asalSekolah);
        System.out.printf("%-15s: %.1f cm\n", "Tinggi Badan", tinggiBadan);
        System.out.printf("%-15s: %d tahun\n", "Umur", umur);
    }
}
