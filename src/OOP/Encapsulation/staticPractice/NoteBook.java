package OOP.Encapsulation.staticPractice;

public class NoteBook extends  Book{//constructor
    public NoteBook(){
        super("Nova",500,19.98);
    }

    @Override
    public int getPageCount() {
        System.out.println("Success");
        return 200;
    }

    public static void main(String[] args) {
        Book book= new Book("Dream",100,12);

        System.out.println(book.pageCount);//100

        System.out.println("!"+book.getPageCount());//404

        NoteBook noteBook=new NoteBook();

        System.out.println("?"+noteBook.pageCount);//500
        System.out.println("$"+noteBook.getPageCount());//200

        System.out.println("===============");
        System.out.println(book.price);//12
        System.out.println(noteBook.price);//19.98

        Book b2 = new Book("Game",1000,130);

        System.out.println(book.price);//30
        System.out.println(noteBook.price);//30
        System.out.println(b2.price);//30

    }



}
