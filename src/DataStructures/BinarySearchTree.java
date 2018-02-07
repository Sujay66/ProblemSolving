package DataStructures;

public class BinarySearchTree {
    private BinarySearchTree leftNode;
    private BinarySearchTree rightNode;
    private int val;

    public BinarySearchTree(){

    }

    public BinarySearchTree(int x){
        this.val = x;
        this.leftNode = null;
        this.rightNode = null;
    }
    public boolean hasLeftChild(BinarySearchTree node){
        return node.leftNode!=null;
    }
    public boolean hasRightChild(BinarySearchTree node){
        return node.rightNode!=null;
    }
    public void setLeftNode(BinarySearchTree node){
        this.leftNode = node;
    }
    public void setRightNode(BinarySearchTree node){
        this.rightNode = node;
    }
    public void insertNode(int value){
        BinarySearchTree tempNode = new BinarySearchTree(value);
    }
}
