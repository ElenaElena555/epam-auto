package autoSecond.epam;

public class ClassicBooks extends Books{
    public ClassicBooks(int amount, String name){
        super(amount, name);
        System.out.println("ClassicBook (a,n) was caused");
    }
    public ClassicBooks(){
        System.out.println("ClassicBook () was caused");
    }


    public void author(){
        System.out.println("Classics");
    }
}
