package autoSecond.epam.HW5;

import autoSecond.epam.Books;
import autoSecond.epam.HW4.InterfaceForBooks;

public class AnonymousDemo {
    public static void main(String[] args) {
        Books books = new Books(){

            @Override
            public void restorationIsNeeded() {
                System.out.println("Old");
            }
        };
        InterfaceForBooks interfaceForBooks = new InterfaceForBooks() {
            @Override
            public void moveDown() {
                System.out.println("Down");

            }

            @Override
            public void moveUp() {
                System.out.println("Up");

            }
        };
        books.restorationIsNeeded();
        interfaceForBooks.moveDown();
        interfaceForBooks.moveUp();
    }
}
