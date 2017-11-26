package trees;

import java.util.ArrayList;

public class MinHeapTest {
	public static void main(String[] args){

		MinHeap myHeap = new MinHeap();
		for(int i=5;i>=0;i--){
			myHeap.add(i); 
		}
		
		myHeap.printHeap();
	}
}
