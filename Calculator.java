import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("______________________________");
        System.out.println("|         Calculator         |");
        System.out.println("|____________________________|");
        System.out.println("|    1    |   2    |    3    |");
        System.out.println("|---------|--------|---------|");
        System.out.println("|    4    |   5    |    6    |");
        System.out.println("|---------|--------|---------|");
        System.out.println("|    7    |   8    |    9    |");
        System.out.println("|---------|--------|---------|");
        System.out.println("|    0    |   +    |    -    |");
        System.out.println("|---------|--------|---------|");
        System.out.println("|    C    |   *    |    /    |");
        System.out.println("|_________|________|_________|");
        boolean continueCal = true;
        while (continueCal)
        {
            System.out.println("Enter the first Operand: ");
            int a = scanner.nextInt();
            System.out.println("Enter the second Operand: ");
            int b = scanner.nextInt();
            System.out.println("What operation do you want to perform? ");
            char choice = scanner.next().charAt(0);
            switch (choice) {
                case '+':
                    Addition(a, b);
                    break;
                case '-':
                    Subtraction(a, b);
                    break;
                case '*':
                    Multiplication(a, b);
                    break;
                case '/':
                    Division(a, b);
                    break;
                default:
                    System.out.println("Wrong choice!");
                    break;
            }
            System.out.println("Do you want to continue? 1 for yes and 2 for no.");
            int response = scanner.nextInt();
            if(response != 1)
            {
                continueCal = false;
            }


        }
    }

    public static void Addition(int a,int b)
    {
        int c = a + b;
        System.out.println(c);
    }

    public static void Subtraction(int a,int b)
    {
        if(a>b)
        {
            int c = a-b;
            System.out.println(c);
        }
        else
        {
            System.out.println("Since Operand 1 is lesser than Operand 2 subtraction is not possible");
        }
    }

    public static void Multiplication (int a , int b)
    {
        int c = a*b;
        System.out.println(c);
    }

    public static void Division (int a, int b)
    {
        if(b!=0)
        {

            int c = a % b;
            System.out.println(c);
        }
        else
        {
            System.out.println("Since the Denominator is Zero, division not possible.");
        }
    }
}




