import java.util.Scanner;
public class Spectrum
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a wavelength: ");
        double wavelength = input.nextDouble();
        
        if(wavelength > Math.pow(10,-1))
        {
            System.out.println("that is the wavelength of a radio wave.");
        }
        else if(wavelength > Math.pow(10,-3))
        {
            System.out.println("that is the wavelength of a microwave.");
        }
        else if(wavelength > 7*(Math.pow(10,-7)))
        {
            System.out.println("that is the wavelength of infrared.");
        }
        else if(wavelength > 4*(Math.pow(10,-7)))
        {
            System.out.println("that is the wavelength of visible light.");
        }
        else if(wavelength > Math.pow(10,-8))
        {
            System.out.println("that is the wavelength of ultraviolet.");
        }
        else if(wavelength > Math.pow(10,-11))
        {
            System.out.println("that is the wavelength of X-rays.");
        }
        else
        {
            System.out.println("that is the wavelength of gamma rays.");
        }
        
    }
}
