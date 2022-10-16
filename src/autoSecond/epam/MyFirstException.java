package autoSecond.epam;

public class MyFirstException extends IllegalAccessError{
    public MyFirstException(){

    }
    public MyFirstException(String message){
        System.out.println("Illegal format of the file");
    }


}
