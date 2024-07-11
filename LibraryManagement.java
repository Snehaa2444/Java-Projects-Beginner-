import java.util.*;

public class LibraryManagement
{
    public static void main(String [] args)
    {
        int book1 =0;
        int book2= 0;
        int book3= 0;
        int book4= 0;
        int book5= 0;
        int choice=0;

        do
        {
            System.out.println("What do you want to do?");
            System.out.println("1.) List of books");
            System.out.println("2.) Issue a book");
            System.out.println("3.) Return a book");
            System.out.println("4.) Exit");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();

            switch(choice)
            {
                case 1: System.out.println("~The Kite Runner\nBy- Khaled Hosseini\nId- 2345\n");
                    System.out.println("~The Alchemist\nBy- Paulo Coelho\nId- 9584\n");
                    System.out.println("~Rich Dad Poor Dad\nBy- Robert Kiyosaki\nId-  4267\n");
                    System.out.println("~The intelligent investor\nBy- Benjamin Graham\nId - 1278\n");
                    System.out.println("~Atomic Habits\nBy- James Clear\nId- 3940\n");
                    break;
                case 2: System.out.println("Enter the Book Id:");
                    int id= scanner.nextInt();
                    if(id == 2345)
                    {
                        if(book1 == 0)
                        {book1=1;
                            System.out.println("Book with id:"+id+" has been issued to you!");}
                        else
                        {System.out.println("Book has already been issued.");}
                    }
                    else if(id==9584)
                    {
                        if(book2 == 0)
                        {book2=1;
                            System.out.println("Book with id:"+id+" has been issued to you!");}
                        else
                        {System.out.println("Book has already been issued.");}
                    }
                    else if(id==4267)
                    {
                        if(book3 == 0)
                        {book3=1;
                            System.out.println("Book with id:"+id+" has been issued to you!");}
                        else
                        {System.out.println("Book has already been issued.");}
                    }
                    else if(id==1278)
                    {
                        if(book4 == 0)
                        {book4=1;
                            System.out.println("Book with id:"+id+" has been issued to you!");}
                        else
                        {System.out.println("Book has already been issued.");}
                    }
                    else if(id==3940)
                    {
                        if(book5 == 0)
                        {book5=1;
                            System.out.println("Book with id:"+id+" has been issued to you!");}
                        else
                        {System.out.println("Book has already been issued.");}
                    }

                    break;
                case 3: System.out.println("Enter the id of the book you want to return:");
                    int id2 = scanner.nextInt();
                    if(id2==2345)
                    {
                        if(book1 == 1)
                        {book1=0;
                            System.out.println("Book has been returned.");}
                        else
                        {System.out.println("This book has not been issued");}
                    }
                    if(id2==9584)
                    {
                        if(book2 == 1)
                        {book2=0;
                            System.out.println("Book has been returned.");}
                        else
                        {System.out.println("This book has not been issued");}
                    }
                    if(id2==4267)
                    {
                        if(book3 == 1)
                        {book3=0;
                            System.out.println("Book has been returned.");}
                        else
                        {System.out.println("This book has not been issued");}
                    }
                    if(id2==1278)
                    {
                        if(book4 == 1)
                        {book4=0;
                            System.out.println("Book has been returned.");}
                        else
                        {System.out.println("This book has not been issued");}
                    }
                    if(id2==3940)
                    {
                        if(book5 == 1)
                        {book5=0;
                            System.out.println("Book has been returned.");}
                        else
                        {System.out.println("This book has not been issued");}
                    }
                    break;
                case 4: System.out.println("Thank you");
                    break;
                default: System.out.println("Wrong choice");
            }
        }while(choice!=4);
    }
}
