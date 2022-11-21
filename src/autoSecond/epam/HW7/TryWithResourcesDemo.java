package autoSecond.epam.HW7;

import autoSecond.epam.Books;

import java.io.*;

public class TryWithResourcesDemo {

    public static void main(String[] args) throws MySecondException {
        String address = "C:\\Users\\Elena_Sukhanova\\IdeaProjects\\EPAM-auto\\resources\\Draft.txt";
        Books book1 = new Books("War and Piece");
        Books book2 = new Books(3, "Harry Potter", 6);


        try { // Writing to file
            FileOutputStream to = new FileOutputStream(address);
            ObjectOutputStream x = new ObjectOutputStream(to);
            x.writeObject(book1);
            x.writeObject(book2);
            to.close();


        }
          catch (FileNotFoundException e) {
            throw new MySecondException("ошибка");
          }
        catch (IOException e) {
            e.printStackTrace();
        }

        try { //Reading a file
            FileInputStream to1 = new FileInputStream(address);
            ObjectInputStream x1 = new ObjectInputStream(to1);
            Books book1restore = (Books) x1.readObject();
            Books book2restore = (Books) x1.readObject();
            System.out.println("The first object " + book1restore);
            System.out.println("The second object " + book2restore);
            to1.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


//Reading a file
        //    TryWithResourcesDemo demo = new TryWithResourcesDemo();
        //    demo.readBooks(address);
    }

    public void readBooks(String path) {
        try (FileReader fileReader = new FileReader(path);
             BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            System.out.println(bufferedReader.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyFirstException e) {
            e.printStackTrace();
        }
    }


}


