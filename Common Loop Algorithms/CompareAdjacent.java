import java.util.Scanner;

/**
 * 
 */
public class CompareAdjacent
{
   public static void main(String[] args)
   {
       final double EPSILON = 1e-7;
       
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a series of numbers (type 'q' to exit).");
       
       double prevValue;
       double currentValue = input.nextDouble();
       while(input.hasNextDouble())
       {
           prevValue = currentValue;
           currentValue = input.nextDouble();
           
           if(Math.abs(currentValue - prevValue) < EPSILON)
           {
               System.out.println("Duplicate numbers.");
            }
        }
    }
}
