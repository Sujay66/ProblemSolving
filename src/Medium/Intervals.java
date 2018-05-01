package Medium;

import java.util.*;

public class Intervals {
    int start;
    int end;
      Intervals() { start = 0; end = 0; }
     Intervals(int s, int e) { start = s; end = e; }

     public static void main(String[] args){
         Stack<Intervals> intervals = new Stack<>();
          List<Intervals> myList = new ArrayList<>();
          myList.add(new Intervals(1,4));
          myList.add(new Intervals(2,3));
          myList.add(new Intervals(8,10));
          myList.add(new Intervals(15,18));

         Collections.sort(myList, new Comparator<Intervals>() {
             @Override
             public int compare(Intervals o1, Intervals o2) {
              return Integer.compare(o1.start,o2.start);
             }
         });

         intervals.push(myList.get(0));
         for(int i=1;i<myList.size();i++){
             Intervals top = intervals.peek();
             Intervals cur = myList.get(i);
             if(cur.start > top.end){
                 intervals.push(cur);
             }else{
                 top.end = (top.end >cur.end ? top.end : cur.end);
             }
         }

         Collections.reverse(myList);
         for(Intervals i:intervals){
             System.out.print(i.start);
             System.out.print(i.end);
             System.out.println();
         }
     }
}