package emp;
class eimp
{
    public static void main(String[] args)
    {
        // Author author=new Author("ABC","X",1980);
        edetails ed=new edetails("IT","Engineer",50000,new name("Kriti","Sharma"),new address(23,"Cp","Delhi",110035));
        System.out.println(ed.dept+" "+ed.pos+" "+ed.sal);
        System.out.println(ed.n.Name+" "+ed.n.lName);
        System.out.println(ed.ad.b+" "+ed.ad.ar+" "+ed.ad.sa+" "+ed.ad.p);
    }
}