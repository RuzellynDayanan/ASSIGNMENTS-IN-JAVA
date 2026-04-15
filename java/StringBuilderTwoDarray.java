public class StringBuilderTwoDarray {
    public static void main(String[] args) {
        
        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        
        System.out.print("   "); 
        for (int col = 0; col < numbers[0].length; col++) {
            System.out.print("C" + col + " ");
        }
        System.out.println();

        
        for (int row = 0; row < numbers.length; row++) {
            System.out.print("R" + row + " ");
            for (int col = 0; col < numbers[row].length; col++) {
                System.out.print(numbers[row][col] + "  ");
            }
            System.out.println();
        }
    }
}
