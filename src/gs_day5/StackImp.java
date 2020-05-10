package gs_day5;

public class StackImp {
	int top = -1;
	int max = 10;
	int item[] = new int[max - 1];

	public void push(int val) {
		if (top == max) {
			System.out.println("overflow");
		}
		item[++top] = val;
	}
	 
	public int pop(){
		int result =0;
		if(top==-1){
			System.out.println("under flow");
		}
		result = item[top];
		top--;
		return result;
	}

	public static void main(String[] args) {
		StackImp obj = new StackImp();
		obj.push(5);
		obj.pop();
		int popElement= obj.pop();
		System.out.println("Pop element: "+ popElement);
		obj.print();

	}

	private void print() {
		for (int i = top; i >= 0; i--) {
			System.out.println(item[i]);
		}

	}

}
