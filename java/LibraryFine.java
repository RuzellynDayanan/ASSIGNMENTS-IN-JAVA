import java.util.Scanner;

public class LibraryFine{
   public static void main(String [] args){
   Scanner sc = new Scanner (System.in);
      System.out.println("PLIBRARYH FINE");
      System.out.println("Choose Borrower Type \n1 - Regular Borrower\n2 - Student Borrower \n3 - Faculty Borrower");
      char again = 'Y';
      
      while(again == 'Y' || again == 'y'){
         System.out.print("Enter choice: ");
         int choice = sc.nextInt();
      
         if(choice == 1){
            System.out.print("Enter Days Late: ");
            double late = sc.nextDouble();
            System.out.println("Total Fine: " + computeFine(late));
         
         }else if(choice == 2){
            System.out.print("Enter Days Fine: ");
            double fine = sc.nextDouble();
            System.out.print("Enter Days Late: ");
            double late = sc.nextDouble();
            System.out.println("Total Fine: " + computeFine(fine, late));
         
         }else if(choice == 3){
            System.out.print("Enter Days Fine: ");
            double fine = sc.nextDouble();
            System.out.print("Enter Days Late: ");
            double late = sc.nextDouble();
            System.out.print("Enter Discount Rate: ");
            double dc = sc.nextDouble();
            double discount1;
            System.out.println("Total Fine: " + computeFine(fine, late, dc));
            
         }else{
            System.out.println("Invalid. Try again.");
         }
   
         System.out.print("Do you want to try again? (Y|N): ");
         again = sc.next().charAt(0);
      }
      
   System.out.println("Thank you!");   
   sc.close();
   
   }
         static double computeFine(double Dlate){
            return Dlate * 10;
         } 
         
         static double computeFine(double Dfine, double Dlate){
            return Dfine * Dlate;         
         }
         
         static double computeFine(double Dfine, double Dlate, double dc){
            double discount1 = (Dfine * Dlate) * dc; 
            return (Dfine * Dlate) - discount1;
                     
         }



}