import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int num1 = input.nextInt();

        System.out.print("Input the second number: ");
        int num2 = input.nextInt();

        System.out.print("Input the third number: ");
        int num3 = input.nextInt();

        // Assume then compare
        int smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }if (num3 < smallest) {
            smallest = num3;
        }
        
        System.out.println("The smallest value is " + smallest + ".");
    }
}
