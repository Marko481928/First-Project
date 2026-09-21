package ie.atu.opp.week1;

public class Book
{
    public String title;
    public String author;
    public int pageCont;
    public boolean isAvailable = true;

    public void InfoPrint()
    {
        System.out.println("Book: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Page: " + pageCont);
        System.out.println("Is Book available? " + isAvailable);
    }
}

