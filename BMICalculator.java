import java.util.*;

public class BMICalculator
{
    public static void main(String [] args)
    {
        float height;
        float weight;

        System.out.print("Enter weight in kg: ");
        Scanner scanner = new Scanner(System.in);
        weight = scanner.nextFloat();
        System.out.print("Enter height in m: ");
        height = scanner.nextFloat();

        float BMI= weight/(height * height);
        System.out.println("\nYour BMI is: "+BMI);

        if(BMI<18.5)
        {
            System.out.println("You are underweight");
        }
        else if (BMI>18.5 && BMI<24.9)
        {
            System.out.println("You're weight is normal");
        }
        else if(BMI>25 && BMI<29.9)
        {
            System.out.println("You are overweight");
        }
        else
        {
            System.out.println("You are obese");
        }

    }
}
