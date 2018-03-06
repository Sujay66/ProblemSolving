package Medium;

import trees.BinaryTree;
import trees.GeneralNode;

public class ConstructTreeInOrderPreOrder {
    private static int count ;
    public static void main(String[] args){

        BinaryTree b = new BinaryTree();
        int[] pre = {3,9,20,15,7};
        int[] in = {9,3,15,20,7};

/*        GeneralNode node1 = new GeneralNode(1);
        node1.setLeft(new GeneralNode(2));
        node1.setRight(new GeneralNode(3));
        node1.getLeft().setLeft(new GeneralNode(4));
        node1.getLeft().setRight(new GeneralNode(5));
        node1.getRight().setLeft(new GeneralNode(6));
        node1.getRight().setRight(new GeneralNode(7));*/
       /* GeneralNode temp = constructTree(pre,in,0,in.length-1);
        BinaryTree.preOrder(temp);*/
       System.out.println(count);

    }


    private static GeneralNode constructTree(int[] pre,int[] in,int start, int end){
            if(start>end) return null;

            GeneralNode rootNode = new GeneralNode(pre[count]);
            count++;

            if(start == end) return rootNode;

            int splitIndex = findIndex(in,start,end,rootNode);

            rootNode.setLeft(constructTree(pre,in,start,splitIndex-1));
            rootNode.setRight(constructTree(pre,in,splitIndex+1,end));

            return rootNode;

        }

        private static int findIndex(int[] inorder, int start, int end, GeneralNode root){
            int i;
            for( i=start;i<=end;i++){
                if(root.getVal() == inorder[i]) return i;
            }
            return i;
    }
}
