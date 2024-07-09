import java.util.*;

public class LoginSetup
{
    public static void main(String [] args)
    {
        String username=null;
        String password=null;
        int choice;

        do {
        System.out.println("what do you wnt to do?");
        System.out.println("1.) Register as a user");
        System.out.println("2.) Check credentials");
        System.out.println("3.) Exit");
        Scanner obj = new Scanner(System.in);
        choice = obj.nextInt();



            switch (choice) {
                case 1:
                    System.out.println("Enter Username:");
                    username = obj.next();
                    System.out.println("Enter Password:");
                    password = obj.next();
                    System.out.println("Credentials saved!");
                    break;

                case 2:
                    System.out.println("Checking Credentials...");
                    System.out.println("Enter Username: ");
                    String a = obj.next();
                    if (!username.equals(a)) {
                        System.out.println("Invalid username!");
                    }
                    System.out.println("Enter password: ");
                    String b = obj.next();
                    if (!password.equals(b)) {
                        System.out.println("Incorrect password!");
                    }
                    System.out.println("Credentials checked! You have logged in successfully!");
            }
        }while(choice!= 3);

    }
}
