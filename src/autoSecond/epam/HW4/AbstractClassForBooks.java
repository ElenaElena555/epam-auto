package autoSecond.epam.HW4;

public abstract class AbstractClassForBooks {
    protected boolean coloured;
    protected int countOfPages;

     abstract void  getAbstractClassForBooks();
    abstract int getPosition();
    public AbstractClassForBooks(boolean coloured, int countOfPages){
        this.coloured = coloured;
        this.countOfPages = countOfPages;
    }
}
