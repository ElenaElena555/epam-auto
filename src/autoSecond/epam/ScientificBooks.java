package autoSecond.epam;

public class ScientificBooks extends Books{
    ScientificBooks(int amount, String name, int age){
        super(amount, name, age);
        System.out.println("cientificBook (a,n) was caused");
    }
    public ScientificBooks(){
        System.out.println("cientificBook () was caused");
    }
    public void author(){
        System.out.println("Scientifics");
    }
}
