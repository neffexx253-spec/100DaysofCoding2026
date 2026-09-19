import java.util.Scanner;

public class day18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka (byte): ");
        byte angkaByte = input.nextByte();

        short angkaShort = angkaByte;
        long angkaLong = angkaShort;
        float angkaFloat = angkaLong;
        double angkaDouble = angkaFloat;

        System.out.printf("byte  :%d%n",angkaByte);
        System.out.printf("int   :%d%n",angkaShort);
        System.out.printf("long  :%d%n",angkaLong);
        System.out.printf("float :%.2f%n",angkaFloat);
        System.out.printf("double:%.2f%n",angkaDouble);

        input.close();
    }
}
