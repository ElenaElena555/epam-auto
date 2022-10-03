package HackerRank;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            //Complete this line
            int l = s1.length();
            if (s1.length() >= 15) {
                System.out.println(s1);
            } else if (s1.length() < 15) {
                int a = 15 - s1.length();
                for (int j = 0; j < a; j++) {
                    s1 = s1 + " ";
                }
                System.out.print(s1);
            }
            if (x >= 0 && x <= 9) {
                System.out.print("00" + x);
            } else if (x >= 10 && x <= 99) {
                System.out.print("0" + x);
            } else {
                System.out.print(x);
            }
            System.out.println();
        }
        System.out.println("================================");
    }
}




