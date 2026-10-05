# OOP Lab 1: Java Book Tracker

##Run
Open the project in IntelliJ with JDK 24 and run Main.java

##Object Model
Book defines an object of a book for output details
firstBook is a first object of a book class
secondBook is a second object of a book class
infoPrint() is a method of Book class which prints book details
borrowBook() is a method of Book class which verifies is the book available or not, if it's available method prints "book is borrowed" and after changes isAvailable value to false.

##Verification 

Book: Surrounded by Idiots
Book Author: Thomas Erikson
Book Page: 387
Is Book available? true
Book Borrowed


Book: The Lord of the Rings
Book Author: J.K. Rowling
Book Page: 387
Is Book available? false
Book Not Available


It displays details of each book/object, detects if the book available and allow or either don't allow to borrow a book. 


# OOP Lab 3: Java Book Tracker

##The JDK version and Java package.
Java version: 24, package: Maven

##Why the constructor checks for null before calling isBlank().
Because null checking if the variable is empty, if it's empty then condition is true, while isBlank() is checking rather
the variable has anything else except whitespace characters(such as spaces, tabs, newlines, etc).

##Why title, author and pageCount are final while status is not.
Because title, author and pageCount are not gonna change, that's why we give them a final 'state'(correct me if my term-
inology using is wrong), while status changes everytime by calling "borrowBook" or "returnBook".

##Why Book uses borrowBook and returnBook rather than a status setter.
Because both methods they complete not a single just status change, they have error message output and if-statement, which makes 
condition when status of a book is not allowed to change. That makes the program algorithm/system smarter and harder to fool.

##Which checks belong in Book and which belong in LibraryService.
Book checks the status of a field and protecting status from being invalid.
LibraryService involves Book entities and checks if the member reached max borrow limit, and if the boo is null while returnBook method called.

##The results of a successful loan, a rejected loan,
AVAILABLE
ON_LOAN
AVAILABLE
AVAILABLE
Loan days must be from 1 to 14
AVAILABLE
Exception in thread "main" java.lang.IllegalStateException: Book is already available
at ie.atu.opp.week1.Book.returnBook(Book.java:70)
at ie.atu.opp.week1.LibraryService.returnBook(LibraryService.java:27)
at ie.atu.opp.week1.Main.main(Main.java:31)

Process finished with exit code 1

##Maven build
/bin/sh /home/Anasui08/Downloads/idea-IU-262.10968.63/plugins/maven-plugin/lib/maven3/bin/mvn -Didea.version=2026.2.3 -Dmaven.ext.class.path=/home/Anasui08/Downloads/idea-IU-262.10968.63/plugins/maven-plugin/lib/intellij.maven.rt/maven-event-listener.jar -Djansi.passthrough=true -Dstyle.color=always -Dmaven.repo.local=/home/Anasui08/.m2/repository package -f pom.xml
[INFO] Scanning for projects...
[INFO]
[INFO] -------------------< ie.atu.opp.week1:book-tracker >--------------------
[INFO] Building book-tracker 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- resources:3.4.0:resources (default-resources) @ book-tracker ---
[INFO] skip non existing resourceDirectory /home/Anasui08/IdeaProjects/First-Project/src/main/resources
[INFO]
[INFO] --- compiler:3.15.0:compile (default-compile) @ book-tracker ---
[INFO] Nothing to compile - all classes are up to date.
[INFO]
[INFO] --- resources:3.4.0:testResources (default-testResources) @ book-tracker ---
[INFO] skip non existing resourceDirectory /home/Anasui08/IdeaProjects/First-Project/src/test/resources
[INFO]
[INFO] --- compiler:3.15.0:testCompile (default-testCompile) @ book-tracker ---
[INFO] No sources to compile
[INFO]
[INFO] --- surefire:3.5.4:test (default-test) @ book-tracker ---
[INFO] No tests to run.
[INFO]
[INFO] --- jar:3.5.0:jar (default-jar) @ book-tracker ---
[INFO] Building jar: /home/Anasui08/IdeaProjects/First-Project/target/book-tracker-1.0-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.720 s
[INFO] Finished at: 2026-10-04T19:18:52+01:00
[INFO] ------------------------------------------------------------------------


##Your debugger observations and any material AI assistance
If to use breakpoints which were given in previous steps(at service.loanBook(first, 7); and service.loanBook(first, 15);).
When you call loanBook the program checks loanBook method in LibraryService for if-statements conditions, is the book = null 
or if loanDays is below or above min/max days value. If all conditions are false then the program calls method borrowBook from Book class. 
If one of the conditions is true - it displays error message. 

I used AI only for answering few questions for better and deep understanding. All the code is written by me.