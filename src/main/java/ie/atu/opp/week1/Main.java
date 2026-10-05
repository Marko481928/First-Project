package ie.atu.opp.week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args) {
        Book first = new Book("Dune", "Frank Herbert", 412);
        Book second = new Book("Clean Code", "Robert C. Martin", 464);
        LibraryService service = new LibraryService();

        service.addBook(first);
        service.addBook(second);
        System.out.println("Total books in Library Service is " + service.getBookCount());

        for(Book book : service.getAllBooks())
        {
            System.out.println(book.getTitle());
        }

    }
}
