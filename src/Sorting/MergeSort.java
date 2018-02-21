package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class MergeSort {
    public static void main(String[] args){
        Integer[] nums = {100,95,98,1,10,35};
        Arrays.sort(nums, Collections.reverseOrder());
      //  mergeSort(nums);
        for(int j:nums){
            System.out.println(j);
        }
    }

    private static void mergeSort(int[] nums) {
        int n = nums.length;
        if(n<2) return ;
        int mid = n/2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[n - mid];
        System.arraycopy(nums,0,leftArray,0,mid);
        System.arraycopy(nums,mid,rightArray,0,n-mid);
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray,rightArray,nums);
    }

    private static void merge(int[] leftArray, int[] rightArray,int[] nums) {
        int k=0,l=0,r = 0;
        while(l<leftArray.length && r<rightArray.length){
            if(leftArray[l] < rightArray[r]){
                nums[k] = leftArray[l];
                l++;
                k++;
            }else{
                nums[k] = rightArray[r];
                r++;
                k++;
            }
        }
        while(l<leftArray.length){
            nums[k] = leftArray[l];
            l++;
            k++;
        }
        while(r<rightArray.length){
            nums[k] = rightArray[r];
            r++;
            k++;
        }
    }
}
