package auto2.epam;

public class Books {
    protected boolean o;
    private int amount;
    private String name;

    public int getAmount(int i) {
        return amount;
    }

    public String getName() {
        return name;
    }

    public void setAmount(int amount) {
        if ((amount > 0) && (amount < 100)) {
            this.amount = amount;
        } else {
            System.out.println("Invalid amount");

        }
    }

    public void changeName(String newName){
        this.name = newName;
        System.out.println(newName);
    }


    public void author() {
        System.out.println("Author!");
    }

    public final void setName(String name) {
        this.name = name;
    }



    public Books() {
        System.out.println("Book()");
    }

    Books(int weight, String name) {
        System.out.println("Book(a,n)");
        this.amount = weight;
        this.name = name;

    }

    Books(String name) {
        System.out.println("Book(n)");
        this.name = name;
    }
}
