package autoSecond.epam.HW5;

import autoSecond.epam.Books;

public class NestedDemo {
    public static void main(String[] args) {
Books books1 = new Books(1, "Sherlock Holmes", 4);
        Books books2 = new Books(3, "Agatha Christie", 3);
        Books books3 = new Books(9, "Idiot", 4);
        Books.AgeComparator ageComparator = new Books.AgeComparator();
        Books.NameComparator nameComparator = new Books.NameComparator();
        System.out.println(ageComparator.compare(books1, books3));
        System.out.println(nameComparator.compare(books1,books2));
    }
}
