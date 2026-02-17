import java.util.Scanner;

public class PayrollSystem{
   public static void main(String [] args){
   Scanner sc = new Scanner(System.in);
   char again = 'Y'; 
   
      while (again == 'Y' || again == 'y'){
   
      System.out.println("CHOOSE EMPLOYEE TYPE");
      System.out.println("1 - Regular Employee \n2 -  Employee with overtime \n3 - Manager");
      System.out.print("Enter choice: ");
      int type = sc.nextInt();
      
         if(type == 1){
            System.out.print("Enter hourly rate: ");
            double rate = sc.nextDouble();
            System.out.print("Enter hours worked: ");
            double hrs = sc.nextDouble();
            System.out.print("Total Salary: ");
            System.out.print(computeSalary(rate, hrs) + " pesos");
            
         }else if(type == 2){
            System.out.print("Enter hourly rate: ");
            double rate = sc.nextDouble();
            System.out.print("Enter hours worked: ");
            double hrs = sc.nextDouble();
            System.out.print("Enter overtime hours: ");
            double ot = sc.nextDouble();
            System.out.print("Total Salary: ");
            System.out.println(computeSalary(rate, hrs, ot) + " pesos");
      
         }else if(type == 3){
            System.out.print("Enter monthly salary: ");
            double monthly = sc.nextDouble();
            System.out.print("Total Salary: ");
            System.out.print(computeSalary(monthly) + " pesos"); 
         
         }else{
            System.out.println("Invalid input.");
         }
         
         System.out.print("\n\nDo you want to retry? (Y?N): ");
         again = sc.next().charAt(0);
         }
         
         System.out.print("Thank you!");
         sc.close();
   }
         
               static double computeSalary(double hourlyRate, double hoursWorked){
                  return hourlyRate * hoursWorked;       
               }
        
               static double computeSalary(double hourlyRate, double hoursWorked, double overtime){
                  return (hourlyRate * hoursWorked) + (hourlyRate * overtime);
               }
         
         
               static double computeSalary(double monthlySalary){
                  return monthlySalary;
               }  

}