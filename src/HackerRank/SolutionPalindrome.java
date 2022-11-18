package HackerRank;

import java.util.Scanner;

public class SolutionPalindrome {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int p = A.length();

        for (int i = 0; i < (p / 2); i++) {
            if (A.charAt(i) != A.charAt(p - i - 1)) {
                System.out.println("No");
            } else System.out.println("True");

        }
    }
}

