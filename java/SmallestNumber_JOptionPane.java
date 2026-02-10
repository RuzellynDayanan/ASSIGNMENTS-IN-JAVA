import javax.swing.JOptionPane;

public class SmallestNumber_JOptionPane {
    public static void main(String[] args) {
        // Input three numbers using dialog boxes
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Input the first number:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Input the second number:"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Input the third number:"));

        // Assume the first number is the smallest
        int smallest = num1;

        // Compare with the second number
        if (num2 < smallest) {
            smallest = num2;
        }

        // Compare with the third number
        if (num3 < smallest) {
            smallest = num3;
        }

        // Show the result in a message dialog
        JOptionPane.showMessageDialog(null, "The smallest value is " + smallest + ".");
    }
}
