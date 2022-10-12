package banking;
//import java.util.*;
abstract class applications
{
    //Scanner obj=new Scanner(System.in);
    //Random r=new Random();
    /*long accno;
    String name;
    long balance;
    long wd;
    long chac;
    long acno;*/
    abstract long checkacn(long accno);

    abstract long withdraw(long balance,long wd);
    abstract long deposit(long balance,long chac);
    abstract long checkb(long balance);
    abstract long fundtransfer(long balance,long accno,long acno);

}
