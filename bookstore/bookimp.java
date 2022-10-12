package bookstore;
import java.util.*;
public class bookimp
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        Random r=new Random();
        System.out.println("The isbn number of the book is :");
        int bn=r.nextInt(900);
        System.out.println(bn);
        System.out.println("Enter the title of the book :");
        String t=obj.nextLine();
        System.out.println("Enter the description of the book :");
        String d=obj.nextLine();
        System.out.println("Enter the price of the book :");
        int p=r.nextInt(9000);
        System.out.println(p);
        System.out.println("Enter the name of the author of the book :");
        String n=obj.nextLine();
        System.out.println("Enter the pen name of the author of the book :");
        String pn=obj.nextLine();
        author a=new author(n,pn);
        book b=new book(bn,t,d,p,a);
        b.display();
        System.out.println(b.caldis(d,p));

    }
}
