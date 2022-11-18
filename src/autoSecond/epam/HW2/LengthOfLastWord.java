package autoSecond.epam.HW2;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord1("Hello world"));

    }

    public static int lengthOfLastWord1(String s) {
        int count = 0;
        int start = s.length() - 1;
        for (int i = start; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        return count;
    }
}





