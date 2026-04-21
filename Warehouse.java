import java.util.Scanner;

public class Warehouse {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n1.Add 2.Remove 3.View 4.Search 5.Exit");
            int choice = sc.nextInt(); sc.nextLine();
            if (choice == 5) break;

            switch (choice) {
                case 1:
                    System.out.print("ID: "); String id = sc.nextLine();
                    System.out.print("Name: "); String name = sc.nextLine();
                    System.out.print("Qty: "); int q = sc.nextInt();
                    System.out.print("Price: "); double p = sc.nextDouble();
                    inv.addItem(new Item(id, name, q, p));
                    break;
                case 3: inv.displayAll(); break;
                
            }
        }
    }
}