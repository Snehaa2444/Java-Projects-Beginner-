import java.util.*;

public class CelsiusConvertor
{
    public static void main(String [] args)
    {
        double celsius;
        double fahrenheit;
        System.out.println("Enter the temperature in degree Celsius that you want to convert to Fahrenheit:");
        Scanner obj = new Scanner(System.in);
        celsius = obj.nextDouble();

        fahrenheit = ((celsius *9/5) + 32);
        System.out.println("Temperature in Fahrenheit is: "+fahrenheit);
    }
}
