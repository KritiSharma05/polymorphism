package vehicles;
public class type extends engine
{
    String etype;
    public type(String etype)
    {

        super("p1000",996,50,6000,90,75,3,"11.0:1","na","na");
        this.etype=etype;
    }
    public void display()
    {
        System.out.println(etype+" "+mn+" "+mp+" "+mr+" "+mt+" "+w+""+c+" "+com+" "+cur+" "+vol);
    }
}
