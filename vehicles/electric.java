package vehicles;

import java.util.Scanner;

public class electric extends engine
{
    public electric()
    {

        super("88",0,88,15000,220,45,0,"na","ac","360");
    }
    public void display()
    {
        System.out.println("electric" +" "+mn+" "+mp+" "+mr+" "+mt+" "+w+""+c+" "+com+" "+cur+" "+vol);
    }
}
