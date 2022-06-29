
import java.util.Set;
import  java.util.HashSet;
import java.util.HashMap;

public class Library {
    HashMap<String, Book> library = new HashMap<String, Book>();

    Set<String> uniqueGenres = new HashSet<String>();


    public void addBookToLibrary(Book bookToAdd) {
        library.put(bookToAdd.getTitle(), bookToAdd);
        System.out.println("The book " + bookToAdd.getTitle() + " has been added to the library!");

        uniqueGenres.add(bookToAdd.getGenre());
        System.out.println("The genre " + bookToAdd.getGenre() + " has been added to the library");



        System.out.println("The following books and genres are now in the library: ");
        for (String bookTitle : library.keySet() ) {
            System.out.println(bookTitle);
        }
        System.out.println("Available Genres: " + uniqueGenres);
        System.out.println("____________________________");
        

    }

    public void findExistingBook(String bookTitleInput) {
        
        Book bookResult = library.get(bookTitleInput);
        
        if (bookResult == null) {
            System.out.println("Hmmmm... Not sure if we have that one!");
            System.out.println("You should consider adding it to the list!");

        }
        else {
            System.out.println("We have found the book you are looking for!");
            System.out.println("Here are the details: ");
            System.out.println("Book Title: " + bookResult.getTitle());
            System.out.println("Book Genre: " + bookResult.getGenre());
            System.out.println("Book Length: " + bookResult.getNumPages());
        }

    }

    public void findBooksOfAGenre(String bookGenreInput) {
        System.out.println("Checking to see if we have books in that genre...");
        String check = bookGenreInput;

        System.out.println("Library contains " + bookGenreInput + " is " + uniqueGenres.contains(check));
    }
}
