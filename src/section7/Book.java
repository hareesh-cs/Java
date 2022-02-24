package section7;

public class Book {
    private String author;
    private String title;
    private String genre;
    private int numPages;

    public Book(String author , String title, String genre, int numPages){
        this.author=author;
        this.title=title;
        this.genre=genre;
        this.numPages=numPages;
    }

    public String getAuthor(){
        return author;
    }

    public String getTitle(){
        return title;
    }
    public String getGenre(){
        return title;
    }

    public int getNumPages(){
        return numPages;
    }

    public void printDetails(){
        System.out.println("Author of the book is "+author);
        System.out.println("Title of the book is "+title);
        System.out.println("Genre of the book is "+genre);
        System.out.println("Number of pages in the book are "+numPages);
        System.out.println();

    }
}
