import java.util.Scanner;

public class SentenceBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine();
        
         String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter word " + (i + 1) + ": ");
            words[i] = sc.nextLine();
        }

        
        StringBuilder sentence = new StringBuilder();

        
        for (String word : words) {
            if (word.length() % 2 == 0) {
               
                sentence.append(new StringBuilder(word).reverse());
            } else {
                
                sentence.append(word);
            }
            sentence.append(" "); 
        }

        
        System.out.println("Final sentence: " + sentence.toString().trim());

        sc.close();
    }
}
