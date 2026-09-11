public class Main {
    public static void main(String[] args) {
        System.out.println("=== TIPE DATA INTEGER ===");
        System.out.println("byte   : " + Byte.MIN_VALUE + " s/d " + Byte.MAX_VALUE);
        System.out.println("short  : " + Short.MIN_VALUE + " s/d " + Short.MAX_VALUE);
        System.out.println("int    : " + Integer.MIN_VALUE + " s/d " + Integer.MAX_VALUE);
        System.out.println("long   : " + Long.MIN_VALUE + " s/d " + Long.MAX_VALUE);
        
        System.out.println("\n=== TIPE DATA DESIMAL ===");
        System.out.println("float  : " + Float.MIN_VALUE + " s/d " + Float.MAX_VALUE);
        System.out.println("double : " + Double.MIN_VALUE + " s/d " + Double.MAX_VALUE);
        
        System.out.println("\n=== TIPE DATA KARAKTER ===");
        System.out.println("char   : " + (int) Character.MIN_VALUE + " s/d " + (int) Character.MAX_VALUE);
    }
}
