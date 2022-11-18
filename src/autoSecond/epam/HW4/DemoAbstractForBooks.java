package autoSecond.epam.HW4;

import autoSecond.epam.Books;
import autoSecond.epam.HW4.AbstractClassForBooks;
import autoSecond.epam.HW4.FromAbstract;

public class DemoAbstractForBooks extends Books {
    public static void main(String[] args) {
        AbstractClassForBooks abstractClassForBooks = new FromAbstract(true, 55);
        System.out.println(abstractClassForBooks);
        Books books = new Books(5,"Fiction", 6);
     //   books.coulored
    }
}
