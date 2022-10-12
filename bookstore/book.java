package bookstore;

public class book
{
    int isbn;
    String title;
    String description;
    int price;
    author a;
    public book(int isbn,String title,String description,int price,author a)
    {
        this.isbn=isbn;
        this.title=title;
        this.description=description;
        this.price=price;
        this.a=a;
    }
    public void display()
    {
        System.out.println("The book number is :" + this.isbn);
        System.out.println("The title of the book is : "+ this.title);
        System.out.println("The description of the book is : "+ this.description);
        System.out.println("The price of the book : " + this.price);
        System.out.println("The name of the author is : " + a.aname);
        System.out.println("The pen name of the author is :"+ a.pname);
    }
    public int caldis(String description,int price)
    {
        if(this.description.equals("fiction"))
        {
            System.out.println("Price after discount is : ");
            price =(price*75)/100;
        }
        else
        {
            System.out.println("No discount ");
        }
        return(price);
    }
}
