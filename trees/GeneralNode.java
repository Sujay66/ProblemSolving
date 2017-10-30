package trees;

public class GeneralNode {
	      int val;
	      GeneralNode left;
	      GeneralNode right;
	      public GeneralNode() {	}
	      GeneralNode(int x) { val = x;
	      
	     
	      }
	      
	      public void insertLeft(int value){
	    	  this.left = new GeneralNode();
	    	  this.left.val = value;
	      }
	      public void insertRight(int value){
	    	  this.right = new GeneralNode();
	    	  this.right.val = value;
	      }
}
