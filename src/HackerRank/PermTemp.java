package HackerRank;

import java.util.*;

public class PermTemp {
    public static void main(String[] args) {
       List<Integer> myList = new ArrayList<Integer>();

       myList.add(1);
       myList.add(2);
       myList.add(3);
       myList.add(4);
        Collections.shuffle(myList);
        System.out.print(myList);
        Collections.shuffle(myList);
        System.out.print(myList);
        Collections.shuffle(myList);
        System.out.print(myList);
        Collections.shuffle(myList);
        System.out.print(myList);
        Collections.shuffle(myList);
        System.out.print(myList);
        Collections.shuffle(myList);
       System.out.print(myList);
    }
}
