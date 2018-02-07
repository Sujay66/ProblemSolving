package Medium;

import java.util.Arrays;
import java.util.Random;

import Arrays.ShuffleArray;

public class CallShuffleArray {
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6};
		ShuffleArray myArray = new ShuffleArray(arr);

		System.out.println(Arrays.toString(myArray.shuffle()));
		System.out.println(Arrays.toString(myArray.reset()));
		System.out.println(Arrays.toString(myArray.shuffle()));
		System.out.println(Arrays.toString(myArray.reset()));
	}
}
