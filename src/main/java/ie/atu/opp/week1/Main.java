package ie.atu.opp.week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Book myBook = new Book("Dune", "Marko", 1);
        myBook.borrowBook();
        myBook.returnBook();
        try {
            myBook.returnBook();
        } catch (IllegalStateException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(myBook.getStatus());
    }

}
