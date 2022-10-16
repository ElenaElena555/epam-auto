package HackerRank;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
//   Scanner sc = new Scanner(System.in);
//        System.out.println("================================");
//        String [] splitLine;
//        String s;
//        int i;
//        while(sc.hasNextLine()){
//            splitLine = sc.nextLine().split(" ");
//            s = splitLine[0];
//            i = Integer.parseInt(splitLine[1]);
//            System.out.printf("%-15s%03d\n",s,i);
//        }
//        System.out.println("================================");
//        sc.close();
//    }
//
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        String [] splitLine;
        String s;
        int i;
        while(sc.hasNextLine()){
            splitLine = sc.nextLine().split(" ");
            s = splitLine[0];
            i = Integer.parseInt(splitLine[1]);
            System.out.printf("%-15s%03d\n",s,i);
        }
        System.out.println("================================");
        sc.close();
    }
}



