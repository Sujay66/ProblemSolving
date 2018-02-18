package Easy;

public class ReverseVowels {
    public static void main(String[] args){
        String s = "SujAy";
        String vowels = "aeiouAEIOU";
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            while(start<end && !(vowels.contains(s.charAt(start)+""))){
                start++;
            }
            while(start<end && !(vowels.contains(s.charAt(end)+""))){
                end--;
            }
               s = string_swap(s,start,end);
            start++;
            end--;
        }
        System.out.print(s);

    }
    private static String  string_swap(String str, int x, int y)
    {

        if( x < 0 || x >= str.length() || y < 0 || y >= str.length())
            return "Invalid index";

        char arr[] = str.toCharArray();
        char tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;

        return new String(arr);
    }
}
