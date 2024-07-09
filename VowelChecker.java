import java.util.*;

public class VowelChecker
{
    public static void main(String [] args)
    {
        char Alpha;
        System.out.println("Enter any Alphabet ");
        Scanner obj = new Scanner (System.in);
        Alpha = obj.next().charAt(0);
        Alpha = Character.toLowerCase(Alpha);

        if(Alpha == 'a' || Alpha == 'e' || Alpha == 'i' || Alpha == 'o' || Alpha == 'u')
        {
            System.out.println("The Alphabet you entered is a vowel");
        }
        else
        {
            System.out.println("The Alphabet you entered is a consonant");
        }
    }
}
