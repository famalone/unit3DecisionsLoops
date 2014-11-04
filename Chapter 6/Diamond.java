import java.util.Scanner;
public class Diamond
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a sidelengh for a diamond: ");
        int sideLength = s.nextInt();
        int currentLine = 0;
        
        for( int z = 1 ; z < sideLength ; z++){
        for( int x = 0 ; x < sideLength-currentLine-1 ; x++ ){
            System.out.print(" ");
        }
        for( int y = 0 ; y < 2*currentLine+1 ; y++ ){
            System.out.print("*");
        }
        currentLine++;
        System.out.println("");
      }
        for( int z = 0 ; z < sideLength ; z++){
        for( int x = 0 ; x < sideLength-currentLine-1 ; x++ ){
            System.out.print(" ");
        }
        for( int y = 0 ; y < 2*currentLine+1 ; y++ ){
            System.out.print("*");
        }
        currentLine--;
        System.out.println("");
      }
    }
}
