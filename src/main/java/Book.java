public class Book {
    private String title;
    private Integer numPages;
    private String genre;
    

    public Book(String title, String genre, int numPages) {
        this.title = title;
        this.genre = genre;
        this.numPages = numPages;
    }
    
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getNumPages() {
        return numPages;
    }
}
