import java.util.Scanner;

public class day32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan usia anda: ");
        int usia = sc.nextInt();
        System.out.print("Masukkan tinggi anda: ");
        int tinggi = sc.nextInt();

        int usiaMin = 17, usiaMaks = 20;
        int tinggiMin = 130, tinggiMaks = 180;

        int percobaan = 0;
        percobaan++;

        System.out.println("Usia == minimum " + (usia == usiaMin));
        System.out.println("Usia != maksimum " + (usia != usiaMaks));

        boolean usiaOK = usia >= usiaMin && usia <= usiaMaks;
        boolean tinggiOK = tinggi >= tinggiMin && tinggi <= tinggiMaks;

        boolean diBatas = (usia == usiaMin) || (tinggi == tinggiMin);
        boolean bolehMasuk = usiaOK && tinggiOK;

        if (bolehMasuk) {
            System.out.println("anda boleh masuk");
            percobaan++;
        } else {
            if (!usiaOK) System.out.println("usia tidak sesuai");
            if (!tinggiOK) System.out.println("Tinggi tidak sesuai");
        }

        if (diBatas) System.out.println("Tepat dibatas minimum");

        percobaan--;
        percobaan++;
        System.out.println("Total percobaan: " + percobaan);

        sc.close();
    }
}



