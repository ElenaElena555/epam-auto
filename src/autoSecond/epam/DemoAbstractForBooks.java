package autoSecond.epam;

public class DemoAbstractForBooks extends Books{
    public static void main(String[] args) {
        AbstractClassForBooks abstractClassForBooks = new FromAbstract(true, 55);
        System.out.println(abstractClassForBooks);
        Books books = new Books(5,"Fiction");
     //   books.coulored
    }
}
