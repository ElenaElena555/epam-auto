package autoSecond.epam.HW4;

import autoSecond.epam.HW4.AbstractClassForBooks;

public class FromAbstract extends AbstractClassForBooks {


    public FromAbstract(boolean coloured, int countOfPages) {
        super(coloured, countOfPages);
    }

    @Override
    void getAbstractClassForBooks() {
        System.out.println("Books");
    }

    @Override
    int getPosition() {
        return 10;
    }

    @Override
    public String toString() {
        return String.format("FromAbstract{%s, %s}", coloured, countOfPages);
    }
}
