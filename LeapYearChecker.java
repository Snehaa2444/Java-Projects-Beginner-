import java.util.*;

public class LeapYearChecker
{
    public static void main(String [] args)
    {
        int year;
        System.out.println("Enter the year you want to check");
        Scanner scanner = new Scanner(System.in);
        year=scanner.nextInt();

        if ((year%4)== 0)
        {
            System.out.println("The year you entered is a leap year!");
        }
        else
        {
            System.out.println("The year you entered is not a leap year!");
        }
    }
}
