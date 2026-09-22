import java.util.Scanner;

public class day21 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        String d = sc.nextLine();    
        String e = sc.nextLine();
        String f = sc.nextLine();
        String g = sc.nextLine();
        String h = sc.nextLine();

        byte byteA       = Byte.parseByte(a);
        short shortB     = Short.parseShort(b);
        int intC         = Integer.parseInt(c);
        long longD       = Long.parseLong(d);
        float floatE     = Float.parseFloat(e);
        double doubleF   = Double.parseDouble(f);
        char charG       = g.charAt(0);              
        boolean booleanH = Boolean.parseBoolean(h); 

        System.out.printf("Byte a = %d%n", byteA);
        System.out.printf("Short b = %d%n", shortB);
        System.out.printf("Int c = %d%n", intC);
        System.out.printf("Long d = %d%n", longD);
        System.out.printf("Float e = %f%n", floatE);
        System.out.printf("Double f = %f%n", doubleF);
        System.out.printf("Char g = %c%n", charG);
        System.out.printf("Boolean h = %b%n", booleanH);
    }
}
