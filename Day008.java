public class Variabel {
    public static void main(String[] args) {
        
        // DEKLARASI + INISIALISASI
        String nama = "Dzaky";
        int umur = 19;
        double tinggi = 165.0;
        
        // Tampilkan nilai awal
        System.out.println("Nilai Awal:");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Tinggi: " + tinggi);
        
        // UPDATE variabel
        nama = "MUH SHAQR DZAKY";
        umur = 20;
        tinggi = 165.5;
        
        // Tampilkan setelah update
        System.out.println("\nSetelah Update:");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Tinggi: " + tinggi);
        
        // Tampilkan operasi
        System.out.println("\nSetelah Operasi:");
        System.out.println("Umur + 1 = " + umur);       
        System.out.println("Tinggi + 0.5 = " + tinggi);
    }
}
