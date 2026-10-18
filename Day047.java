import java.util.Scanner;

public class day47 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Temanmu mengajak untuk liburan tapi kamu bisanya hari apa?");
        System.out.print("Hari apa lu bisa pergi bareng teman: ");
        String pilihhari = sc.nextLine();

        switch (pilihhari) {
                case "senin":
                case "selasa":
                case "rabu":
                 System.out.println("lu gak bisa pergi karna ada matkul + tugas numpuk");
                break;                                                                                               
                case "kamis":
                 System.out.println("lu bisa pergi karna hari kamis libur");
                break;
                case "jumat":
                 System.out.println("lu gak bisa pergi karna ada matkul + kelas tambahan");
                break;
                case "sabtu":
                case "minggu":
                 System.out.println("lu bisa pergi karna hari sabtu minggu libur");
                break;
                default:
                 System.out.println("di bumi 1 minggu cuma ada 7 hari bro!");
                }
                }
}
