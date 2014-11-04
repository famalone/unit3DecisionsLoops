import java.util.Random;

public class MontyHall
{
   public static void main(String[] args)
   {
       Random rdm = new Random();
       
       int correctDoor = rdm.nextInt(3) + 1;
       int firstChoice = rdm.nextInt(3) + 1;
       int goatDoor = 0;
       
       while((goatDoor == firstChoice) or (goatDoor == correctDoor))
       {
           goatDoor = rdm.nextInt(3) + 1;
       }
    }
}
