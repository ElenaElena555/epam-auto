package HackerRank;

import java.util.Scanner;

public class Task6JavaInToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        try {
            String x = String.valueOf(t);
            System.out.println(" Good job");
        } catch (Exception e) {
            System.out.println(" Wrong answer");
        }


    }
}

