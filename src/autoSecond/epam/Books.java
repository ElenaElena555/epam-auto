package autoSecond.epam;

public class Books {
    protected boolean o;
    private int amount;
    private String name;
    private int age;

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

    public void changeName(String newName) {
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

    Books(int weight, String name, int age) {
        System.out.println("Book(a,n)");
        this.amount = weight;
        this.name = name;
        this.age = age;

    }

    Books(String name) {
        System.out.println("Book(n)");
        this.name = name;
    }

    public class textOfBook {
        private String language;
        private String font;
        private int size;

        public textOfBook(String language, String font, int size) {
            this.language = language;
            this.font = font;
            this.size = size;
        }

        @Override
        public String toString() {
            return "textOfBook{" +
                    "language='" + language + '\'' +
                    ", font='" + font + '\'' +
                    ", size=" + size +
                    '}';
        }
    }

    public static class NameComparator {
        public boolean compare(Books books1, Books books2){
            return books1.name.equals(books2.name);

        }
    }
    public static class AgeComparator {
        public boolean compare(Books books1, Books books2){
            return books1.age == (books2.age);

        }
    }
    public void restorationIsNeeded() {

    }

}
