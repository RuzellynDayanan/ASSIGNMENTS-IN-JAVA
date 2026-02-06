import javax.swing.JOptionPane;

public class SimpleStore {
    public static void main(String[] args) {
        char again = 'Y';

        while (again == 'Y' || again == 'y') {
            // Show menu
            String menu = " SCHOOL SUPPLIES STORE \n"
                        + "1. Paper - 5.99 php\n"
                        + "2. Pencil - 15.45 php\n"
                        + "3. Eraser - 9.90 php\n"
                        + "Choose an item (1-3):";
            
            String choiceStr = JOptionPane.showInputDialog(menu);
            int choice = Integer.parseInt(choiceStr);

            if (choice == 1) {
                String qtyStr = JOptionPane.showInputDialog("Enter quantity:");
                int qty = Integer.parseInt(qtyStr);
                double total = 5.99 * qty;
                JOptionPane.showMessageDialog(null, 
                    "You bought " + qty + " Paper(s).\nTotal amount: " + total);
            } else if (choice == 2) {
                String qtyStr = JOptionPane.showInputDialog("Enter quantity:");
                int qty = Integer.parseInt(qtyStr);
                double total = 15.45 * qty;
                JOptionPane.showMessageDialog(null, 
                    "You bought " + qty + " Pencil(s).\nTotal amount: " + total);
            } else if (choice == 3) {
                String qtyStr = JOptionPane.showInputDialog("Enter quantity:");
                int qty = Integer.parseInt(qtyStr);
                double total = 9.90 * qty;
                JOptionPane.showMessageDialog(null, 
                    "You bought " + qty + " Eraser(s).\nTotal amount: " + total);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
            }

            String againStr = JOptionPane.showInputDialog("Do you want to buy again? (Y/N):");
            again = againStr.charAt(0);
        }

        JOptionPane.showMessageDialog(null, "Thank you for shopping!");
    }
}
