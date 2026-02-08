import javax.swing.JOptionPane;

public class Compute_Average {
    public static void main(String[] args) {
        // Ask for three numbers using input dialogs
        String num1Str = JOptionPane.showInputDialog("Input the first number:");
        int num1 = Integer.parseInt(num1Str);

        String num2Str = JOptionPane.showInputDialog("Input the second number:");
        int num2 = Integer.parseInt(num2Str);

        String num3Str = JOptionPane.showInputDialog("Input the third number:");
        int num3 = Integer.parseInt(num3Str);

        // Compute average
        double average = (num1 + num2 + num3) / 3.0;

        // Show result in a message dialog
        JOptionPane.showMessageDialog(null, "The average value is " + average);
    }
}
