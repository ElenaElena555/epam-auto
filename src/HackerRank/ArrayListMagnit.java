package HackerRank;

import java.util.*;


public class ArrayListMagnit {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();

        a.add(0, "hull");
        a.add(1, "odin");
        a.add(2, "dva");
        a.add(3, "tri");
        printAL(a);
        if (a.contains("tri")) {
            a.add("chetire");
        }

        a.remove(2);
        printAL(a);
        if (a.indexOf("chetire") != 4) {
            a.add(4, "4.2");
        }
        printAL(a);
//        if (a.contains(("dva"))) {
//            a.add("2.2");
//        }
        printAL(a);
    }


    private static void printAL(ArrayList<String> al) {
        for (String element : al) {
            System.out.print(element + " ");}

            System.out.println();
        }
    }


