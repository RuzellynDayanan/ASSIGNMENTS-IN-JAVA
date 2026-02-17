import java.util.Scanner;

public class computeAverage{
   public static void main(String [] args){
   Scanner sc = new Scanner(System.in);
   
   System.out.println("COMPUTE AVERAGE");
   System.out.print("Enter score 1: ");
   double score1 = sc.nextDouble();
   
   System.out.print("Enter score 2: ");
   double score2 = sc.nextDouble();
   
   System.out.print("Enter score 3: ");
   double score3 = sc.nextDouble();
   
   System.out.printf("Average score: %.2f\n", average(score1, score2, score3));                       //  \n or %n
   System.out.print("Average score: " + String.format("%.2f", average(score1, score2, score3)));
   
   sc.close();
   
   }
   
   static double average(double x, double y, double z){
      return (x + y + z) / 3;
   }

}