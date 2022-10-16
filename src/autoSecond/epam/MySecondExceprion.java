package autoSecond.epam;

public class MySecondExceprion extends ClassNotFoundException{
    public MySecondExceprion(){

    }
    public MySecondExceprion(String message){
        System.out.println("File Not found");
    }
}
