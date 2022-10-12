package vehicles;
import java.util.*;
public class petrol extends engine
{
    public petrol()
    {

        super("p1000",996,50,6000,90,75,3,"11.0:1","na","na");
    }
    public void display()
    {
        System.out.println("petrol" +" "+mn+" "+mp+" "+mr+" "+mt+" "+w+""+c+" "+com+" "+cur+" "+vol);
    }
}
