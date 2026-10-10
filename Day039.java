import java.util.Scanner;

public class day39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int a = sc.nextInt();

        System.out.print("Masukkan operator: ");
        char o = sc.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        int b = sc.nextInt();

        int hasil = 0;

        if (o == '+') {
            hasil = a + b;
        } else if (o == '-') {
            hasil = a - b;
        } else if (o == '*') {
            hasil = a * b;
        } else if (o == '/') {
            hasil = a / b;
        }

        System.out.println(hasil);
    }
}

              
