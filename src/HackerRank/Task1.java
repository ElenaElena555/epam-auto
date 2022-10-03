package HackerRank;


import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        Conditions(N);
    }

    public static void Conditions(int N) {
        if ((N % 2 != 0))
                // && ((N>=1)&&(N<=100)))
        {
            System.out.println("Weird"); }
        else if ((N % 2 == 0) && ((2 <= N) && (N <= 5))) {
                System.out.println("Not Weird");
            } else if
            ((N % 2 == 0) && ((6 <= N) && (N <= 20))) {
                System.out.println("Weird");
            } else  if ((N % 2 == 0) && (N >= 20)) {
                System.out.println("Not Weird");
            }
        }
    }




