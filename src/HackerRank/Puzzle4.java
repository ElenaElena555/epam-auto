package HackerRank;

public class Puzzle4 {

    public static void main(String[] args) {
        Puzzle4b[] obs = new Puzzle4b[6];
        int y = 1;
        int x = 0;
        int result = 0;
        while (x < 6) {
            obs[x] = new Puzzle4b();
            obs[x].ivar = y; //100000
            y = y * 10;//1000000
            x = x + 1;//5
        }
        x = 6;
        while (x > 0) {
            x = x - 1; //1
            result = result + obs[x].doStuff(x);
        }//0
        System.out.println("Results" + " " + result);//543345

    }

    static class Puzzle4b {
        int ivar; //1

        public int doStuff(int factor) {
            if (ivar > 100) {
                return ivar * factor;
            } else {
                return ivar * (5 - factor);
            }


        }
    }
}





