package autoSecond.epam.HW4;

import autoSecond.epam.Books;
import autoSecond.epam.HW4.UsingInterfaceForBooks;

public class DemoInterface extends Books {
    public static void main(String[] args) {
        UsingInterfaceForBooks usingInterfaceForBooks=new UsingInterfaceForBooks();
        usingInterfaceForBooks.moveDown();
        usingInterfaceForBooks.moveUp();
      }
}
