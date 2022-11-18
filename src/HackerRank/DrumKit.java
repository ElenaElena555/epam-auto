package HackerRank;

class DrumKit {
    boolean topHat = true;
    boolean share = true;

    void playSnare() {
        System.out.println("buh buh ba-buh");
    }

    void playTopHat() {
        System.out.println("din din di-din");
    }
}
    class DrumkitTestDrive {
        public static void main(String[] args) {
            DrumKit d = new DrumKit();

            if (d.share == true){d.playSnare();};
            d.playTopHat();
            d.share=false;




        }
    }

