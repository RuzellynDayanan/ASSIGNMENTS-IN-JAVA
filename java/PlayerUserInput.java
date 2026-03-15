import java.util.Scanner;

class Player{
   String name;
   int level;
   int mp;
   int Exp;
   
   void sentence(){
      System.out.println("The player " + name + " is level " + level);
      System.out.println("The player " +  name + " has " + mp + " mp");
      System.out.println("The plalyer " + name + " has " + Exp + " Exp");
   }
}

public class PlayerUserInput{
   public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      char choice = 'Y';
      
     
      while(choice == 'Y' || choice == 'y'){
   
        System.out.print("Enter player name: ");
        String pName = sc.nextLine();
        System.out.print("Enter player level: ");
        int pLevel = sc.nextInt();
        System.out.print("Enter player mp: ");
        int pMp = sc.nextInt();
        System.out.print("Enter player Exp: ");
        int pExp = sc.nextInt();
        
        Player p1 = new Player();
        p1.name = pName;
        p1.level = pLevel;
        p1.mp = pMp;
        p1.Exp = pExp;
        
        System.out.println("\nPLAYER INFORMATION");
        
        p1.sentence();
        
        System.out.print("\nDo you want to try again? (Y|N): ");
        choice = sc.next().charAt(0);
        
        sc.nextLine();  //para ma clear ang leftover newline then ma read si "Enter player name: " in 2nd loop
      }
      
      System.out.println("Thank you!");
      sc.close();
   }
}