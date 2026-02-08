import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int num1 = scan.nextInt();

        System.out.print("Input the second number: ");
        int num2 = scan.nextInt();

        System.out.print("Input the third number: ");
        int num3 = scan.nextInt();

        double average = (num1 + num2 + num3) / 3.0;

        System.out.println("The average value is " + average);

        scan.close();
    }
}
