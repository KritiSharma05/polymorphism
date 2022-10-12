package furniture.com;
import java.util.*;
public class furnitureimpl
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        Random r = new Random();
        furnitureitem fi = new furnitureitem();
        System.out.println("The funiture code is :");
        int fc = r.nextInt(90000);
        System.out.println(fc);
        System.out.println("Enter the type of furniture  :");
        String t = obj.nextLine();
        System.out.println("Enter the grade of furniture :");
        String g = obj.nextLine();
        System.out.println("Enter the color of the furniture :");
        String c = obj.nextLine();
        System.out.println("Enter the usage of furniture :");
        String u = obj.nextLine();
        System.out.println("Price of the furniture is :");
        int p = r.nextInt(9000);
        System.out.println(p);
        fi.setFcode(fc);
        fi.setType(t);
        fi.setGrade(g);
        fi.setColor(c);
        fi.setUsage(u);
        fi.setPrice(p);
        System.out.println(fi.calculatr_discount(g,u,p));
    }
}
