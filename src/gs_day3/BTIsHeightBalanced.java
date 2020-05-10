package gs_day3;

class Node {
	int data;
	Node left, right;

	Node(int d) {
		this.data = d;
		left = right = null;

	}
}

public class BTIsHeightBalanced {
	Node root;

	public static void main(String[] args) {
		BTIsHeightBalanced btree = new BTIsHeightBalanced();

		btree.root = new Node(1);
		btree.root.left = new Node(2);
		btree.root.left.left = new Node(3);
		btree.root.left.right = new Node(4);
		btree.root.right = new Node(5);
		btree.root.right.left = new Node(6);
		btree.root.right.right = new Node(7);
		if (btree.isBalanceOrNot(btree.root))
			System.out.println("Tree is balanced");
		else
			System.out.println("Tree is not balanced");
	}

	private boolean isBalanceOrNot(Node node) {

		if (node == null)
			return true;
		int lh, rh;
		lh = height(node.left);
		rh = height(node.right);
		if (Math.abs(lh - rh) <= 1 && isBalanceOrNot(node.left) && isBalanceOrNot(node.right)) {
			return true;
		}
		return false;
	}

	private int height(Node node) {
		if (node == null)
			return 0;

		return 1 + Math.max(height(node.left), height(node.left));
	}
}
