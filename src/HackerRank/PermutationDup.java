package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationDup {

    private List<char []> myList = new ArrayList<char []>();

    public void permutation(String s) {
        char[] original = s.toCharArray();
        Arrays.sort(original);
        char[] clone = new char[s.length()];
        boolean[] mark = new boolean[s.length()];
        Arrays.fill(mark, false);
         permute(original, clone, mark, 0, s.length(),myList);
    }

    private void permute(char[] original, char[] clone, boolean[] mark, int length, int n,List<char[]> temp) {
        if (length == n) {
            System.out.println(clone);
            temp.add(clone);
            return ;
        }

        for (int i = 0; i < n; i++) {
            if (mark[i] == true) continue;
            // dont use this state. to keep order of duplicate character
            if (i > 0 && original[i] == original[i - 1] && mark[i - 1] == false) continue;
            mark[i] = true;
            clone[length] = original[i];
            permute(original, clone, mark, length + 1, n,myList);
       //
            mark[i] = false;
        }

     //
    }

    public static void main(String[] args) {
        PermutationDup p = new PermutationDup();
        p.permutation("1100");
      //  char[] m = {'0','0','1','1'};
       for(char[] temp : p.myList){
           System.out.print(temp);
       }
 //      System.out.print(p.s);
    }
}
