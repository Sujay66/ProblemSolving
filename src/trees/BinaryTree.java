package trees;

public class BinaryTree {
    GeneralNode root;
    BinaryTree (int val) {
        root = new GeneralNode(val);
    }
    public BinaryTree() {
        root = null;
    }

    public static void preOrder(GeneralNode node) {
        if (node == null) return;
        System.out.print(node.getVal() + " ");
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }
}
