package HackerRank;

import java.util.Scanner;

public class Task4LoopII {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            a += b * (int) Math.pow(2, i);
            System.out.print(a + " ");
        }
        System.out.println();

    }

}

