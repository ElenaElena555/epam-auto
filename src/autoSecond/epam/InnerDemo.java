package autoSecond.epam;

public class InnerDemo {
    public static void main(String[] args) {
      Books books = new Books(1, "Idiot", 5);
      Books.textOfBook textOfBook= books.new textOfBook("Russian", "Times New Roman", 12 );
        System.out.println(textOfBook);
    }

}
