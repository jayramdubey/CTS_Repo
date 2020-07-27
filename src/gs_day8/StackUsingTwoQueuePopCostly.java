package gs_day8;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueuePopCostly {
	private Queue<Integer> q1 = new LinkedList<>();
	private Queue<Integer> q2 = new LinkedList<>();
	private int size = 0;

	private void push(int data) {

		q1.add(data);
		size++;

	}

	private int pop() throws Exception {
		if(q1.isEmpty()){
			throw new Exception("Stack is empty");
		}
		while(q1.size()!=1){
			q2.add(q1.remove());	
		}
		int result = q1.remove();
		Queue<Integer> tmp = q1;
		               q1 = q2;
		               q2 = tmp;
		       size--;

		return result;
	}

	public static void main(String[] args) throws Exception {
		StackUsingTwoQueuePopCostly obj = new StackUsingTwoQueuePopCostly();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.push(50);
		obj.push(60);

		System.out.println("Remove data from stack: " + obj.pop());
		System.out.println("Remove data from stack: " + obj.pop());
		System.out.println("Remove data from stack: " + obj.pop());
	}

}
