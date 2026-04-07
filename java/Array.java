import java.util.Scanner;
//1D array: declared elements, determine highest and lowest, determine average,  determine how many are above average


public class Array{
   public static void main(String [] args){
   Scanner sc = new Scanner(System.in);
   int sum = 0;
   
   int [] numbers = new int [] {12, 45, 23, 67, 34, 89, 10};
   
   int highest = numbers[0];
   int lowest = numbers[0];
   
   for (int num : numbers){
      if (num > highest){
         highest = num;
      }
      if (num < lowest){
         lowest = num;
      }
      sum += num;
   }
   
   double avg = sum / numbers.length;
   
   int aboveAvg = 0;
   for (int num : numbers){
      if (num >= avg){
         aboveAvg++;
      }
   }
   
   System.out.println("Highest = " + highest);
   System.out.println("Lowest = " + lowest);
   System.out.println("Average = " + avg);
   System.out.println("Count above Average = " + aboveAvg);
   
   sc.close();
   
   }
}