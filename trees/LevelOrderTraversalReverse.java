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
	GeneralNode node2 = new GeneralNode(20) ;
	GeneralNode node3 = new GeneralNode(30) ;
	GeneralNode node4 = new GeneralNode(40) ;
	GeneralNode node5 = new GeneralNode(50) ;
	GeneralNode node6 = new GeneralNode(60) ;
	GeneralNode node7 = new GeneralNode(70) ;
	
	node1.insertLeft(node2.val);
	node1.insertRight(node3.val);
	node2.insertLeft(node4.val);
	node2.insertRight(node5.val);
	node3.insertLeft(node6.val);
	node3.insertRight(node7.val);
		
/*	System.out.println((node2.left!=null));
	System.out.println((node2.right!=null));
	System.out.println((node3.left!=null));
	System.out.println((node3.right!=null));*/
	levelordertraversal(node1);
	}

	private static void levelordertraversal(GeneralNode root) {
		if(root == null) return ;
		Queue<GeneralNode> q = new LinkedList<GeneralNode>();
		q.add(root);
		
		while(!q.isEmpty()){
			System.out.println(q.size());
			root = q.poll();
			System.out.println(root.val);
			
			if(root.left!=null){
				q.add(root.left);
			}
			if(root.right!=null){
				q.add(root.right);
			}			
		}
		
	}
		
}
