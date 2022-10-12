package com.election;
import java.util.*;
public class voterimp
{
    public static void main(String[] args)
    {
        voter v=new voter();
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter name of voter :");
        String n =obj.nextLine();
        System.out.println("Enter age of voter :");
        int a =obj.nextInt();
        v.setName(n);
        v.setAge(a);
        System.out.println( v.eligibility(n,a) );
    }
}
