

public class NestedLoops
{
    public static void main(String[] args)
    {
//         for(int x = 1; x < 3; x++)
//         {
//             for(int y = 1; y < 5; y++)
//             {
//                 System.out.println(x + " " + y);
//             }
//         }
//         int x = 1;
//         while(x < 3)
//         {
//             int y = 1;
//             while(y < 5)
//             {
//                 System.out.println(x + " " + y);
//                 y++;
//             }
//             x++;
//         }
        
         int x = 1;
        do
        {
            
            int y = 1;
            do
            {
                System.out.println(x + " " + y);
                y++;
            }
            while(y < 5);
            x++;
        }
        while(x < 3);
    }
}
