package section7;

public class BookDemo {
    public static void main(String[] args) {
        Book java = new Book("Hareesh","Java","Tech",100);
        Book physic = new Book("HC Verma","Physics", "physics",200);
        Book chem = new Book("Rs Aggarwal","Chemistry","chem",100);

        printDetails(java);
        printDetails(physic);
        printDetails(chem);


        java.printDetails();
        physic.printDetails();
        chem.printDetails();
    }
    public static void printDetails(Book book){
        System.out.println(book.getTitle());
        System.out.println("by "+ book.getAuthor());
        System.out.println("has "+book.getNumPages()+" pages, and it's genre is "+book.getGenre());
        System.out.println();
    }
}
