package auto.epam;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome("12344321"));

    }


    //Вариант 3(корректный)
    public static boolean isPalindrome(String word) {
        int palin = word.length();
        for (int i = 0; i < (palin / 2); i++) {
            if (word.charAt(i) != word.charAt(palin - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

