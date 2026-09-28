package ie.atu.opp.week1;

public class Book
{
    private String title;
    private String author;
    private int pageCont;

    public Book(String title, String author, int pageCont)
    {
        this.title = title;
        this.author = author;
        this.pageCont = pageCont;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public int getPageCont()
    {
        return pageCont;
    }
}