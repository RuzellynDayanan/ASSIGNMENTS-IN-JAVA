import java.util.Scanner;
public class Array_inputDisplay{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
   	
		System.out.print("Enter a number: ");
      int n = sc.nextInt();
      
      int [] num = new int [n];
      
		for(int i=0; i < num.length; i++){
			System.out.print("index " + (i + 1) + " value: ");
         num[i] = sc.nextInt();         
		}
      
      System.out.print("Entered value: ");
      for(int i = 0; i < num.length; i++){
         System.out.print(num[i] + " ");
      }
		System.out.println();
	}
	
}


// This is a simple 1d array input from user and display 
//dapat duha ka for loop, bawal sagul
//if sagul kay ma print:
/* Enter a number: 3
   index1 value: 1
   1index2 value:          - ma apil ang  1 since way new line */