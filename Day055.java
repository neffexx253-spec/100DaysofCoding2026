import java.util.Scanner;

public class day55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Masukkan nilai: ");
            int nilai = sc.nextInt();

             if (nilai == 0) {
                System.out.println("Selesai");
                return;
            }

             if (nilai < 0) {
                System.out.println("Nilai negatif dilewati");
                continue;
            }

             if (nilai == 100) {
                System.out.println("Dapat nilai 100 berhenti");
                break;
            }

            System.out.println("Nilai disimpan: " + nilai);
        }
        sc.close();
    }
               }
