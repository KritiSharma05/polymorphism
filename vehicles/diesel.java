package vehicles;

import java.util.Scanner;

public class diesel  extends engine
{
    public diesel()
    {

        super("d1300",1248,67,6000,200,111,4,"17.6:1","na","na");
    }
    public void display()
    {
        System.out.println("Diesel" +" "+mn+" "+mp+" "+mr+" "+mt+" "+w+""+c+" "+com+" "+cur+" "+vol);
    }
}
