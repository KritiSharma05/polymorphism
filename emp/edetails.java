package emp;

public class edetails
{
    String dept;
    String pos;
    int sal;
    name n;
    address ad;

    public edetails(String dept,String pos,int sal,name n,address ad)
    {

        this.dept=dept;
        this.pos=pos;
        this.sal=sal;
        this.n=n;
        this.ad=ad;
    }

    public void displaybookdetail()
    {

        System.out.println(this.dept+"  "+this.pos+"  "+this.sal);
        System.out.println(n.Name+"    "+n.lName );
        System.out.println(ad.b+" "+ad.ar +" "+ad.sa+"  "+ad.p);
    }

}
