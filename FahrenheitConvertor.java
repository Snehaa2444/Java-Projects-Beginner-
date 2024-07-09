import java.util.*;

public class FahrenheitConvertor
{
    public static void main(String [] args)
    {
        double celsius;
        double fahrenheit;
        System.out.println("Enter the temperature in degree Fahrenheit that you want to convert to Celsius :");
        Scanner obj = new Scanner(System.in);
        fahrenheit = obj.nextDouble();

        celsius = ((fahrenheit - 32) * 5/9);
        System.out.println("Temperature in Celsius is: "+celsius);
    }
}
