import java.util.Scanner;

public class smallestNum{
   public static void main(String [] args){
      Scanner sc = new Scanner (System.in);
      
      System.out.println("Enter value of x: ");
      double x = sc.nextDouble();
      
      System.out.print("Enter value of y: ");
      double y = sc.nextDouble();
      
      System.out.print("Enter value of z: ");
      double z = sc.nextDouble();
     
      double minimum = x;
      
         if(y < minimum){
            minimum = y;
         }else if(z < minimum){
            minimum = z;
         }
         
         value(minimum);
         
         sc.close();         
   
   }
   
      static void value(double smallVal){
         System.out.println("Samllest value is " + smallVal);
      }
      
}