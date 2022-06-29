import java.util.Scanner;

class RunAgainContainer {
    public boolean bool;
}

public class Main {
    public static void main(String[] args) {
        // your code here
        Scanner scanner = new Scanner(System.in);
        RunAgainContainer runAgain = new RunAgainContainer();

        Library library = new Library();
        runAgain.bool = true;

        while(runAgain.bool) {
            
            System.out.println("Hello to the Library! Would you like to add a book to the Library or find an existing book?");
            System.out.println("Enter 'x' to add a book to the Library");
            System.out.println("Enter 'o' to find an existing book");
            System.out.println("Enter 'g' to find all books of an exitsing genre :");
            String findOrAddResult = scanner.nextLine();

            // Adding A Book to the Library
            if (findOrAddResult.equals("x")) {

                System.out.println("What is the name of the book you are adding? :");
                String titleInput = scanner.nextLine();
                
                System.out.println("Great, now lets label the genre of this book.");
                System.out.println("What is the genre of this book? :");
                String genreInput = scanner.nextLine();

                System.out.println("Now all we need is the number of pages of this book, for good record keeping of course.");
                System.out.println("How many pages are in this book? :");
                int numPagesInput = scanner.nextInt();
                scanner.nextLine();

                System.out.println("We will now proceed to compile your book submission!");
                Book bookCompiled = new Book(titleInput, genreInput, numPagesInput);
                
                System.out.println("Your book is finished compiling! Lets take a look at it: ");
                System.out.println("Book Title: " + bookCompiled.getTitle());
                System.out.println("Book Genre: " + bookCompiled.getGenre());
                System.out.println("Book Page Length: " + bookCompiled.getNumPages());

                library.addBookToLibrary(bookCompiled);


                //  Run Again/Exit Process
                runAgainInstructions();
                String userReply = scanner.nextLine();
                runAgainFunc(userReply, runAgain);

            } else if (findOrAddResult.equals("o")) {

                System.out.println("Let's find the book you are looking for!");
                System.out.println("Enter the name of the book :");
                String bookTitleInput = scanner.nextLine();

                library.findExistingBook(bookTitleInput);

                runAgainInstructions();
                String userReply = scanner.nextLine();
                runAgainFunc(userReply, runAgain);
            }
            else if (findOrAddResult.equals("g")) {
                
                System.out.println("Please input the genre below to check if we have any books of that kiND :");
                String checkGenreInput = scanner.nextLine();

                library.findBooksOfAGenre(checkGenreInput);

                runAgainInstructions();
                String userReply = scanner.nextLine();
                runAgainFunc(userReply, runAgain);
            } 

        }
        scanner.close();
    }

    public static void runAgainFunc(String userChoice, RunAgainContainer runAgainBool) {
        if (userChoice.equals("x")) {
            runAgainBool.bool = true;
        }
        else {
            runAgainBool.bool = false;
            System.out.println("Thank you, Library is now finished!");
        }
    }

    public static void runAgainInstructions() {
        System.out.println("Would you like to start from the top?");
        System.out.println("Enter 'x' to create another book or find a book");
        System.out.println("Any Other Letter: Exit process");
    }
}