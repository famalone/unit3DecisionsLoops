import java.util.Scanner;

public class NumMethods
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a starting integer:");
        int fold1 = s.nextInt();
        System.out.println("Enter a number of repititions:");
        int n = s.nextInt();
        int fold2 = fold1;
        int fnew = 0;

        for(int x = 0; x < n; x++)
        {
            fnew = fold1 + fold2;
            fold2 = fold1;
            fold1 = fnew;
        }

        System.out.println(fnew);
    }
}
