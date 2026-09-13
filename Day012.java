import java.util.Scanner;

public class BiodataMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        String namaLengkap, tempatLahir, statusMahasiswa;
        int umur, semester;
        double tinggiBadan, beratBadan, ipk;
        char jenisKelamin;

        // Input data
        System.out.print("Nama Lengkap\t: ");
        namaLengkap = input.nextLine();

        System.out.print("Tempat Lahir\t: ");
        tempatLahir = input.nextLine();

        System.out.print("Umur\t\t: ");
        umur = input.nextInt();

        System.out.print("Tinggi Badan\t: ");
        tinggiBadan = input.nextDouble();

        System.out.print("Berat Badan\t: ");
        beratBadan = input.nextDouble();

        System.out.print("Jenis Kelamin\t: ");
        jenisKelamin = input.next().charAt(0);

        System.out.print("Semester\t: ");
        semester = input.nextInt();

        System.out.print("IPK\t\t: ");
        ipk = input.nextDouble();
        input.nextLine(); // membersihkan newline

        System.out.print("Status\t\t: ");
        statusMahasiswa = input.nextLine();

        // Output biodata
        System.out.println("=====================================");
        System.out.println("=        BIODATA MAHASISWA);     =");
        System.out.println("=====================================");
        System.out.printf("Nama Lengkap\t: %s%n", namaLengkap);
        System.out.printf("Tempat Lahir\t: %s%n", tempatLahir);
        System.out.printf("Umur\t\t: %d tahun%n", umur);
        System.out.printf("Tinggi Badan\t: %.2f cm%n", tinggiBadan);
        System.out.printf("Berat Badan\t: %.2f kg%n", beratBadan);
        System.out.printf("Jenis Kelamin\t: %c%n", jenisKelamin);
        System.out.printf("Semester\t: %d%n", semester);
        System.out.printf("IPK\t\t: %.2f%n", ipk);
        System.out.printf("Status\t\t: %s%n", statusMahasiswa);
        input.close();
    }
}
