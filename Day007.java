public class Main {
    public static void main(String[] args) {
        // Data diri lengkap
        String nama = "MUH SHAQR DZAKY";
        String nim = "D0226045";
        String kelas = "D";
        String jurusan = "Informatika";
        String fakultas = "Teknik";
        String kampus = "Unsulbar";
        String kelompokBelajar = "Informatic study club";
        String program = "100 Days of Coding";
        String asalSekolah = "SMKN 1 Majene";
        String jurusanSmk = "Teknik Jaringan dan Komputer";
        String angkatan = "2026";
        String jalurMasuk = "SNBP";

        // Menampilkan informasi dengan rapi
        System.out.println("========== DATA DIRI MAHASISWA ==========");
        System.out.println("Nama            : " + nama);
        System.out.println("NIM             : " + nim);
        System.out.println("Kelas           : " + kelas);
        System.out.println("Jurusan         : " + jurusan);
        System.out.println("Fakultas        : " + fakultas);
        System.out.println("Kampus          : " + kampus);
        System.out.println("Kelompok Belajar: " + kelompokBelajar);
        System.out.println("Program         : " + program);
        System.out.println("Asal Sekolah    : " + asalSekolah);
        System.out.println("Jurusan SMK     : " + jurusanSmk);
        System.out.println("Angkatan        : " + angkatan);
        System.out.println("Jalur Masuk     : " + jalurMasuk);
        System.out.println("==========================================");

        // Menggabungkan String
        String identitas = nama + " | " + nim + " | " + jurusan;
        System.out.println("\nIdentitas lengkap: " + identitas);

        String salam = "Halo, perkenalkan saya " + nama + " dari " + kampus;
        System.out.println(salam);

        String informasi = "Saya angkatan " + angkatan + " dan masuk melalui jalur " + jalurMasuk;
        System.out.println(informasi);

        String sekolah = "Saya alumni " + asalSekolah + " jurusan " + jurusanSmk;
        System.out.println(sekolah);

        String kegiatan = "Saya mengikuti " + kelompokBelajar + " dengan program " + program;
        System.out.println(kegiatan);
        System.out.println("\n===== TERIMA KASIH =====");
    }
}
