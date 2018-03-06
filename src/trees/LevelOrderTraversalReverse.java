package trees;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

import javax.swing.tree.TreeNode;
import trees.GeneralNode;

public class LevelOrderTraversalReverse {
	public static void main(String[] args){
	GeneralNode node1 = new GeneralNode(10) ;
	
	node1.insertLeft(20);
	node1.insertRight(30);
	node1.getLeft().insertLeft(40);
	node1.getLeft().insertRight(50);
	node1.getRight().insertLeft(60);
	node1.getRight().insertRight(70);
		
	levelordertraversal(node1);
	}

	private static void levelordertraversal(GeneralNode root) {
		if(root == null) return ;
		Queue<GeneralNode> q = new LinkedList<GeneralNode>();
		q.add(root);
		
		while(!q.isEmpty()){
			root = q.poll();
			System.out.println(root.getVal());
			
			if(root.getLeft()!=null){
				q.add(root.getLeft());
			}
			if(root.getRight()!=null){
				q.add(root.getRight());
			}			
		}
		
	}
		
}
