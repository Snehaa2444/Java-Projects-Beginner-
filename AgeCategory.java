import java.util.*;

public class AgeCategory
{
    public static void main(String [] args)
    {
        int age;
        System.out.print("Enter your age:");
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();

        if(age<13)
        {
            System.out.println("You are a child");
        }
        else if (age>=13 && age<=19)
        {
            System.out.println("You are a teenage");
        }
        else if(age>20 && age<=64)
        {
            System.out.println("You are a adult");
        }
        else
        {
            System.out.println("You are a senior citizen");
        }

    }
}
