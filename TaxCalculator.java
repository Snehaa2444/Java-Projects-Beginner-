import java.util.*;

public class TaxCalculator
{
    public static void main( String [] args)
    {
        int sal;
        double tax=0;
        System.out.print("Enter your salary");
        Scanner scanner = new Scanner(System.in);
        sal = scanner.nextInt();

        if(sal <=10000)
        {
            tax = 0;
        }
        else if(10000<sal && sal<=100000)
        {
            tax = 0.1*sal;
        }
        else if(sal > 100000)
        {
            tax = 0.2*sal;
        }
        System.out.print("Your tax is rupees: "+tax);

    }
}
