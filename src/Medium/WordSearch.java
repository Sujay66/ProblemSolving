package Medium;

import java.util.HashMap;

public class WordSearch {
    char[][] arr = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
    };
    boolean[][] visited = new boolean[arr.length][arr.length];
    public boolean containsWord(String s) {


        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr[i].length;j++){
                if(s.charAt(0) == arr[i][j] && search(arr,i,j,s,0) ){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean search(char[][] arr,int i, int j, String c,int index) {
        if(index == c.length()) return true;

        if(i>=arr.length || i<0 || j>=arr[i].length || j<0 || visited[i][j] || arr[i][j] != c.charAt(index)){
            return false;
        }

        visited[i][j] = true;

        if(search(arr,i+1,j,c,index+1) || search(arr,i-1,j,c,index+1) ||
                search(arr,i,j+1,c,index+1) || search(arr,i,j-1,c,index+1)){
            return true;
        }

        visited[i][j] = false;
        return false;

    }


    public static void main(String[] args){
        WordSearch wordSearch = new WordSearch();

       System.out.println(wordSearch.containsWord("SEE"));
    }
}
