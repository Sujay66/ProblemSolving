package trees;

public class GeneralNode {
	      private int val;
	      private GeneralNode left;
	      private GeneralNode right;
	      public GeneralNode() {	}
	      public GeneralNode(int x) { this.val = x; }

	      public int getVal(){ return this.val;}
	      
	      public void insertLeft(int value){
	    	  this.left = new GeneralNode(value);
	      }
	      public void insertRight(int value){
	    	  this.right = new GeneralNode(value);
	      }

	      public void setRight(GeneralNode x) {this.right = new GeneralNode(x.val);}
	      public void setLeft(GeneralNode x) {this.left = new GeneralNode(x.val);}

			public GeneralNode getLeft() {
				return left;
			}

	public GeneralNode getRight() {
		return right;
	}
	/*	      public void printTree(GeneralNode root){
			  if (root==null) return ;
			  printTree(root.left);
			  System.out.print(root.getVal() + "  ");
			  printTree(root.right);
		  }*/
}
