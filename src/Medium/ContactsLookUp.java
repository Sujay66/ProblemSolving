package Medium;

import java.util.LinkedList;

public class ContactsLookUp {
    public static void main(String[] args){
        String digits = "234";
        LinkedList<String> ans = new LinkedList<String>();
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        for(int i =0; i<digits.length();i++){
            int x = Character.getNumericValue(digits.charAt(i));
            while(ans.peek().length()==i){
                String t = ans.remove();
                for(char s : mapping[x].toCharArray())
                    ans.add(t+s);
            }
        }
        int x = digits.charAt(2);
        System.out.print(x-48);
        for(String s: ans){
            System.out.println(s);
        }
    }
}
