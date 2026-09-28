package ie.atu.opp.week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        LibraryService service = new LibraryService();
        try
        {
            service.loanBook(null, 7);
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }
        try
        {
            service.returnBook(null);
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
