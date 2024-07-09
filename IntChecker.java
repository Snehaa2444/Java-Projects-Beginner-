import java.util.*;

public class IntChecker
{
    public static void main(String [] args)
    {
        int no;
        System.out.println("Enter any number");
        Scanner scanner = new Scanner(System.in);
        no = scanner.nextInt();

        if(no > 0)
        {
            System.out.println("The number you entered is a Positive integer!");
        }
        else if (no < 0)
        {
            System.out.println("The number you entered is a Negative integer");
        }
        else
        {
            System.out.println("The number you entered is Zero!");
        }
    }
}
