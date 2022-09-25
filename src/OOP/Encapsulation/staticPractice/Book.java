package OOP.Encapsulation.staticPractice;

public class Book {
    String title;
    int pageCount;
    double price;

    public Book(String title, int pageCount, double price) {
        this.title = title;
        this.pageCount = pageCount;
        this.price = price;
    }

    public int getPageCount() {
        System.out.println("Page not found");
        return 404;
    }
}
