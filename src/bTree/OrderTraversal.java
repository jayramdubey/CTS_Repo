package bTree;

public class OrderTraversal {

	public static void main(String[] args) {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.right.right = new Node(5);
		System.out.println("In Order Traversal............. ");
		inOrderTrav(root);
		System.out.println("\nPre Order Traversal............ ");
		preOrderTrav(root);
		System.out.println("\nPost Order Traversal................ ");
		postOrderTrav(root);

	}

	private static void postOrderTrav(Node root) {
		if (root == null) {
			return;
		}

		postOrderTrav(root.left);
		postOrderTrav(root.right);
		System.out.print(root.data + " ");

	}

	private static void preOrderTrav(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrderTrav(root.left);
		preOrderTrav(root.right);
	}

	private static void inOrderTrav(Node root) {
		if (root == null) {
			return;
		}

		inOrderTrav(root.left);
		System.out.print(root.data + " ");
		inOrderTrav(root.right);

	}

}
