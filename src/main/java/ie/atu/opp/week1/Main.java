package ie.atu.opp.week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello OPP");

        Book firstBook = new Book();

        firstBook.title = "Surrounded by Idiots";
        firstBook.author = "Thomas Erikson";
        firstBook.pageCont = 387;

        firstBook.InfoPrint();

        Book secondBook = new Book();

        secondBook.title = "The Lord of the Rings";
        secondBook.author = "J.K. Rowling";
        secondBook.pageCont = 387;
        secondBook.InfoPrint();

        secondBook.InfoPrint();
    }
}