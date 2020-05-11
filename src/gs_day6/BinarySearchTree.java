package gs_day6;

public class BinarySearchTree {
	Node root;

	public static void main(String[] args) {
		
	BinarySearchTree tree = new BinarySearchTree();
		
	      /* Let us create following BST 
        50 
     /     \ 
    30      70 
   /  \    /  \ 
 20   40  60   80 */
	
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
		tree.preorder();
		
		System.out.println("\n\nPostorder repetrsentation");
		tree.postorder();

	}

	private void postorder() {
		postorder(root);
	}

	private void postorder(Node root2) {
		
		if (root != null) {
			preOrderRec(root.left);
			preOrderRec(root.right);
			System.out.print(root.data+" ");
		
		}
	}

	private void preorder() {
		preOrderRec(root);
		
	}

	private void preOrderRec(Node root) {
		if (root != null) {
			System.out.print(root.data+" ");
			preOrderRec(root.left);
			preOrderRec(root.right);
		}

		
	}

	private void inorder() {
		inorderRec(root);

	}

	private void inorderRec(Node root) {

		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.data+" ");
			inorderRec(root.right);
		}

	}

	// This method mainly calls insertRec()
	void insert(int data) {
		root = insertRec(root, data);
	}

	/* A recursive function to insert a new key in BST */
	Node insertRec(Node root, int data) {

		/* If the tree is empty, return a new node */
		if (root == null) {
			root = new Node(data);
			return root;
		}

		/* Otherwise, recur down the tree */
		if (data < root.data)
			root.left = insertRec(root.left, data);
		else if (data > root.data)
			root.right = insertRec(root.right, data);

		return root;
	}
}
