package auto2.epam;

public class ScientificBooks extends Books{
    ScientificBooks(int amount, String name){
        super(amount, name);
        System.out.println("cientificBook (a,n) was caused");
    }
    public ScientificBooks(){
        System.out.println("cientificBook () was caused");
    }
    public void author(){
        System.out.println("Scientifics");
    }
}
