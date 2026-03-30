public class DuplicateArray {
    public static void main(String[] args) {
        
        int[][] array = {
            {1, 2, 3},
            {4, 2, 5},
            {6, 3, 1}
        };
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = i; k < array.length; k++) {
                    for (int l = (k == i ? j + 1 : 0); l < array[k].length; l++) {
                        if (array[i][j] == array[k][l]) {
                            System.out.println("Duplicate found are: " + array[i][j]);
                        }
                    }
                }
            }
        }
        
    }
}