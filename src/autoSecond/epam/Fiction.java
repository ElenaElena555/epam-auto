package autoSecond.epam;

final class FictionBooks extends Books {
    public FictionBooks(int amount, String name) {
  super(amount, name);
        System.out.println("FictionBooks (a,n) was caused");
    }
    public void FictionBooks(){
        System.out.println("FictionBooks () was caused");
    }


    public void author(){
        System.out.println("Fictions");
    }
}

