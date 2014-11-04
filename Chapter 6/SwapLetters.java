import java.util.Scanner;
import java.util.Random;

public class SwapLetters
{
   public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a word:");
       
       Random rnd = new Random();
       
       String word = input.next();
       
       for(int count = 0; count <= word.length(); count++)
       {
           int i = rnd.nextInt(word.length() - 2);
           int j = rnd.nextInt(word.length() - (i + 1)) + i + 1;
           
           String first = word.substring(0, i);
           String middle = word.substring(i + 1, j);
           String last = word.substring(j + 1);
           
           word = first + word.charAt(j) + middle + word.charAt(i) + last;
        }
       
       System.out.println(word);
    }
}
