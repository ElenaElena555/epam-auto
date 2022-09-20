package Encapsulation;


import auto2.epam.ClassicBooks;

public class EncapsulationDemo extends Encapsulation{
    public static void main(String[] args) {
      //Encapsulation encapsulation = new Encapsulation();
      //  System.out.println(encapsulation.i);

        ClassicBooks classicBooks = new ClassicBooks();
        classicBooks.setAmount(-10);
        classicBooks.setName("Harry Potter");
        System.out.println(String.format("%s | %s", classicBooks.getAmount(-10), classicBooks.getName() ));
    }
}
