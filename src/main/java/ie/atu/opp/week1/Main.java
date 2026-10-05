package ie.atu.opp.week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args) {
        Book dune = new Book(
                "Dune", "Frank Herbert", 412);
        Book nineteenEightyFour = new Book(
                "1984", "George Orwell", 328);
        Book cleanCode = new Book(
                "Clean Code", "Robert C. Martin", 464);
        LibraryService service = new LibraryService();
        service.addBook(dune);
        service.addBook(nineteenEightyFour);
        service.addBook(cleanCode);
        System.out.println("Books: " + service.getBookCount());
        for (Book book : service.getAllBooks()) {
            System.out.println(book.getTitle());
        }
    }
}
