package autoSecond.epam;

public final class ScientificBooks extends Books{
    String scienceName;

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
    public String getScientificAuthor(String scienceName){
        return scienceName;

    }
}
