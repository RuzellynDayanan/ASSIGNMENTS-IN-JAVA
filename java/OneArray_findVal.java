import java.util.Scanner;
public class OneArray_findVal{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);  
        
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        
        int [] num = new int [n];
        for(int i  = 0; i < num.length; i++){
            System.out.print("index " + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }
        
        System.out.print("Display: ");
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
        
        System.out.print("\nFind Value Inputed" + "\nEnter a number: ");
        int val = sc.nextInt();
        
        boolean found = false;
        for (int i =0; i < num.length; i++){
            if(num[i] == val){
                System.out.print("Value found at index " + i + ": " + num[i]);
                found = true;
                break;
            }
        }
        
        if(!found){
            System.out.print("Number inputed not found");
        }
    }
    
}

/* 
this is 1D array  about combining display, input user and finding a ceratin array element 

*/