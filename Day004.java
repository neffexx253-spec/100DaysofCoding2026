public class Main {
    public static void main(String[] args) {
        
        // 1. BYTE (ukuran kecil: -128 s/d 127)
        byte umur = 20;
        System.out.println("Umur: " + umur);
        
        // 2. SHORT (sedang: -32.768 s/d 32.767)
        short populasi = 26000;
        System.out.println("Populasi: " + populasi);
        
        // 3. INT (standar: -2 miliar s/d 2 miliar)
        int gaji = 5000000;
        System.out.println("Gaji: " + gaji);
        
        // 4. LONG (besar, pakai huruf L di akhir)
        long jarak = 10000000000L;
        System.out.println("Jarak: " + jarak);
        
        // Operasi sederhana
        int a = 10;
        int b = 3;
        System.out.println("10 + 3 = " + (a + b));
        System.out.println("10 / 3 = " + (a / b)); // hasil bulat
    }
}
