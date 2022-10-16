package HackerRank;

public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) {
                      System.out.println(beerNum + " " + word + " beer on stand");
            System.out.println(beerNum + " " + word + " beer");
            System.out.println("Take one");
            System.out.println("Go around");
            beerNum = beerNum - 1;
           if (beerNum == 1) {
                word = "bottle";
                if (beerNum > 0) {
                    System.out.println(beerNum + " " + word + " beer on stand");
                }
            } else {
                System.out.println("No beer on stand");
            }
        }
    }
}
