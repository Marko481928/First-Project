package ie.atu.opp.week1;

public class Book
{
    private final String title;
    private String author;
    private int pageCont;
    private BookStatus status;


    public Book(String title, String author, int pageCont)
    {
        this.title = title;
        this.author = author;
        this.pageCont = pageCont;
        this.status = BookStatus.AVAILABLE;
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

    public BookStatus getStatus()
    {
        return status;
    }

    public enum BookStatus
    {
        AVAILABLE,
        ON_LOAN
    }

    public void borrowBook() {
        if (status == BookStatus.ON_LOAN)
        {
            throw new IllegalStateException("Book is already on loan");
        }
        status = BookStatus.ON_LOAN;
    }
    public void returnBook()
    {
        if (status == BookStatus.AVAILABLE)
        {
            throw new IllegalStateException("Book is already available");
        }
        else
        {
            status = BookStatus.AVAILABLE;
        }
    }
}