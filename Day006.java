public class DataMahasiswa {
    public static void main(String[] args) {

        // variabel
        String namaMahasiswa = "MUH SHAQR DZAKY"; // Nama (String)
        String nim = "D0226045"; // NIM (String)
        char jenisKelamin = 'L'; // L = Laki-laki, P = Perempuan (char)
        String kelas = "D"; // Kelas (String)
        double ipk = 3.2; // IPK (double)

        // penentuan kompeten atau tidak kompeten
        boolean kompeten = ipk >= 2.5;

        // Menampilkan data mahasiswa
        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("Nama          : " + namaMahasiswa);
        System.out.println("NIM           : " + nim);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Kelas         : " + kelas);
        System.out.println("IPK           : " + ipk);

        // Menampilkan status dengan boolean
        System.out.print("Status        : ");
        if (kompeten) {
            System.out.println("Kompeten");
        } else {
            System.out.println("Kurang Kompeten");
        }
    }
}
