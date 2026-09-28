package ie.atu.opp.week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Book book = new Book("Dune", "Frank Herbert", 412);
        System.out.println("[" + book.getTitle() + "]");
        System.out.println("[" + book.getAuthor() + "]");
    }
}
