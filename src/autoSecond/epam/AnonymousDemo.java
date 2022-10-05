package autoSecond.epam;

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
