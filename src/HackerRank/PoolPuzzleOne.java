package HackerRank;

public class PoolPuzzleOne {
    public static void main(String[] args) {
        int x = 0;
        while (x < 3) {
            x=x-1;
            if (x < 1) {
                System.out.print("a ");
                System.out.println("noise");
            }
           x=x+2;
            if (x > 3) {
                System.out.print("an");
                System.out.print("oyster");
            }
                  if (x == 1) {
           x=x-2;
            }
            if (x < 1) {
                System.out.print("annoys");
            }
            System.out.print("");

        }
    }
}
