import java.util.Scanner;
//1D array:  declared elements, determine highest and lowest, determine average,  determine how many are above average, User Input Version


public class ArrayUserInputversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask user for array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        // Step 2: Input values
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Step 3: Initialize variables
        int highest = numbers[0];
        int lowest = numbers[0];
        int sum = 0;

        // Step 4: Process array
        for (int num : numbers) {
            if (num > highest) highest = num;
            if (num < lowest) lowest = num;
            sum += num;
        }

        // Step 5: Compute average
        double average = (double) sum / n;

        // Step 6: Count above average
        int countAboveAverage = 0;
        for (int num : numbers) {
            if (num > average) {
                countAboveAverage++;
            }
        }

        // Step 7: Display results
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
        System.out.println("Average: " + average);
        System.out.println("Count above average: " + countAboveAverage);

        sc.close();
    }
}
