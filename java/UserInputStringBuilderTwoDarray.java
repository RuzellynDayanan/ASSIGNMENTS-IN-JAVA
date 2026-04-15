import java.util.Scanner;
public class UserInputStringBuilderTwoDarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        
        int[][] numbers = new int[rows][cols];

        
        System.out.println("Enter the numbers for the grid:");
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                System.out.print("Value at R" + r + "C" + c + ": ");
                numbers[r][c] = sc.nextInt();
            }
        }

        
        System.out.print("   "); 
        for (int c = 0; c < cols; c++) {
            System.out.print("C" + c + " ");
        }
        System.out.println();

        
        for (int r = 0; r < rows; r++) {
            System.out.print("R" + r + " ");
            for (int c = 0; c < cols; c++) {
                System.out.print(numbers[r][c] + "  ");
            }
            System.out.println();
        }

        sc.close();
    }
}
