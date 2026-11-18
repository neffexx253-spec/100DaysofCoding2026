import java.util.Scanner;

public class day78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Buat username: ");
        if (!sc.hasNextLine()) return;
        String user = sc.nextLine();

        System.out.print("Buat password: ");
        if (!sc.hasNextLine()) return;
        String pass = sc.nextLine();

        System.out.println(
        "\nAkun berhasil dibuat. Silakan login.");
        while (true) {
            System.out.print("Username: ");
            if (!sc.hasNextLine()) break;
            String userLogin = sc.nextLine();

            System.out.print("Password: ");
            if (!sc.hasNextLine()) break;
            String passLogin = sc.nextLine();

            if (user.equals(userLogin)
                    && pass.equals(passLogin)) {
                System.out.println(
                "Login berhasil. Selamat datang, " + user);
                break;
            }
            System.out.println(
            "Username atau password salah. Silakan coba lagi.\n");
        }
    }
}
