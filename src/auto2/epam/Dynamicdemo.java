package auto2.epam;

public class Dynamicdemo {
    public static void main(String[] args) {
        Books books = new Books(5,"Fiction");
        ClassicBooks classicBooks = new ClassicBooks(1, "Idiot");
        ScientificBooks scientificBooks = new ScientificBooks(1, "Harry Potter");
        books.author();
        classicBooks.author();
        scientificBooks.author();
        FictionBooks fictionBooks= new FictionBooks(2, "Avatar");
        fictionBooks.author();
        fictionBooks.setName("Avatar");
        System.out.println(String.format("%s | %s", fictionBooks.getAmount(1), fictionBooks.getName() ));
    }
}
