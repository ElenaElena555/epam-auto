package autoSecond.epam.HW7;

class MySecondException extends Exception {
    public MySecondException(MySecondException e) {

    }

    public MySecondException(String message) {
        super(message);
        System.out.println("File Not found");
    }
}
