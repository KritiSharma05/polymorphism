package com.election;

public class voter
{
    private String name;
    private int age;
    public final static int voter_eligibility_age=18;
    public voter()
    {

    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public String eligibility(String name,int age)
    {
        String result;
        if(age>=18)
        {
            result=name+" "+"is eligible to vote";
        }
        else if(age>=0 && age<18)
        {
            result=name+" "+"is not  eligible to vote";
        }
        else
        {
            result="age cannot be negative or zero";
        }
        return(result);
    }

}
