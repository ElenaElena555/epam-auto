package HackerRank;

public class EchoTestDrive {
    public static void main(String[] args) {
        Echo e1 = new Echo();
        Echo e2 = new Echo();
        int x = 0;
        while (x < 4) {
            e1.hello();
            e1.count = e1.count + 1; // 1 1, 2 3, 3 6, 4 10
            if (x < 4) {
                e2.count = e2.count + e1.count;
                e2.count = e2.count + e1.count;
                e2.count = e2.count + 1;
            }
            if (e2 == e1) {
                e2.count = e2.count + 1;
            }
            x = x + 1;
        }
        System.out.println(e2.count);


    }

    static class Echo {
        int count = 0;

        void hello() {
            System.out.println("heloooooooo....");
        }
    }
}
