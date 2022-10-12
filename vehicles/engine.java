package vehicles;

public class engine
{
    String mn;
    int dis;
    int mp;
    int mr;
    int mt;
    int w;
    int c;
    String com;
    String cur;
    String vol;
    public engine(String mn,int dis,int mp,int mr,int mt,int w,int c,String com,String cur,String vol)
    {
        this.mn=mn;
        this.dis=dis;
        this.mp=mp;
        this.mr=mr;
        this.mt=mt;
        this.w=w;
        this.c=c;
        this.com=com;
        this.cur=cur;
        this.vol=vol;
    }
    public static void main(String[] args)
    {
        petrol p=new petrol();
        p.display();
        diesel d=new diesel();
        d.display();
        cng c=new cng();
        c.display();
        electric e=new electric();
        e.display();

    }
}
