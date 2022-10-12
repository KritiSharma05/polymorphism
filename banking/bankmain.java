package banking;
import java.util.*;
public class bankmain
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Enter the name of the account holder : ");
        String name = obj.nextLine();
        System.out.println("Enter 1) for saving account and 2) for payment account ");
        int i = obj.nextInt();
        long balance = r.nextLong(900000);
        System.out.println("The balance in the account is :");
        System.out.println(balance);
        saveaccount sa = new saveaccount();
        pay p=new pay();
        System.out.println("Enter the account number");
        long an = r.nextLong(900000000000l);
        System.out.println(sa.checkacn(an));
        System.out.println("Enter 1 to withdraw , 2 to deposit , 3 to check balance , 4 to transfer funds");
        int j = obj.nextInt();
        if (i == 1)
        {
            System.out.println("****** Welcome to your saving account ******");
            if (j == 1)
            {
                System.out.println("Enter the amount to be withdrawn : ");
                long wd = obj.nextLong();
                System.out.println(sa.withdraw(balance, wd));
            }
            else if (j == 2)
            {
                long chac = r.nextLong(900000000000l);
                System.out.println(sa.deposit(balance, chac));
            }
            else if (j == 3)
            {
                System.out.println(sa.checkb(balance));
            }
            else if(j==4)
            {
                System.out.println("Enter the account number to which you want to transfer funds to :");
                long ta=r.nextLong(900000000000l);
                System.out.println(sa.checkacn(ta));
                System.out.println(sa.fundtransfer(balance,an,ta));
            }
            System.out.println(sa.interest(balance));
        }
        if (i == 2)
        {
            System.out.println("****** Welcome to your payment account ******");
            if (j == 1)
            {
                System.out.println("Enter the amount to be withdrawn : ");
                long wd = obj.nextLong();
                System.out.println(p.withdraw(balance, wd));
            }
            else if (j == 2)
            {
                long chac = r.nextLong(900000000000l);
                System.out.println(p.deposit(balance, chac));
            }
            else if (j == 3)
            {
                System.out.println(p.checkb(balance));
            }
            else if(j==4)
            {
                System.out.println("Enter the account number to which you want to transfer funds to :");
                long ta=r.nextLong(900000000000l);
                System.out.println(p.checkacn(ta));
                System.out.println(p.fundtransfer(balance,an,ta));
            }
        }
    }
}
