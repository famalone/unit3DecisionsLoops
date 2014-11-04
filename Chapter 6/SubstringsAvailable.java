import java.util.Scanner;

public class SubstringsAvailable
{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = s.next();
        for( int y = 1 ; y <= word.length() ; y++ ){
            for( int x = 0 ; x <= word.length()-y ; x++ ){
                    System.out.println(word.substring(x,x+y));
            }
        }
    }
}
