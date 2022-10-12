package furniture.com;

public class furnitureitem
{
    private int fcode;
    private String type;
    private String grade;
    private String color;
    private String usage;
    private int price;
    public static final int discount =5;
    public furnitureitem()
    {

    }
    public int getFcode()
    {
        return fcode;
    }
    public void setFcode(int fcode)
    {
        this.fcode=fcode;
    }
    public String getType()
    {
        return type;
    }
    public void setType(String type)
    {
        this.type=type;
    }
    public String getGrade()
    {
        return grade;
    }
    public void setGrade(String grade)
    {
        this.grade=grade;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public String getUsage()
    {
        return usage;
    }
    public void setUsage(String usage)
    {
        this.usage=usage;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }
    public float calculatr_discount(String grade,String usage,int price)
    {
        float dp;
        if((grade.equals("grade 1")) && (usage.equals("outdoor")))
        {
            System.out.println("Discount is available");
            dp=(price*95)/100;
        }
        else
        {
            System.out.println("no discount available");
            dp=price;
        }
        return(dp);
    }
}
