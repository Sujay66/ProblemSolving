package DataStructures;

import java.util.Arrays;

public class MinHeap {
    private int capacity = 5;
    private int size = 0;
    int[] items = new int[capacity];

    private int getLeftChild(int parentIndex){
        return 2 * parentIndex + 1;
    }

    private int getRightChild(int parentIndex){
        return 2* parentIndex + 2;
    }

    private int getParentIndex(int childIndex){
        return (childIndex - 1)/2;
    }

    private boolean hasLeftChild(int index){
        return getLeftChild(index) < size ;
    }

    private boolean hasRightChild(int index){
        return getRightChild(index) < size;
    }

    private boolean hasParent(int index){
        return getParentIndex(index) >= 0;
    }

    private int leftChild(int index){
        return items[getLeftChild(index)];
    }

    private int rightChild(int index){
        return items[getRightChild(index)];
    }

    private int parent(int index){
        return items[getParentIndex(index)];
    }

    private void swap(int indexOne, int indexTwo){
        int temp = items[indexOne];
        items[indexOne]=items[indexTwo];
        items[indexTwo] = temp;
    }

    private void ensureCapacity(){
        if(size == capacity){
            items = Arrays.copyOf(items,capacity * 2);
            capacity = capacity * 2;
        }
    }

    public int peek(){
        if(size == 0) throw new IllegalStateException();
        return items[0];
    }
    public int poll(){
        if(size == 0) throw new IllegalStateException();
        int item = items[0];
        items[0] = items[size-1];
        size--;
        heapifyDown();
        return item;
    }
    public void add(int item){
        ensureCapacity();
        items[size] = item;
        size++;
        heapifyUp();
    }

    public void heapifyDown(){
        int index = 0;
        while(hasLeftChild(index)){
            int smallerChildIndex = getLeftChild(index);
            if(hasRightChild(index) && rightChild(index) < leftChild(index)){
                smallerChildIndex = getRightChild(index);
            }
            if(items[index] < items[smallerChildIndex]){
                break;
            }else{
                swap(index,smallerChildIndex);
            }
            index = smallerChildIndex;
        }
    }
    public void heapifyUp(){
        int index = size-1;
        while (hasParent(index) && parent(index) > items[index]){
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    public void printHeap(){
        for(int i:items){
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        MinHeap heap = new MinHeap();
        for(int i=1;i<6;i++){
            heap.add(i);
        }
        heap.printHeap();
    }
}
