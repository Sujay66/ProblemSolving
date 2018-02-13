package HackerRank;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        String input = "sujay is a a a";
        String finalString = "";
        String temp = "";
        List<String> myList = new ArrayList<String>();
        for (int j = 0; j < input.length(); j++) {
            if (input.charAt(j) == ' ' || input.charAt(j) == '\0') {
                myList.add(temp);
                temp = "";
            } else {
                temp += input.charAt(j);
            }
        }
        int index = input.lastIndexOf(temp);
        myList.add(input.substring(index));
        for (String part : myList) {
            for (int i = part.length() - 1; i >= 0; i--) {
                finalString = finalString + part.charAt(i);
            }
            finalString = finalString + " ";
        }
        System.out.print(input.length());
    }
}
