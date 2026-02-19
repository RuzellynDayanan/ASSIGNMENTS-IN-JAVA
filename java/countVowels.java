import java.util.Scanner;

public class countVowels{
   public static void main(String [] args){
   Scanner sc = new Scanner (System.in);
   
   System.out.print("Enter a word: ");
   String word = sc.nextLine();
   
   System.out.println("The word contains " + wordVowel(word) + " vowels");
   
   sc.close();
   }
   
   static int  wordVowel(String word1){
      int letter = 0;
      for (int i = 0; i < word1.length(); i++){
         
         if(word1.charAt(i) == 'a' || word1.charAt(i) == 'e' || word1.charAt(i) == 'i' || word1.charAt(i) == 'o'|| word1.charAt(i) == 'u'){
            letter++;
         }
       }
         return letter;
   
   }
   

}