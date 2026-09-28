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
        if(title == null || title.isBlank())
        {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }

        if(author == null || author.isBlank())
        {
            throw new IllegalArgumentException("Author cannot be null or empty");
        }

        if(pageCont <1)
        {
            throw new IllegalArgumentException("Page cannot be less than 1");
        }
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