import java.util.Scanner;
public class Display2D_arrayGiven{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        char [][] charArray = {
            {'S', '.', '.', '#'},
            {'#', '.', '.', '#'},
            {'#', '.', '.', '.'},
            {'#', '#', '.', 'G'}
        };
        
        System.out.println("Grid");
        for(int i = 0; i < charArray.length; i++){
            for(int j =0; j<charArray[i].length; j++){
            System.out.print(charArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}