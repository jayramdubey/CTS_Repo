package gs_day8;

import java.util.Stack;

/*enQueue(q,  x)
1) Push x to stack1 (assuming size of stacks is unlimited).
Here time complexity will be O(1)

deQueue(q)
1) If both stacks are empty then error.
2) If stack2 is empty
     While stack1 is not empty, push everything from stack1 to stack2.
3) Pop the element from stack2 and return it.
Here time complexity will be O(n)*/

public class QueueUsingStacks {

	Stack<Integer> stk1 = new Stack<>();
	Stack<Integer> stk2 = new Stack<>();
	int top = 0, top2 = 0;

	public static void main(String[] args) {
		QueueUsingStacks q = new QueueUsingStacks();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);

		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());

	}

	private void enQueue(int data) {
		stk1.push(data);
		top++;

	}

	private int deQueue() {
		if (stk2.size() == 0) {
			while (!stk1.isEmpty())
				stk2.add(stk1.pop());
		}
		int result = stk2.pop();
		return result;
	}

}
