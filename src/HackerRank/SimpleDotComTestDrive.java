package HackerRank;

import java.util.Scanner;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userGuess = in.next();
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2,3,4};
        dot.setLocationCells(locations);
     //   String userGuess = "5";
        String result = dot.checkYourself(userGuess);

    }
}
