package banking;
import java.util.*;
public class saveaccount extends applications
{
    Scanner obj=new Scanner(System.in);
    Random r=new Random();
    long accno;
    String name;
    long balance;
    long wd;
    long chac;
    long acno;
    long checkacn(long accno)
    {
        int count=0;
        long n=accno,i;
        while(accno>0)
        {
            i=accno%10;
            count =count+1;
            accno=accno/10;
        }
        if(count==12)
        {
            System.out.println("Account number accepted");

        }
        else
        {
            System.out.println("Account number should be 12 digit long");
        }
        return(n);
    }
    long withdraw(long balance,long wd)
    {
        balance=balance-wd;
        System.out.println("The balance is :");
        return(balance);
    }
    long deposit(long balance,long chac)
    {
        System.out.println("Enter 1) for cash deposit and 2) for cheque deposit");
        int n=obj.nextInt();
        if(n==1)
        {
            System.out.println("Enter the amount of cash you want to deposit :");
            long bal=obj.nextInt();
            balance=balance+bal;
            System.out.println("The balance is :");
            return(balance);
        }
        else
        {
            System.out.println("Enter the cheque details ");
            System.out.println("Enter the account number ");
            long acc=checkacn(chac);
            System.out.println(acc);
            System.out.println("Enter the amount to be deposited");
            long de=obj.nextLong();
            balance=balance+de;
            System.out.println("The balance is :");
            return(balance);
        }
    }
    long checkb(long balance)
    {
        System.out.println("The balance is : ");
        return(balance);
    }
    long fundtransfer(long balance,long accno,long acno)
    {
        System.out.println("Enter the amount you want to transfer :");
        long fund = obj.nextLong();
        balance=balance-fund;
        System.out.println("Fund has been transferred successfully");
        System.out.println("The balance is :");
        return(balance);
    }
    public double interest(long balance)
    {
        double inter;
        inter=(balance*125)/1000;
        System.out.println("The balance after yearly interset  is :");
        return(inter);
    }
}
