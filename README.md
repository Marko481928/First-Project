
# Lab 5 -- Exceptions and CSV Persistence

## Throw and catch

The throw statement is used inside the Book class when something is
wrong, for example if the title is empty or the page count is less
than 1. It throws an exception and stops that operation.

The catch block is used by the code that calls the method. It can
catch the exception and decide what to do, for example print an error
message. So throw sends the problem, and catch handles it.
Path.of(...), Path and Files

## Path.of("data", "books.csv") 
Creates a Path object for the location data/books.csv. It describes where the file should be, but it does not
create the file itself.

Path represents the file or folder location. One Path method used in
the lab is getFileName(), which gets the file name from the path.

Files is a utility class with methods for working with files and
folders. One Files method used in the lab is
Files.readAllLines(file), which reads the file lines into a list. The
lab also uses Files.write(...) and Files.createDirectories(...).
NumberFormatException and IOException

## NumberFormatException is unchecked. 
It can happen when Integer.parseInt(text) gets text that is not a valid integer, like
abc. Java does not force us to catch this exception at compile time.

## IOException is checked. File operations can cause this exception, for
example when loading or saving the CSV file fails. Java requires us to
catch it or declare it with throws.
Lab 5 and CSV persistence

## Lab 5 adds exception handling and CSV persistence to the Library
application. The books can be saved in data/books.csv and loaded again
when the program starts, so the data can stay after the program is
closed.

## How ON_LOAN is restored

When loading a row from the CSV file, the program checks if the saved
status is ON_LOAN. If it is, it calls book.borrowBook(). This
changes the status to ON_LOAN, so we do not need to add a
setStatus() method. The status is restored using the existing method
and the normal rules of the Book class.
AI assistance

## AI assistance

I used ChatGPT to help explain some Java concepts and to help draft this
README section. I checked the explanation against my Lab 5 code.
