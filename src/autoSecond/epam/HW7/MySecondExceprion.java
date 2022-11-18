package autoSecond.epam.HW7;

public class MySecondExceprion extends Exception{
    public MySecondExceprion(){

    }
    public MySecondExceprion(String message){
        System.out.println("File Not found");
    }
}
