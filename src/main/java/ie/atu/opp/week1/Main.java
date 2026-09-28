package ie.atu.opp.week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Book myBook = new Book("Dune", "Marko", 1);
        System.out.println(myBook.getStatus());
        myBook.borrowBook();
        System.out.println(myBook.getStatus());
        myBook.returnBook();
        System.out.println(myBook.getStatus());
    }
}