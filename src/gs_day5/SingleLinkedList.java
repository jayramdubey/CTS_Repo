package gs_day5;

import java.util.Scanner;

public class SingleLinkedList {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int num) {
			data = num;
			next = null;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		SingleLinkedList ob = new SingleLinkedList();
		System.out.println("Enter Number of Node for Insertion:->");
		int n = sc.nextInt();

		System.out.println("Enter element of LL Number:->");
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			ob.insert(num);
		}
		ob.insert_Beg(9);
		ob.insert_last(67);
		ob.insert_Pos(88);
		ob.print();
	}

	private void print() {
		Node tmp=head;
		while(tmp!=null){
			System.out.print(tmp.data+" ");
			tmp=tmp.next;
		}
		
	}

	private void insert_Pos(int val) {
		Node new_node = new Node(val);
		int pos=2;
		Node tmp=head;
		for(int i=1;i<pos;i++){
			tmp= tmp.next;
		}
		new_node.next=tmp.next;
		tmp.next=new_node;
		
	}

	private void insert_last(int val) {
		Node new_node = new Node(val);
		Node tmp=head;
		while(tmp.next!=null){
			tmp=tmp.next;
		}
		tmp.next=new_node;
		new_node.next=null;
		
	}

	private void insert_Beg(int val) {
		Node new_node = new Node(val);
		new_node.next=head;
		head=new_node;
		
	}

	private void insert(int num) {
		Node new_node = new Node(num);
		if (head == null) {
			head = new_node;
		}
		new_node.next = null;
		Node tmp = head;
		while (tmp.next != null) {
			tmp = tmp.next;
		}
		tmp.next = new_node;
		new_node.next = null;
	}

}
