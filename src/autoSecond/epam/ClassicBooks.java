package autoSecond.epam;

public class ClassicBooks extends Books{
    public ClassicBooks(int amount, String name, int age){
        super(amount, name, age);
        System.out.println("ClassicBook (a,n) was caused");
    }
    public ClassicBooks(){
        System.out.println("ClassicBook () was caused");
    }


    public void author(){
        System.out.println("Classics");
    }
}
