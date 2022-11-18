package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Sold {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        Boolean retValue = false;
        if ((a != null) && (b != null)) {
            char[] arrayA = a.toLowerCase().toCharArray();
            char[] arrayB = b.toLowerCase().toCharArray();

            Arrays.sort(arrayA);
            Arrays.sort(arrayB);

            retValue = Arrays.equals(arrayA, arrayB);
            System.out.println(retValue);
        } else System.out.println("false");


    }
}




