package auto.epam;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome("12345321"));
        //Вариант1
        Integer x = 1221;
        String s = String.valueOf(x);
        System.out.println(s.substring(0).equals(s.substring(3)));
    }


//    Вариант2    int count = 0;   - также не работает
//       for (int i = 0; i < args.length; i++) {
//           if (array[i] == array[array.length - 1])
//               count++;
//                if (count == 0) /{
//                 System.out.println("false");
//               }
//          } else {
//               System.out.println("true");
//
//        }
//       }


    //Вариант 3
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

