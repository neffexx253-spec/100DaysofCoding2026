public class KalkulatorBMI {
    // Konstanta kategori BMI
    static final double BMI_KURUS = 18.5;
    static final double BMI_NORMAL = 25.0;
    static final double BMI_OVERWEIGHT = 30.0;

    public static void main(String[] args) {
        String nama = "Dzaky";
        double beratKg = 63.0;
        double tinggiCm = 165.0;

        // Konversi tinggi dari cm ke meter
        double tinggiM = tinggiCm / 100;

        // Hitung BMI
        double bmi = beratKg / (tinggiM * tinggiM);
        String kategori;

        if (bmi < BMI_KURUS) {
            kategori = "Kurus";
        } else if (bmi < BMI_NORMAL) {
            kategori = "Normal";
        } else if (bmi < BMI_OVERWEIGHT) {
            kategori = "Overweight";
        } else {
            kategori = "Obesitas";
        }

        System.out.println("=== CEK BMI ===");
        System.out.println("Nama       : " + nama);
        System.out.println("Berat      : " + beratKg + " kg");
        System.out.println("Tinggi     : " + tinggiCm + " cm");
        System.out.println("Nilai BMI  : " + bmi);
        System.out.println("Kategori   : " + kategori);
    }
}
