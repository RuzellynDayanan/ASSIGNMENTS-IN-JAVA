import java.util.Scanner;

public class SimpleStore_Act1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char again = 'Y';

        while (again == 'Y' || again == 'y') {
            System.out.println(" SCHOOL SUPPLIES STORE ");
            System.out.println("1. Paper - 5.99 php");
            System.out.println("2. Pencil - 15.45 php");
            System.out.println("3. Eraser - 9.90 php");

            System.out.print("Choose an item (1-3): ");
            int choice = scan.nextInt();

            if (choice == 1) {
                System.out.print("Enter quantity: ");
                int qty = scan.nextInt();
                double total = 5.99 * qty;
                System.out.println("You bought " + qty + " Paper(s).");
                System.out.println("Total amount: " + total);
            } else if (choice == 2) {
                System.out.print("Enter quantity: ");
                int qty = scan.nextInt();
                double total = 15.45 * qty;
                System.out.println("You bought " + qty + " Pencil(s).");
                System.out.println("Total amount: " + total);
            } else if (choice == 3) {
                System.out.print("Enter quantity: ");
                int qty = scan.nextInt();
                double total = 9.90 * qty;
                System.out.println("You bought " + qty + " Eraser(s).");
                System.out.println("Total amount: " + total);
            } else {
                System.out.println("Invalid choice. Please try again.");
            }

            System.out.print("Do you want to buy again? (Y/N): ");
            again = scan.next().charAt(0);
        }

        System.out.println("Thank you for shopping!");
        scan.close();
    }
}
