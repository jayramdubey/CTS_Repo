package bTree;


public class FindTheBalanceBtree {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.right.right = new Node(5);

		if (isBalanced(root))
			System.out.println("Tree is balanced ");
		else
			System.out.println("Tree is not balanced ");

	}

	private static boolean isBalanced(Node root) {
		if (root == null) {
			return true;
		}
		int lh, rh;
		lh = height(root.left);
		rh = height(root.right);

		if (Math.abs(lh - rh) <= 1 && isBalanced(root.left) && isBalanced(root.right))
			return true;
		return false;
	}

	private static int height(Node root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(height(root.left), height(root.right));
	}

}
