import java.util.*;

public class OddEven
{
    public static void main(String [] args)
    {
        int no;
        System.out.println("Enter any number ");
        Scanner obj = new Scanner (System.in);
        no = obj.nextInt();

        if((no%2) == 0)
        {
            System.out.println("The number you entered if Even!");
        }
        else
        {
            System.out.println("The number you entered is odd!");
        }
    }
}
