import java.util.Scanner;

public class day26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama\t: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan NIM\t: ");
        String nim = sc.nextLine();

        System.out.print("Masukkan kelas\t: ");
        char kelas = sc.next().charAt(0);
        sc.nextLine();

        System.out.print("Masukkan umur\t: ");
        int umur = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukkan prodi\t: ");
        String prodi = sc.nextLine();

        System.out.print("Masukkan IPK\t: ");
        double ipk = sc.nextDouble();

        System.out.print("Status keaktifan: ");
        boolean keaktifan = sc.nextBoolean();
        System.out.print("===BIODATA MAHASISWA===\n");
        System.out.printf(
            "Nama\t\t: %s%nNIM\t\t: %s%nKelas\t\t: %c%nUmur\t\t: %d%nProdi\t\t: %s%nIPK\t\t: %.2f%nStatus aktif\t: %b%n",
            nama, nim, kelas, umur, prodi, ipk, keaktifan
        );

        sc.close();
    }
}
