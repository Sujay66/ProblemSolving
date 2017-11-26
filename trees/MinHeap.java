package trees;

import java.util.ArrayList;
import java.util.Arrays;

public class MinHeap {
	private int capacity = 10;
	private int size = 0;
	int itemsArray[] = new int[capacity];
	//public ArrayList<Integer> items = new ArrayList<>();
	
	public MinHeap(){};
	public MinHeap(int[] temp){
		itemsArray = temp;
	}
	
	public void printHeap(){
		for(int i=0;i<size;i++){
			System.out.println(itemsArray[i]);
		}
	}
	public int getParentIndex(int childIndex){
		if(childIndex == 0) return 0;
		return (childIndex-1)/2;
	}
	public int getLeftChildIndex(int parentIndex){
		return 2*parentIndex + 1;
	}
	public int getRightChildIndex(int parentIndex){
		return 2*parentIndex + 2;
	}
	public boolean hasLeftChild(int parentIndex){
		return getLeftChildIndex( parentIndex) < size;
	}
	public boolean hasRightChild(int parentIndex){
		return getRightChildIndex( parentIndex) < size;
	}
	public boolean hasParent(int childIndex){
		return getParentIndex(childIndex) >= 0;
	}
	public int getRightChild(int index){
		return itemsArray[getRightChildIndex(index)];
	}
	public int getLeftChild(int index){
		return itemsArray[getLeftChildIndex(index)];
	}
	public int getParent(int index){
		return itemsArray[getParentIndex(index)];
	}
	public void swap(int indexOne, int indexTwo){
		int temp = itemsArray[indexOne];
		itemsArray[indexOne] = itemsArray[indexTwo];
		itemsArray[indexTwo] = temp;
	}
	
	public void ensureCapacity(){
		if(size == capacity){
			itemsArray = Arrays.copyOf(itemsArray, capacity*2);
			capacity = capacity * 2;
		}		
	}
	
	public int peek(){
		if(size==0) throw new IllegalStateException();
		return itemsArray[0];
	}
	
	public int poll(){
		if(size==0) throw new IllegalStateException();
		int item = itemsArray[0];
		itemsArray[0] = itemsArray[size-1];
		size--;
		heapifyDown();
		return item;
	}
	
	public void heapifyDown() {
		int index = 0;
		while(hasLeftChild(index)){
			int smallChildIndex = getLeftChildIndex(index);
			if(hasRightChild(index) && getRightChild(index) < getLeftChild(index)){
				smallChildIndex = getRightChildIndex(index);
			}
			
			if(itemsArray[index]< itemsArray[smallChildIndex]){
				break;
			}else{
				swap(index,smallChildIndex);
			}
			index = smallChildIndex;
		}
		
	}
	public void add(int item){
		ensureCapacity();
		itemsArray[size]=item;
		size++;
		heapifyUp();
	}
	public void heapifyUp() {
		int item = size-1;
		while(hasParent(item) && getParent(item)>itemsArray[item]){
			swap(getParentIndex(item),item);
			item = getParent(item);
		}
	}
	
	
}
