import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukan Nama Anda: ");
        String nama = in.nextLine();
        System.out.println("Nama saya adalah: " + nama);

        System.out.print("Masukkan Umur Anda: ");
        int umur = in.nextInt();
        System.out.println("Umur saya adalah: " + umur);

        System.out.print("Masukkan Tinggi Anda: ");
        double tinggi = in.nextDouble();
        System.out.println("Tinggi Saya Adalah: " + tinggi);

        System.out.print("Masukkan Berat Badan Anda: ");
        float beratbadan = in.nextFloat();
        System.out.println("Berat Badan Anda Adalah: " + beratbadan);

        System.out.print("Masukkan Bulan Lahir Anda: ");
        byte bulanlahir = in.nextByte();
        System.out.println("Bulan Lahir Anda Adalah: " + bulanlahir);

        System.out.print("Masukkan Tahun Lahir Anda: ");
        short tahunlahir = in.nextShort();
        System.out.println("Tahun Lahir Anda Adalah: " + tahunlahir);

        System.out.print("Masukkan Tahun Sekarang: ");
        long tahunsekarang = in.nextLong();
        System.out.println("Tahun Sekarang Adalah: " + tahunsekarang);

        System.out.print("Masukkan Jenis Kelamin: ");
        char L = in.next().charAt(0);
        System.out.println("Jenis Kelamin Anda Adalah: " + L);

        System.out.print("Apakah saya dosen: ");
        boolean Dosen = in.nextBoolean();

        if (Dosen == true) {
            System.out.println("Saya dosen");
        } else {
            System.out.println("Saya bukan dosen");
        }

        in.close();
    }
}
