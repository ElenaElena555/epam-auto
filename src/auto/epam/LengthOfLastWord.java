package auto.epam;

public class LengthOfLastWord {
    public static void main(String[] args) {

    }


    // Подскажите, пожалуйста, почему код не работает?
    public static int lengthOfLastWord(String s) {
        int length = s.length();
        int count = 0;
        int total = 0;
        for (int i = length; i < length - 1; i--) {
            if (s.charAt(i) == s.charAt(i))
                count++;
          else if (s.charAt(i) == ' ') {
                total = count;
                return total;
            }
        }

        return 0;
    }
}




