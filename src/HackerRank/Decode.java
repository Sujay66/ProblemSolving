package HackerRank;

public class Decode {
    public static void main(String[] args){
        String x = "encoded password";
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        for(int i = 0;i<x.length();i++){
            char c = x.charAt(i);
            stringBuilder.append(c += c+i);
        }

        String temp = stringBuilder.toString();

        for(int i = 0;i<temp.length();i++){
            char c = temp.charAt(i);
            c=(char)((c-i)/2);
            stringBuilder2.append(c);
        }

        System.out.println(stringBuilder2.toString());
    }
}
