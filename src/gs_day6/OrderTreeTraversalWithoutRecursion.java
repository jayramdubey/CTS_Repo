package gs_day6;

import java.util.Stack;

public class OrderTreeTraversalWithoutRecursion {
	Node root;
	Stack<Integer> stack= new Stack<Integer>();

	public static void main(String[] args) {
		
		

		OrderTreeTraversalWithoutRecursion tree = new OrderTreeTraversalWithoutRecursion();

		/*
		 * Let us create following BST 50 / \ 30 70 / \ / \ 20 40 60 80
		 */

		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);

		System.out.println("Inorder repetrsentation");
		tree.inorder();

		System.out.println("\n\nPreorder repetrsentation");
		//tree.preorder();

		System.out.println("\n\nPostorder repetrsentation");
		//tree.postorder();

	}

	private void inorder() {
		inorderRec(root);
	}

	private void inorderRec(Node root) {
       if(root== null){
    	   System.out.println("Tree is empty ");
    	   return;  
       }
    	  
       while(!stack.isEmpty()){
    	   while(root.left != null){
    		   stack.push(root.data);
    		   root= root.left;
    	   }
    	   while(root.right != null)
    	   {
    		   System.out.println(" "+ root.data);
    		   if(stack.isEmpty())
    			   return;
    		   //root = stack.pop();
    	   }
    	   
       }
		
	}

	private void insert(int data) {
		insertRec(root, data);

	}

	private Node insertRec(Node root, int data) {

		if (root == null) {
			root = new Node(data);
		}

		if (data < root.data) {
			root.left = insertRec(root.left, data);
		} else if (data > root.data) {
			root.right = insertRec(root.right, data);
		}

		return root;
	}
}
