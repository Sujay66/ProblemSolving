package Easy;
import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public static void main(String[] args){
		
		List<List<Integer>> answer = new ArrayList<List<Integer>>();
		
		answer = generate(1);
	//	System.out.print(answer.get(0).size());
		for(int m=0;m<answer.size();m++){
			for(int n=0; n<answer.get(m).size();n++){
				System.out.print(answer.get(m).get(n));
			}
		}
	}
		
	
		 static List<List<Integer>> generate(int numRows) {
	        List<List<Integer>> finalList = new ArrayList<List<Integer>>();
	        ArrayList<Integer> intList = new ArrayList<Integer>();
	        if(numRows < 0){
	            return finalList;
	        }
	        
	        for(int i=0; i<numRows; i++){
	            int j = 0;
	            while(j<i+1){
	            intList.add(choose(i,j));
	                j++;
	            }  
	            System.out.print(intList.get(0));
	    finalList.add(intList);
	    System.out.print(finalList.get(0));
	    intList.clear();
	        }
	        return finalList;
	    }	
	    public static int choose(int n, int k){
	    if (k == 0) return 1;
	    return (n * choose(n - 1, k - 1)) / k;
	    }
}
