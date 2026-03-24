import java.util.Scanner;

public class arraySumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for number of elements
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        int sum = 0;

        // Input and sum in the same loop
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];  // add immediately
        }

        // Average calculation
        double average = (double) sum / n;

        // Output
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        scanner.close();
    }
}
