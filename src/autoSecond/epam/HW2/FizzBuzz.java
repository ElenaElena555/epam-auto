package autoSecond.epam.HW2;

public class FizzBuzz {
    public static void main(String[] args) {
//        Fizz-buzz : show 'fizz' if a number divisible by 3 ,
//                show 'buzz' if a number divisible by 5 ,
//                show 'fizz-buzz' if a number divisible by both
//        3 and 5
        fizzBuzz(15);
    }

    public static void fizzBuzz(int n) {
        if ((n % 5 == 0) && (n % 3 == 0)) {
            System.out.println("Fizz-Buzz");
        } else if (n % 5 == 0) {
            System.out.println("Buzz");
        } else if (n % 3 == 0) {
            System.out.println("Fizz");
        }
    }
}
