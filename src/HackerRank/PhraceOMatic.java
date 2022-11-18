package HackerRank;

public class PhraceOMatic {
    public static void main(String[] args) {
        String[] wordListOne={"red", "blue", "song", "five", "micro", "hello", "Max", "notebook","window"};
        String[] wordListTwo={"black", "table", "screen", "pool", "how", "winner", "plane", "shop"};
        String[] wordListThree={"fun", "window", "strange", "stone", "orange", "book", "cook", "car", "sofa"};

        int oneLength= wordListOne.length;
        int twoLength=wordListTwo.length;
        int threeLength=wordListThree.length;

        int gen1 = (int) (Math.random()*oneLength);
        int gen2 = (int) (Math.random()*twoLength);
        int gen3 = (int) (Math.random()*threeLength);

        String phrase = wordListOne[gen1]+" "+wordListTwo[gen2]+" "+wordListThree[gen3];

        System.out.println("All that we need is:"+phrase);
    }
}
