package autoSecond.epam;

public class UsingInterfaceForBooks implements InterfaceForBooks{
    @Override
    public void moveDown() {
        System.out.println("End of the book");

    }

    @Override
    public void moveUp() {
        System.out.println("The beginning of the book");

    }
}
