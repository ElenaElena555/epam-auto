package HackerRank;

public class StaticSuper {
    static {
        System.out.println("Rodit static block");
    }

    StaticSuper() {
        System.out.println("Rodit konstructor");
    }
}

class StaticTest extends StaticSuper {
    static int rand;

    static {
        rand = (int) (Math.random() * 6);
        System.out.println("Static block" + rand);
    }

    StaticTest() {
        System.out.println("Konstructor");

    }

    public static void main(String[] args) {
        System.out.println("Vnutri main");
        StaticTest st = new StaticTest();
    }
}

