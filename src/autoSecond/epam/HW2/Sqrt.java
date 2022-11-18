package autoSecond.epam.HW2;

public class Sqrt {
    public static void main(String[] args) {
// Input: x = 4
//Output: 2
        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x) {
        double newS = x;
        if (newS % 2 == 0) {
            newS = Math.sqrt(x);
            return (int) newS;
        }
        return 0;
    }
}


