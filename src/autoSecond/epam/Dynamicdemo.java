package autoSecond.epam;

public class Dynamicdemo {
    public static void main(String[] args) {
        Books books = new Books(5,"Fiction", 7);
        ClassicBooks classicBooks = new ClassicBooks(1, "Idiot", 0);
        ScientificBooks scientificBooks = new ScientificBooks(1, "Harry Potter", 222);
        books.author();
        classicBooks.author();
        scientificBooks.author();
        FictionBooks fictionBooks= new FictionBooks(2, "Avatar", 99);
        fictionBooks.author();
        fictionBooks.setName("Avatar");
        System.out.println(String.format("%s | %s", fictionBooks.getAmount(1), fictionBooks.getName() ));
    }
}
