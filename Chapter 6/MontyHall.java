import java.util.Random;

public class MontyHall
{
    public static void main(String[] args)
    {
        Random rdm = new Random();

        int stickCount = 0;
        int switchCount = 0;
        for(int x = 0; x < 1000; x++)
        {
            int correctDoor = rdm.nextInt(3) + 1;
            int firstChoice = rdm.nextInt(3) + 1;
            int goatDoor = 0;

            do
            {
                goatDoor = rdm.nextInt(3) + 1;
            }
            while((goatDoor == firstChoice) || (goatDoor == correctDoor));

            if( firstChoice == correctDoor)
            {
                stickCount++;
            }
            else
            {
                switchCount++;
            }
        }
        
        System.out.println("Stick count:" + stickCount);
        System.out.println("Switch count:" + switchCount);
    }
}
