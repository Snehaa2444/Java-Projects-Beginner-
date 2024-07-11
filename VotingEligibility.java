import java.util.*;

public class VotingEligibility
{
    public static void main(String [] args)
    {
        int age;
        System.out.print("Enter your age:");
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();

        if(age>18)
        {
            System.out.println("You are eligible to vote");
        }
        else
        {
            System.out.println("You are not eligible to vote");
        }

    }
}
