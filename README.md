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




# OOP Lab 3: Java Book Tracker

## Big updates 
Lab4 changes LibraryService from working with a single supplied book to owing a List<Book>. It's capable to do so
because 2 List packages were added, so we could use Array's Lists.

## What List<Book> tells the compiler. 
Basically it tells the Java compiler "The list will contain objects of type Book".

## Why final does not prevent books.add(...).
Because 'final' prevents from reassigning a variable, not modifying am object.
In out case books is a reference to a list, so we can't make it refer to a different list. 
When we use books.add() we're modifying the contents of existing list, which books refers to.

## Explain what the enhanced for loop variable represents.
It represents one individual book from the books list at a time

## What findBookByTitle returns for a known and an unknown title.
For an unknown title books it returns null and in Main Class if book equals null then it doesn't display that the book is found or not.
For a known title it returns the Book object and in Main Class the book not equal null and it displays the book title.

## Why removeBook reuses findBookByTitle instead of writing another search loop.
Because removeBook uses the same search principle and there's no point for writting another search loop, 
because findBookByTitle already perfectly suits for that. +, findBookByTitle returns only values and doesn't display anything.
If you want to remove a book and it doesn't exist, then findBookByTitle return null so that object doesn't exist, and obviously you can't remove.

## Which responsibilities belong to Main, LibraryService and Book.
Main - Create objects, call LibraryService and print results.
LibraryService - Own the List, find Books and check the loan-duration rule.
Book - Protect its own fields and decide whether borrowing or returning is allowed.

## Record BUILD SUCCESS, the final count and any material AI assistance used.
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
[INFO] Recompiling the module because of added or removed source files.
[INFO] Compiling 4 source files with javac [debug target 24] to target/classes
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
[INFO] Total time:  0.951 s
[INFO] Finished at: 2026-10-12T13:09:08+01:00
[INFO] ------------------------------------------------------------------------


/home/Anasui08/.jdks/temurin-24.0.2/bin/java -javaagent:/home/Anasui08/Downloads/idea-IU-262.10968.63/lib/idea_rt.jar=38761 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /home/Anasui08/IdeaProjects/First-Project/target/classes ie.atu.opp.week1.Main
Count: 3
Found: Dune
Loan Dune: true
Dune status: ON_LOAN
Loan missing: false
Return Dune: true
Dune status: AVAILABLE
Remove Clean Code: true
Final count: 2

Process finished with exit code 0

## AI content
I used AI only for explanation 3rd and 4th questions.