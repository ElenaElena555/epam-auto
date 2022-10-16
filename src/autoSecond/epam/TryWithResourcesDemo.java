package autoSecond.epam;

import java.io.*;

public class TryWithResourcesDemo extends Books implements Serializable {
    public static void main(String[] args) throws IOException {
        String address = "C:\\Users\\Elena_Sukhanova\\IdeaProjects\\EPAM-auto\\resources\\Draft.txt";
        Books books = new Books("War and Piece");
        Books books2 = new Books(3, "Harry Potter", 6);

        try { // Writing to file
            FileOutputStream to = new FileOutputStream(address);
            ObjectOutputStream x = new ObjectOutputStream(to);
            x.writeObject(books);
            x.writeObject(books2);
            x.close();
            to.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (MySecondExceprion e) {
            e.printStackTrace();
        }
        //Reading a file
        TryWithResourcesDemo demo = new TryWithResourcesDemo();
        demo.readBooks(address);

//      try{   FileInputStream to1 = new FileInputStream(address);
//          ObjectInputStream x1 = new ObjectInputStream(to1);
//      Books books3 =(Books)(x1.readObject());
//          System.out.println(books3);
//          to1.close();
//          x1.close();
//      }
//      catch (IOException | ClassNotFoundException e) {
//          e.printStackTrace();
//      }

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

//    public void writeToBooks(String path2) {
//        try (FileWriter fileWriter = new FileWriter(path2);
//        ) {
//            fileWriter.write(path2);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//          catch (MySecondExceprion e) {
//            e.printStackTrace();
//        }
//    }
}
