package vehicles;

import java.util.Scanner;

public class cng extends engine
{
    public cng()
    {

        super("c1000",998,43,6000,78,75,3,"11.0:1","na","na");
    }
    public void display()
    {
        System.out.println("cng" +" "+mn+" "+mp+" "+mr+" "+mt+" "+w+""+c+" "+com+" "+cur+" "+vol);
    }
}
