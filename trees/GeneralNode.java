package trees;

public class GeneralNode {
	      int val;
	      GeneralNode left;
	      GeneralNode right;
	      public GeneralNode() {	}
	      GeneralNode(int x) { this.val = x; }
	      
	      public void insertLeft(int value){
	    	  this.left = new GeneralNode(value);
	      }
	      public void insertRight(int value){
	    	  this.right = new GeneralNode(value);
	      }
}
