package autoSecond.epam;

public abstract class AbstractClassForBooks {
    protected boolean coloured;
    protected int countOfPages;

    abstract  void  getAbstractClassForBooks();
    abstract int getPosition();
    public AbstractClassForBooks(boolean coloured, int countOfPages){
        this.coloured = coloured;
        this.countOfPages = countOfPages;
    }
}
