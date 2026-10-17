import java.util.Scanner;

public class day46 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    	System.out.println("=== MENU ===");
      System.out.println(
      "1. Nasi Goreng \n2. Bakso \n3. Es Teh \n4. Soto \n5. Nasi Kuning ");
      System.out.print("Pilih Menu ");
      int menu = sc.nextInt();
        
        switch (menu) {
	case 1 : 
		  System.out.println("Nasi Goreng");
		break;
            case 2 : 
		  System.out.println("Bakso");
		break;
            case 3 : 
		  System.out.println("Es teh");
		break;
            case 4 : 
		  System.out.println("Soto");
		break;
            case 5 : 
		  System.out.println("Nasi Kuning");
		break;

	default:
            System.out.println(
              "Makanan Yang dipilih tidak ada dalam Menu");
		break;
}
     }
}
