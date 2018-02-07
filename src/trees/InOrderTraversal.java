package trees;

import java.util.Stack;

public class InOrderTraversal {
	public static void main(String[] args){
		GeneralNode node1 = new GeneralNode(10) ;		
		node1.insertLeft(20);
		node1.insertRight(30);
		node1.left.insertLeft(40);
		node1.left.insertRight(50);
		node1.right.insertLeft(60);
		node1.right.insertRight(70);
			
		inOrderTraversal(node1);
	}

	private static void inOrderTraversal(GeneralNode root) {
		Stack<GeneralNode> myStack = new Stack<GeneralNode>();
		while(true){
			if(root!=null){
				myStack.push(root);
				root = root.left;
			}else{
				if(myStack.isEmpty()) break;
				root = myStack.pop();
				System.out.println(root.val);	
				root = root.right;
			}
		}
		
	}
}
